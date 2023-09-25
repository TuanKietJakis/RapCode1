/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.sql.Date;

/**
 *
 * @author Kiet
 */
public class Account {
    private int Account_ID;
    private String Fullname;
    private String Username;
    private String Password;
    private String MobileNumber;
    private String Email;
    private String Address;
    private Date Birthday;
    private String Gender;
    private int IsAdmin;

    public Account(){
        
    }

    public Account(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;
    }

    public Account(int Account_ID, String Fullname, String Username, String Password, String MobileNumber, String Email, String Address, Date Birthday, String Gender, int IsAdmin) {
        this.Account_ID = Account_ID;
        this.Fullname = Fullname;
        this.Username = Username;
        this.Password = Password;
        this.MobileNumber = MobileNumber;
        this.Email = Email;
        this.Address = Address;
        this.Birthday = Birthday;
        this.Gender = Gender;
        this.IsAdmin = IsAdmin;
    }

    public Date getBirthday() {
        return Birthday;
    }

    public void setBirthday(Date Birthday) {
        this.Birthday = Birthday;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

   

    public int getAccount_ID() {
        return Account_ID;
    }

    public void setAccount_ID(int Account_ID) {
        this.Account_ID = Account_ID;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(String MobileNumber) {
        this.MobileNumber = MobileNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getIsAdmin() {
        return IsAdmin;
    }

    public void setIsAdmin(int IsAdmin) {
        this.IsAdmin = IsAdmin;
    }

    

    
    
    
    
}
