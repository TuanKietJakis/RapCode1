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
public class Order {
    private int Order_ID;
    private int Account_ID;    
    private int Total_Price;
    private String Phone_number;
    private String Delivery_Instruction;
    private String Delivery_Address;
    private Date Delivery_Time;
    private int Order_Status_ID;
    private int Payment_Method_ID;

    public Order() {
    }

    public Order(int Order_ID, int Account_ID, int Total_Price, String Phone_number, String Delivery_Instruction, String Delivery_Address, Date Delivery_Time, int Order_Status_ID, int Payment_Method_ID) {
        this.Order_ID = Order_ID;
        this.Account_ID = Account_ID;
        this.Total_Price = Total_Price;
        this.Phone_number = Phone_number;
        this.Delivery_Instruction = Delivery_Instruction;
        this.Delivery_Address = Delivery_Address;
        this.Delivery_Time = Delivery_Time;
        this.Order_Status_ID = Order_Status_ID;
        this.Payment_Method_ID = Payment_Method_ID;
    }

    public int getOrder_ID() {
        return Order_ID;
    }

    public void setOrder_ID(int Order_ID) {
        this.Order_ID = Order_ID;
    }

    public int getAccount_ID() {
        return Account_ID;
    }

    public void setAccount_ID(int Account_ID) {
        this.Account_ID = Account_ID;
    }

    public int getTotal_Price() {
        return Total_Price;
    }

    public void setTotal_Price(int Total_Price) {
        this.Total_Price = Total_Price;
    }

    public String getPhone_number() {
        return Phone_number;
    }

    public void setPhone_number(String Phone_number) {
        this.Phone_number = Phone_number;
    }

    public String getDelivery_Instruction() {
        return Delivery_Instruction;
    }

    public void setDelivery_Instruction(String Delivery_Instruction) {
        this.Delivery_Instruction = Delivery_Instruction;
    }

    public String getDelivery_Address() {
        return Delivery_Address;
    }

    public void setDelivery_Address(String Delivery_Address) {
        this.Delivery_Address = Delivery_Address;
    }

    public Date getDelivery_Time() {
        return Delivery_Time;
    }

    public void setDelivery_Time(Date Delivery_Time) {
        this.Delivery_Time = Delivery_Time;
    }

    public int getOrder_Status_ID() {
        return Order_Status_ID;
    }

    public void setOrder_Status_ID(int Order_Status_ID) {
        this.Order_Status_ID = Order_Status_ID;
    }

    public int getPayment_Method_ID() {
        return Payment_Method_ID;
    }

    public void setPayment_Method_ID(int Payment_Method_ID) {
        this.Payment_Method_ID = Payment_Method_ID;
    }

    

   

    
    
    
}
