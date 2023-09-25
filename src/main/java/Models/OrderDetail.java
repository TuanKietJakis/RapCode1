/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Kiet
 */
public class OrderDetail {
    private int Product_ID, Order_ID, Account_ID;
    private String P_Name;
    private int P_Amount;
    private int P_Price;

    public OrderDetail() {
    }

    public OrderDetail(int Product_ID, int Order_ID, int Account_ID, String P_Name, int P_Amount, int P_Price) {
        this.Product_ID = Product_ID;
        this.Order_ID = Order_ID;
        this.Account_ID = Account_ID;
        this.P_Name = P_Name;
        this.P_Amount = P_Amount;
        this.P_Price = P_Price;
    }

    public int getAccount_ID() {
        return Account_ID;
    }

    public void setAccount_ID(int Account_ID) {
        this.Account_ID = Account_ID;
    }

    

    public int getProduct_ID() {
        return Product_ID;
    }

    public void setProduct_ID(int Product_ID) {
        this.Product_ID = Product_ID;
    }

    public int getOrder_ID() {
        return Order_ID;
    }

    public void setOrder_ID(int Order_ID) {
        this.Order_ID = Order_ID;
    }

    public String getP_Name() {
        return P_Name;
    }

    public void setP_Name(String P_Name) {
        this.P_Name = P_Name;
    }

    public int getP_Amount() {
        return P_Amount;
    }

    public void setP_Amount(int P_Amount) {
        this.P_Amount = P_Amount;
    }

    public int getP_Price() {
        return P_Price;
    }

    public void setP_Price(int P_Price) {
        this.P_Price = P_Price;
    }
}
    
    