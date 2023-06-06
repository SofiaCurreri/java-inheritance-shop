package org.lessons.java.shop;

public class Televisore extends Product{
    private int dimensione;
    private String tipo;
    public Televisore(String name, String description, double price, double iva, int dimensione, String tipo) {
        super(name, description, price, iva);
        this.dimensione = dimensione;
        this.tipo = tipo;
        }
    @Override
    public String toString(){
        return dimensione + tipo;
    }
}
