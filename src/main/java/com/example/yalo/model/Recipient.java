package com.example.yalo.model;

import java.util.Objects;

public class Recipient {
    String phone;
    String code;


    public Recipient(String phone, String code) {
        this.phone = phone;
        this.code = code;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recipient)) return false;
        Recipient recipient = (Recipient) o;
        return Objects.equals(phone, recipient.phone) && Objects.equals(code, recipient.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phone, code);
    }
}
