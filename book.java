/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi7;

/**
 *
 * @author admin
 */
public class book {
    String name, origin, type;
    int price, soTrang;

    public book() {
    }

    public book(String name, String origin, String type, int price, int soTrang) {
        this.name = name;
        this.origin = origin;
        this.type = type;
        this.price = price;
        this.soTrang = soTrang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
    
}
