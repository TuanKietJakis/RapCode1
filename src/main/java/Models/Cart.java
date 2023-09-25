/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;


/**
 *
 * @author Kiet
 */
public class Cart {

   private int ProductID;
   private int AccountID;
   private String P_Name;
   private int P_Amount ;
   private int P_Price;

    public Cart() {
    }

    public Cart(int ProductID, int AccountID, String P_Name, int P_Amount, int P_Price) {
        this.ProductID = ProductID;
        this.AccountID = AccountID;
        this.P_Name = P_Name;
        this.P_Amount = P_Amount;
        this.P_Price = P_Price;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public int getAccountID() {
        return AccountID;
    }

    public void setAccountID(int AccountID) {
        this.AccountID = AccountID;
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
