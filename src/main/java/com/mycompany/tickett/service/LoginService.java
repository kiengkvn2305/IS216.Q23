package com.mycompany.tickett.service;

public class LoginService {
    public String checkLogin(String user, String pass) {
        if (user.equals("admin") && pass.equals("123")){
            return "ADMIN";
        }
        else if (user.equals("customer") && pass.equals("123")){
            return "CUSTOMER";
        }
        else if (user.equals("creator") && pass.equals("123")){
            return "CREATOR";
        }
        return "FAIL";
    }
}
