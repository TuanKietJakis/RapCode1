/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import DatabaseConnection.DatabaseConnection;
import Models.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kiet
 */
public class AccountDAO {
     private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    public AccountDAO() throws Exception {
        conn = DatabaseConnection.getConnection();
    }

    
    public String GetMaxAccountID() {
        String maxID = "";

        try {
            ps = conn.prepareStatement("SELECT MAX(Account_ID) AS MaxID FROM Account");
            rs = ps.executeQuery();
            if (rs.next()) {
                maxID = rs.getString("MaxID");
            }
        } catch (SQLException ex) {

        }
        return maxID;
    }

    public boolean checkUserNameIsExist(String username) {
        try {
            ps = conn.prepareStatement("SELECT Account_ID FROM Account WHERE Username = ?");
            ps.setString(1, username);
            rs = ps.executeQuery();
            return rs.next(); // Return true if there is a result, indicating the username already exists
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                System.out.println(e);
                throw new RuntimeException(e);
            }
        }
        return false;
    }

    public boolean checkFullnameIsExist(String username) {
        try {
            ps = conn.prepareStatement("SELECT Account_ID FROM Account WHERE Fullname = ?");
            ps.setString(1, username);
            rs = ps.executeQuery();
            return rs.next(); // Return true if there is a result, indicating the username already exists
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                System.out.println(e);
                throw new RuntimeException(e);
            }
        }
        return false;
    }

//    public static void main(String[] args) throws Exception {
//        AccountDAO acc = new AccountDAO();
//        acc.signup("15", "vy", "vy123", "1", "0123456789", "vy@gmail.com", "abv", "0", "0", "1992-07-06");
//        System.out.println("Add thanh cong ");
//    }

    public void signup(
            String Account_ID,
            String Fullname,
            String Username,
            String Password,
            String Mobile_Number,
            String Email,
            String Address,
            String IsAdmin,
            String Gender,
            String Birthday) {
        try {
            ps = conn.prepareStatement("INSERT INTO Account VALUES (?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, Account_ID);
            ps.setString(2, Fullname);
            ps.setString(3, Username);
            ps.setString(4, EncodeMD5.MD5.encode(Password));
            ps.setString(5, Mobile_Number);
            ps.setString(6, Email);
            ps.setString(7, Address);
            ps.setString(8, IsAdmin);
            ps.setString(9, Gender);
            ps.setString(10, Birthday);
            ps.executeUpdate();
        } catch (Exception e) {

            System.out.println(e);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                System.out.println(e);
                throw new RuntimeException(e);

            }
        }
    }
      public boolean Login(Account acc) throws SQLException {
        String sql = "SELECT * FROM Account WHERE Username=? AND Password=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, acc.getUsername());
            ps.setString(2, EncodeMD5.MD5.encode(acc.getPassword()));
            rs = ps.executeQuery();
        } catch (Exception ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs.next();
    }
    
    public boolean IsAdmin(String username) {
        String sql = "SELECT IsAdmin FROM Account WHERE Username = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int isAdmin = rs.getInt("IsAdmin");
                return (isAdmin == 1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
    
    
    public String GetFullName(String username) {
        String fullname = null;

        try {
            ps = conn.prepareStatement("select Fullname from Account where Username=?");
            ps.setString(1, username);
            rs = ps.executeQuery();
            if (rs.next()) {
                fullname = rs.getString("Fullname");
            }
        } catch (SQLException ex) {

        }
        return fullname;

    }
    
    public int GetIDFromFullname(String Fullname) {
        int ID = 0;
        String sql = "select Account_ID from Account\n"
                + "where Fullname = ?;";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, Fullname);
            rs = ps.executeQuery();
            if (rs.next()) {
                ID = rs.getInt("Account_ID");
            }
        } catch (SQLException e) {
        }
        return ID;
    }
    
}
