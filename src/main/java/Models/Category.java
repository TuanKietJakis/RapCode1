/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Kiet
 */
public class Category {

    private int Catagory_ID;
    private String Cat_name;
    private String Cat_Strength;
    private String Cat_Lasting;
    private String Cat_Description;

    public Category() {

    }

    public int getCatagory_ID() {
        return Catagory_ID;
    }

    public void setCatagory_ID(int Catagory_ID) {
        this.Catagory_ID = Catagory_ID;
    }

    public String getCat_name() {
        return Cat_name;
    }

    public void setCat_name(String Cat_name) {
        this.Cat_name = Cat_name;
    }

    public String getCat_Strength() {
        return Cat_Strength;
    }

    public void setCat_Strength(String Cat_Strength) {
        this.Cat_Strength = Cat_Strength;
    }

    public String getCat_Lasting() {
        return Cat_Lasting;
    }

    public void setCat_Lasting(String Cat_Lasting) {
        this.Cat_Lasting = Cat_Lasting;
    }

    public String getCat_Description() {
        return Cat_Description;
    }

    public void setCat_Description(String Cat_Description) {
        this.Cat_Description = Cat_Description;
    }

    public Category(int Catagory_ID, String Cat_name, String Cat_Strength, String Cat_Lasting, String Cat_Description) {
        this.Catagory_ID = Catagory_ID;
        this.Cat_name = Cat_name;
        this.Cat_Strength = Cat_Strength;
        this.Cat_Lasting = Cat_Lasting;
        this.Cat_Description = Cat_Description;
    }
}
