package com.mycompany.tickett.model;

public class TAIKHOAN {
    private int maTaiKhoan;
    private String tenTaiKhoan;
    private String matKhau;
    private String loaiTaiKhoan;
    
    public TAIKHOAN(){
        maTaiKhoan = 0;
        tenTaiKhoan = "";
        matKhau = "";
        loaiTaiKhoan = "";
    }
    
    public TAIKHOAN(int id, String name, String pass, String role){
        maTaiKhoan = id;
        tenTaiKhoan = name;
        matKhau = pass;
        loaiTaiKhoan = role;
    }
    
    public void setTenTaiKhoan(String s){
        tenTaiKhoan = s;
    }
    
    public void setLoaiTaiKhoan(String s){
        loaiTaiKhoan = s;
    }
    
    public String getLoaiTaiKhoan(){
        return loaiTaiKhoan;
    }
    
    
}
