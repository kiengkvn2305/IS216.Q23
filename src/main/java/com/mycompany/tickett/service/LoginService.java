package com.mycompany.tickett.service;
import com.mycompany.tickett.dao.TaiKhoanDAO;
import com.mycompany.tickett.dao.TaiKhoanImple;

public class LoginService {
    private TaiKhoanDAO user = new TaiKhoanImple();
    
    public String checkLogin(String username, String password) {
        return user.checkLogin(username, password);
    }
}
