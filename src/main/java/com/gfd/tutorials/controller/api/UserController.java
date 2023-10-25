package com.gfd.tutorials.controller.api;

import java.util.List;

import com.gfd.tutorials.dto.UserCompleteInformationDto;
import com.gfd.tutorials.dto.UserDto;
import com.gfd.tutorials.mapper.UserCompleteInformationMapper;
import com.gfd.tutorials.mapper.UserMapper;
import jakarta.validation.Valid;
import org.apache.commons.lang3.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.gfd.tutorials.model.User;
import com.gfd.tutorials.service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/tutorials/api/users")
public class UserController {
	@Autowired
	UserService userService;

	@Autowired
	UserMapper userMapper;

	@Autowired
	UserCompleteInformationMapper userCompleteInformationMapper;

	@Operation(summary = "Create a new User", description = "The user must not exist")
	@ApiResponses(value = 
		{	
			@ApiResponse
			(
				responseCode = "200", 
				description = "A new user is created",
				content = 
				{
					@Content
					(
						mediaType = "application/json",
						schema = @Schema(implementation = User.class)
					)
				}
			),
			@ApiResponse
			(
				responseCode = "400", 
				description = "Duplicate user"
			),
			@ApiResponse
			(
				responseCode = "404",
				description = "User not found"
			),
			@ApiResponse
			(
				responseCode = "500", 
				description = "Internal server error",
				content = 
				{
					@Content
					(
						mediaType = "application/json",
						schema = @Schema(implementation = User.class)
					)
				}
			)
		}
	)
	@PostMapping
	public User saveUser(@RequestBody UserDto userDto){
		return userService.saveUser(userMapper.userDtoToUser(userDto));
	}

	@Operation(summary = "Find a new User by Id", description = "The user must exist")
	@ApiResponses(value = 
		{	
			@ApiResponse
			(
				responseCode = "200", 
				description = "Ok",
				content = 
				{
					@Content
					(
						mediaType = "application/json",
						schema = @Schema(implementation = User.class)
					)
				}
			),
			@ApiResponse
			(
				responseCode = "400", 
				description = "Invalid Id suppliedr"
			),
			@ApiResponse
			(
				responseCode = "404",
				description = "User not found"
			),
			@ApiResponse
			(
				responseCode = "500", 
				description = "Internal server error",
				content = 
				{
					@Content
					(
						mediaType = "application/json",
						schema = @Schema(implementation = User.class)
					)
				}
			)
		}
	)
	@GetMapping("/id/{id}")
	public User getUser(@PathVariable Integer id) {
		return userService.findById(id);
	}

	@GetMapping("/completeUserData/{userCode}")
	public UserCompleteInformationDto getTotalUserData(@PathVariable String userCode){

		return userCompleteInformationMapper.userToUserDto(userService.findByUserCode(userCode));
	}

	@Operation(summary = "Find a User by user code", description = "The user must exist")
	@ApiResponses(value = 
		{	
			@ApiResponse
			(
				responseCode = "200", 
				description = "User found",
				content = 
				{
					@Content
					(
						mediaType = "application/json",
						schema = @Schema(implementation = User.class)
					)
				}
			),
			@ApiResponse
			(
				responseCode = "400", 
				description = "Invalid user code suppliedr"
			),
			@ApiResponse
			(
				responseCode = "404",
				description = "User not found"
			),
			@ApiResponse
			(
				responseCode = "500", 
				description = "Internal server error",
				content = 
				{
					@Content
					(
						mediaType = "application/json",
						schema = @Schema(implementation = User.class)
					)
				}
			)
		}
	)
	@GetMapping("/code/{userCode}")
	public User getByUserCode(@PathVariable String userCode) {
		return userService.findByUserCode(userCode);
	}
	
	@Operation(summary = "Find all Users", description = "The users must exists")
	@ApiResponses(value = 
		{	
			@ApiResponse
			(
				responseCode = "200", 
				description = "Ok",
				content = 
				{
					@Content
					(
						mediaType = "application/json",
						schema = @Schema(implementation = User.class)
					)
				}
			),
//			@ApiResponse
//			(
//				responseCode = "400", 
//				description = "Invalid "
//			),
			@ApiResponse
			(
				responseCode = "404",
				description = "No user registered"
			),
			@ApiResponse
			(
				responseCode = "500", 
				description = "Internal server error",
				content = 
				{
					@Content
					(
						mediaType = "application/json",
						schema = @Schema(implementation = User.class)
					)
				}
			)
		}
	)
	@GetMapping
	public List<User> getAllUsers(){
		return userService.findAll();
	}
	
	@Operation(summary = "Delete a User by user code", description = "The user must exists")
	@ApiResponses(value = 
		{	
			@ApiResponse
			(
				responseCode = "200", 
				description = "The user is deleted"
			),
			@ApiResponse
			(
				responseCode = "400", 
				description = "Invalid user code"
			),
			@ApiResponse
			(
				responseCode = "404",
				description = "No user registered for user code"
			),
			@ApiResponse
			(
				responseCode = "500", 
				description = "Internal server error",
				content = 
				{
					@Content
					(
						mediaType = "application/json",
						schema = @Schema(implementation = User.class)
					)
				}
			)
		}
	)
	@DeleteMapping("/{userCode}")
	public void deleteByUserCode(String userCode) {
		userService.deleteById(userService.findByUserCode(userCode).getId());
	}
}
