package com.gfd.tutorials.dto;

import com.gfd.tutorials.model.Email;
import com.gfd.tutorials.model.Phone;

import java.util.Set;

public class UserCompleteInformationDto {
    public UserCompleteInformationDto(){}
    public UserCompleteInformationDto(String userCode, String userName, String userSurName, Set<EmailDto> emails, Set<PhoneDto> phones) {
        this.userCode = userCode;
        this.userName = userName;
        this.userSurName = userSurName;
        this.emails = emails;
        this.phones = phones;
    }

    private String userCode;
    private String userName;
    private String userSurName;
    private Set<EmailDto> emails;
    private Set<PhoneDto> phones;

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurName() {
        return userSurName;
    }

    public void setUserSurName(String userSurName) {
        this.userSurName = userSurName;
    }

    public Set<EmailDto> getEmails() {
        return emails;
    }

    public void setEmails(Set<EmailDto> emails) {
        this.emails = emails;
    }

    public Set<PhoneDto> getPhones() {
        return phones;
    }

    public void setPhones(Set<PhoneDto> phones) {
        this.phones = phones;
    }
}
