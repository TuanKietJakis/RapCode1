/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Kiet
 */
public class ProductImage {

    private int Image_ID;
    private int Product_ID;
    private String Image_URL;

    public ProductImage() {
    }

    public ProductImage(int Image_ID, int Product_ID, String Image_URL) {
        this.Image_ID = Image_ID;
        this.Product_ID = Product_ID;
        this.Image_URL = Image_URL;
    }

    public int getImage_ID() {
        return Image_ID;
    }

    public void setImage_ID(int Image_ID) {
        this.Image_ID = Image_ID;
    }

    public int getProduct_ID() {
        return Product_ID;
    }

    public void setProduct_ID(int Product_ID) {
        this.Product_ID = Product_ID;
    }

    public String getImage_URL() {
        return Image_URL;
    }

    public void setImage_URL(String Image_URL) {
        this.Image_URL = Image_URL;
    }

}
