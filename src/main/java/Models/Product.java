/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Kiet
 */
public class Product {

    private int Product_ID;
    private int Category_ID;
    private String P_name;
    private String P_availability;
    private String P_price;
    private int Brand_ID;
    private String P_size;
    private String P_Country;
    

    public Product() {

    }

    public Product(String P_name, String P_price, int Brand_ID, String P_size, String P_Country) {
        this.P_name = P_name;
        this.P_price = P_price;
        this.Brand_ID = Brand_ID;
        this.P_size = P_size;
        this.P_Country = P_Country;
    }

    public Product(String P_name, String P_price, int Brand_ID, String P_size, String P_Country, int Product_ID) {
        this.P_name = P_name;
        this.P_price = P_price;
        this.Brand_ID = Brand_ID;
        this.P_size = P_size;
        this.P_Country = P_Country;
        this.Product_ID = Product_ID;
    }

    public Product(int Product_ID, int Category_ID, String P_name, String P_availability, String P_price, int Brand_ID, String P_size, String P_Country) {
        this.Product_ID = Product_ID;
        this.Category_ID = Category_ID;
        this.P_name = P_name;
        this.P_availability = P_availability;
        this.P_price = P_price;
        this.Brand_ID = Brand_ID;
        this.P_size = P_size;
        this.P_Country = P_Country;
    }

    public int getProduct_ID() {
        return Product_ID;
    }

    public void setProduct_ID(int Product_ID) {
        this.Product_ID = Product_ID;
    }

    public int getCategory_ID() {
        return Category_ID;
    }

    public void setCategory_ID(int Category_ID) {
        this.Category_ID = Category_ID;
    }

    public String getP_name() {
        return P_name;
    }

    public void setP_name(String P_name) {
        this.P_name = P_name;
    }

    public String getP_availability() {
        return P_availability;
    }

    public void setP_availability(String P_availability) {
        this.P_availability = P_availability;
    }

    public String getP_price() {
        return P_price;
    }

    public void setP_price(String P_price) {
        this.P_price = P_price;
    }

    public int getBrand_ID() {
        return Brand_ID;
    }

    public void setBrand_ID(int Brand_ID) {
        this.Brand_ID = Brand_ID;
    }

    public String getP_size() {
        return P_size;
    }

    public void setP_size(String P_size) {
        this.P_size = P_size;
    }

    public String getP_Country() {
        return P_Country;
    }

    public void setP_Country(String P_Country) {
        this.P_Country = P_Country;
    }

}