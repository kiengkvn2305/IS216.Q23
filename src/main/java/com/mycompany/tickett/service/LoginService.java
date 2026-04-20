package com.mycompany.tickett.service;

public class LoginService {
    public boolean checkLogin(String user, String pass) {
        return user.equals("admin") && pass.equals("123");
    }
    
}
