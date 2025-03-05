package Esercizio2;

import Utility.*;
import java.util.*;

public class Negozio {
	
	private ArrayList<Prodotto> products;

	public Negozio() {
        this.products = new ArrayList<>();
    }
	
    public void add(Prodotto product) {
        products.add(product);
    }
    
    public void remove(Prodotto product) {
        products.remove(product);
    }
    
    public void list(Prodotto products) {
    	IO.list(products);
    }
    
    public List<Prodotto> getProducts() {
        return products;
    }
    
    public Prodotto search(String name) {
    	for (Prodotto product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }
    
    public void increment(Prodotto product) {
    	product.setQuantity(product.getQuantity() + 1);
    }
    
    public void decrement(Prodotto product) {
    	if (product.getQuantity() > 0) {
            product.setQuantity(product.getQuantity() - 1);
        } else {
            IO.pl("Nessun prodotto");
        }
    }
    
}
