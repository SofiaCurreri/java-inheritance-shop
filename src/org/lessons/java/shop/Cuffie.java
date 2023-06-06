package org.lessons.java.shop;

public class Cuffie extends Product{
    private String colore;
    private String tipologia;
    public Cuffie(String name, String description, double price, double iva, String colore, String tipologia) {
        super(name, description, price, iva);
        this.colore = colore;
        this.tipologia = tipologia;
    }

    @Override
    public String toString(){
        return colore + tipologia;
    }
}
