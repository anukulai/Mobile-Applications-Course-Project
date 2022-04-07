package com.example.findme.Model;

public class User {
    public String fullname,phonenumber,email;
    public int code;
    public User()
    {

    }
    public User(String fullname, String phonenumber, String email,int code)
    {
        this.fullname=fullname;
        this.phonenumber=phonenumber;
        this.email=email;
        this.code=code;
    }


}
