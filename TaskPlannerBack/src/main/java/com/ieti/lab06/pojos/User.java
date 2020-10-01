package com.ieti.lab06.pojos;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String id;
    private String mail;
    private String pass;
    private String name;

    public User (String id, String mail, String pass, String name) {
        this.id = id;
        this.mail = mail;
        this.pass = pass;
        this.name = name;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getEmail(){
        return mail;
    }

    public void setEmail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return pass;
    }

    public void setPassword(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
