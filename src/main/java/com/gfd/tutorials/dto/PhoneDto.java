package com.gfd.tutorials.dto;

public class PhoneDto {
    private String number;
    private String nation;
    private String typeOfNumber;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getTypeOfNumber() {
        return typeOfNumber;
    }

    public void setTypeOfNumber(String typeOfNumber) {
        this.typeOfNumber = typeOfNumber;
    }

    public PhoneDto(String number, String nation, String typeOfNumber) {
        this.number = number;
        this.nation = nation;
        this.typeOfNumber = typeOfNumber;
    }
}
