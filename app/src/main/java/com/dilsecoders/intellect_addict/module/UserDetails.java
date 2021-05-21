package com.dilsecoders.intellect_addict.module;

public class UserDetails {
    private String name, mail;

    public UserDetails() {
    }
    public UserDetails(String name, String mail){

        this.name = name;
        this.mail = mail;
    }
    public String getName(){
        return  name;
    }
    public String getMail() {return  mail; }
}
