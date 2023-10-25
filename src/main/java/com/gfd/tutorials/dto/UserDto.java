package com.gfd.tutorials.dto;

public class UserDto {
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

    private String userCode;
    private String userName;
    private String userSurName;
    public UserDto(){}

    public UserDto(String userCode, String userName, String userSurName) {
        this.userCode = userCode;
        this.userName = userName;
        this.userSurName = userSurName;
    }
}
