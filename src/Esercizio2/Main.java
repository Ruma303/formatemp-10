package Esercizio2;

import Utility.*;

public class Main {
    public static void main(String[] args) {
        Negozio negozio = new Negozio();
        IO.pl("\n******* Benvenuto nel Negozio *******\n");
        
        boolean exit = false;
        while (!exit) {
            menu();
            Integer choice = IO.getInt("Inserisci la tua scelta: ");
            
            try {
                switch (choice) {
                    case 1: 
                        addProduct(negozio, 
                            IO.getString("Nome del prodotto: "),
                            IO.getDouble("Prezzo del prodotto: "),
                            IO.getInt("Quantità disponibile: "));
                        IO.pl("Prodotto aggiunto con successo!");
                        break;
                    case 2: 
                        listProducts(negozio);
                        break;
                    case 3: 
                        buyProduct(negozio);
                        break;
                    case 4: 
                        removeProduct(negozio);
                        break;
                    case 5: 
                        IO.exit("Grazie per aver usato il programma!");
                        exit = true;
                        break;
                    default: 
                        IO.pl("Scelta non valida!");
                        break;
                }
            } catch (Exception e) {
                IO.pl("Errore: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    public static void menu() {
        IO.pt("Scegli un'opzione:");
        IO.pt("1. Aggiungi un nuovo prodotto");
        IO.pt("2. Visualizza tutti i prodotti");
        IO.pt("3. Acquista un prodotto");
        IO.pt("4. Rimuovi un prodotto");
        IO.pt("5. Esci");
        IO.sepL();
    }

    public static void addProduct(Negozio negozio, String name, double price, int quantity) {
        if (price < 0 || quantity < 0) {
            IO.pl("Prezzo e quantità non possono essere negativi!");
            return;
        }
        Prodotto product = new Prodotto(name, price, quantity);
        negozio.add(product);
    }

    public static void buyProduct(Negozio negozio) {
        if (!exist(negozio)) return; 
        String name = IO.getString("Nome del prodotto: "); 
        int quantity = IO.getInt("Quantità da acquistare: "); 
        Prodotto product = negozio.search(name);
        if (product != null && product.getQuantity() >= quantity) {
            product.setQuantity(product.getQuantity() - quantity);
            IO.pl("Acquisto completato!");
        } else {
            IO.pl("Non ci sono sufficienti prodotti in stock o il prodotto non esiste!");
        }
    }

    public static void removeProduct(Negozio negozio) {
        if (!exist(negozio)) return; 
        String name = IO.getString("Nome del prodotto: "); 
        Prodotto product = negozio.search(name);
        if (product != null) {
            negozio.remove(product);
            IO.pl("Prodotto rimosso!");
        } else {
            IO.pl("Prodotto non trovato!");
        }
    }

    public static void listProducts(Negozio negozio) {
        if (!exist(negozio)) return;
        IO.sepL();
        IO.pl("Prodotti disponibili:");
        IO.sepL();
        for (Prodotto product : negozio.getProducts()) {
            IO.pl(product);
        }
        IO.sepL();
    }
    
    public static boolean exist(Negozio negozio) {
        if (negozio.getProducts().isEmpty()) {
            IO.pl("\nNon ci sono prodotti nel negozio!\n");
            return false;
        }
        return true;
    }
}