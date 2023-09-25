/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Kiet
 */
public class Item {
    private GetProduct product;
    private int quantity;
    private int price;

    public Item() {
    }

    public Item(GetProduct product, int quantity, int price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public GetProduct getProduct() {
        return product;
    }

    public void setProduct(GetProduct product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
