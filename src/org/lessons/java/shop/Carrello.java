package org.lessons.java.shop;

import java.util.Scanner;
public class Carrello {
    public static void main(String[] args){
        Scanner utente = new Scanner(System.in);

        System.out.println("Quanti prodotti vuoi inserire nel carrello?");
        int numProdotti = utente.nextInt();
        String[] carrello = new String[numProdotti];


        for (int i = 0; i < numProdotti; i++) {
            System.out.println("Inserisci nome prodotto");
            String nome = utente.nextLine();
            utente.nextLine(); // Consuma la nuova riga residua

            System.out.println("Inserisci prezzo prodotto");
            double prezzo = utente.nextDouble();

            System.out.println("Inserisci una descrizione del prodotto");
            String descrizione = utente.nextLine();
            utente.nextLine(); // Consuma la nuova riga residua

            System.out.println("Inserisci Iva (formato 0.##)");
            double iva = utente.nextDouble();

            utente.nextLine(); // Consuma la nuova riga residua
            System.out.println("Stai inserendo 1)Smartphone, 2)Cuffie o 3)Televisore?");
            String scelta = utente.nextLine();

            switch (scelta){
                case "1":
                    System.out.println("Inserisci IMEI");
                    String imei = utente.nextLine();

                    System.out.println("Inserisci memoria");
                    int memoria = utente.nextInt();
                    Smartphone smartphone = new Smartphone(nome, descrizione, prezzo, iva, imei, memoria);
                    carrello[i] = String.valueOf(smartphone);
                    break;
                case "2":
                    System.out.println("Inserisci colore");
                    String colore = utente.nextLine();

                    System.out.println("Inserisci tipologia (wireless/cablate)");
                    String tipologia = utente.nextLine();
                    Cuffie cuffie = new Cuffie(nome, descrizione, prezzo, iva, colore, tipologia);
                    carrello[i] = String.valueOf(cuffie);
                    break;
                case "3":
                    System.out.println("Inserisci dimensione");
                    int dimensione = utente.nextInt();

                    utente.nextLine(); // Consuma la nuova riga residua
                    System.out.println("Inserisci tipologia (smart tv/no smart)");
                    String tipo = utente.nextLine();
                    Televisore tv = new Televisore(nome, descrizione, prezzo, iva, dimensione, tipo);
                    carrello[i] = String.valueOf(tv);
                    break;
                default:
                    System.out.println("Devi inserire una tipologia (1,2 o 3)");
                    break;
            }
        }

        for (int i = 0; i < carrello.length; i++) {
            System.out.print(carrello[i] + "\n");
        }


    }
}
