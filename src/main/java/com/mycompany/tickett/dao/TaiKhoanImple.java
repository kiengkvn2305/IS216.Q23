package com.mycompany.tickett.dao;
import com.mycompany.tickett.model.TAIKHOAN;
import java.sql.*;

public class TaiKhoanImple implements TaiKhoanDAO{
    @Override
    public String checkLogin(String user, String pass){
        String role = "FAIL";
        TAIKHOAN tk = null;
        try (Connection conn = DBConnection.getConnection()){
            String sql = "SELECT LOAITAIKHOAN "
                    + "FROM TAIKHOAN "
                    + "WHERE TENTAIKHOAN = ? AND MATKHAU = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, pass);
            
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tk = new TAIKHOAN();
                tk.setLoaiTaiKhoan(rs.getString("LOAITAIKHOAN"));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        if (tk == null) return role;
        return tk.getLoaiTaiKhoan();
    }
}
