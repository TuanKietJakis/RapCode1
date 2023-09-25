/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Kiet
 */
public class Brand {
    private int Brand_ID;
    private String Brand_Name;
    public Brand(){
        
    }

    public Brand(int Brand_ID, String Brand_Name) {
        this.Brand_ID = Brand_ID;
        this.Brand_Name = Brand_Name;
    }

    public int getBrand_ID() {
        return Brand_ID;
    }

    public void setBrand_ID(int Brand_ID) {
        this.Brand_ID = Brand_ID;
    }

    public String getBrand_Name() {
        return Brand_Name;
    }

    public void setBrand_Name(String Brand_Name) {
        this.Brand_Name = Brand_Name;
    }
    
}