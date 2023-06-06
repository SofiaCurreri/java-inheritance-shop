package org.lessons.java.shop;

public class Smartphone extends Product {
    private String imei;
    private int memoria;

    public Smartphone(String name, String description, double price, double iva, String imei, int memoria) {
        super(name, description, price, iva);
        this.imei = imei;
        this. memoria = memoria;
    }
}
