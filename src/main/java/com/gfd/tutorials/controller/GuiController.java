package com.gfd.tutorials.controller;

import com.gfd.tutorials.dto.EmailDto;
import com.gfd.tutorials.dto.PhoneDto;
import com.gfd.tutorials.dto.UserCompleteInformationDto;
import com.gfd.tutorials.mapper.UserCompleteInformationMapper;
import com.gfd.tutorials.model.Email;
import com.gfd.tutorials.model.User;
import com.gfd.tutorials.service.EmailService;
import com.gfd.tutorials.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
public class GuiController {
    @Autowired
    UserService userService;
    @Autowired
    EmailService emailService;
    @Autowired
    UserCompleteInformationMapper userCompleteInformationMapper;

    @GetMapping("/")
    public String viewHomePage(Model model){
        List<User> users = userService.findAll();
        List<UserCompleteInformationDto> userCompleteInformationDtos = new ArrayList<>();;
        Set<EmailDto> emailDtos = new HashSet<>();
        Set<PhoneDto> phoneDtos = new HashSet<>();
        users.forEach(user -> {
            userCompleteInformationDtos.add(userCompleteInformationMapper.userToUserDto(user));
        });

        for(UserCompleteInformationDto userCompleteInformationDto : userCompleteInformationDtos){
            emailDtos = userCompleteInformationDto.getEmails();
            phoneDtos = userCompleteInformationDto.getPhones();
        }
        model.addAttribute("listUsers", userCompleteInformationDtos);
        model.addAttribute("listEmails", emailDtos);
        model.addAttribute("listPhones", phoneDtos);
        return "index";
    }

    @GetMapping("/showNewUserForm")
    public String showNewUserForm(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "new_user";
    }

    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("user") User user){
        userService.saveUser(user);
        return "redirect:/";
    }

    @GetMapping("/showFormForUpdate/{userCode}")
    public String showFormForUpdate(@PathVariable(value = "userCode") String userCode, Model model){
        User user = userService.findByUserCode(userCode);
        model.addAttribute("user", user);
        return "update_user";
    }

    @GetMapping("/deleteUser/{userCode}")
    public String deleteUser(@PathVariable(value = "userCode") String userCode){
        this.userService.deleteById(userService.findByUserCode(userCode).getId());
        return "redirect:/";
    }

    @GetMapping("/showNewEmailForm{userCode}")
    public String showNewEmailForm(Model model, @PathVariable(value = "userCode") String userCode){
        Email email = new Email();
        email.setUser(userService.findByUserCode(userCode));
        model.addAttribute("email", email);
        return "new_email";
    }

    @PostMapping("/saveEmail")
    public String saveEmail(@ModelAttribute("email") Email email){
        emailService.saveEmail(email);
        return "redirect:/";
    }
}
