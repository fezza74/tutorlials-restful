package com.gfd.tutorials.dto;

public class EmailDto {
    public EmailDto(String emailAddress, String tipeOfEmail) {
        this.emailAddress = emailAddress;
        this.tipeOfEmail = tipeOfEmail;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getTipeOfEmail() {
        return tipeOfEmail;
    }

    public void setTipeOfEmail(String tipeOfEmail) {
        this.tipeOfEmail = tipeOfEmail;
    }

    private String emailAddress;
    private String tipeOfEmail;
}
