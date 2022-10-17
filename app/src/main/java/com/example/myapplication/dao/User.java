package com.example.myapplication.dao;

public class User {
    private String name;
    private String wordpass;
    private String email;

    public User(String name, String wordpass, String email) {
        this.name = name;
        this.wordpass = wordpass;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWordpass() {
        return wordpass;
    }

    public void setWordpass(String wordpass) {
        this.wordpass = wordpass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
