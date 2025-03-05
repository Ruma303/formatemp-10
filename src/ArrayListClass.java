import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import Utility.IO;
import Data.Book;

public class ArrayListClass {

	public static void main(String[] args) {
		
		// ArrayList senza generics
		ArrayList list = new ArrayList();
		
		list.add(10);
		list.add("Ciao");
		list.add(3.14);
		list.add(true);
		
		// Per indicare il tipo di dato, usiamo il casting
		Integer numeroInt = (Integer) list.get(0);
		String stringa = (String) list.get(1);
        Double numeroDouble = (Double) list.get(2);
        Boolean bool = (Boolean) list.get(3);
        
        IO.pl(numeroInt);
        IO.pl(stringa);
        IO.pl(numeroDouble);
        IO.pl(bool);
        IO.pl("La lista contiene " + list.size() + " elementi:");
        
        IO.sepL();
        
        // Per aggiungere un elemento in una posizione specifica
        
        Integer pos = 1;
        String value = "Hello";
        
        IO.pl("Aggiungo elemento " + value + " in posizione " + pos);
        list.add(pos, "value");
        
        IO.list(list);
        
        IO.sepL();
        
        // Per rimuovere un elemento
        list.remove(0);
        IO.pl("Rimuovo elemento in posizione 1");
        
        IO.list(list);
        
        IO.sepL();
        
        // Per controllare se un elemento è presente
        boolean contains = list.contains("Hello");
        IO.pl("Esiste il valore \"Hello\"? " + contains);
        
        IO.sepL();
        
        
        // Utilizzo dei generics per specificare il tipo di dato
        
		// Possiamo creare una ArrayList con generics vuoto
		ArrayList<Book> books0 = new ArrayList<Book>();
		
		// Creare gli oggetti Book
		Book b1 = new Book("titolo1", "autore1", 1990);
		Book b2 = new Book("titolo2", "autore2", 1991);
		Book b3 = new Book("titolo3", "autore3", 1992);
		
		// Ed aggiungerli in seguito
		
		books0.add(b1);
		books0.add(b2);
		books0.add(b3);
		
		
		// Oppure inizializzare l'ArrayList con un array di oggetti 
		// passandoli con il metodo Arrays.asList()
		// e passando la lista di oggetti come parametro
		ArrayList<Book> books = new ArrayList<Book>(Arrays.asList(
				b1, // Possiamo passare oggetti
				b2, 
				b3, 
				// Oppure istanziandoli direttamente			
				new Book("titolo4", "autore4", 1998) 
			));
		
		//
		books.add(b1);
		books.add(b2);
		books.add(new Book("titolo5", "autore5", 1879));
		
		
		// Per le collections, possiamo controllare il numero di elementi
		// utilizzando il metodo size()
		IO.pl("La lista contiene " + books.size() + " libri");
		
		IO.list(books);
		
        IO.sepL();
		
		
		// Menu per aggiungere un libro
		int exit = 0;
		
		while (true) {
			int n = IO.getInt("Inserisci l'indice tra 1 e " + books.size() + " oppure 0 per uscire: ");
			
			if (n == 0) {
				//IO.exit();
				IO.pl("Uscita...\n");
                break;
			}
			
			if (n < 1 || n > books.size()) {
                IO.pl("Indice non valido!\n");
                continue;
            }
			
			n -= 1;
			Book b4 = books.get(n);
			IO.pl(b4.toString());
			IO.pl();
		}
		
		IO.sepL();
		
		// Altre collections in Java
		
		// Vector è una collezione dinamica che non impone la presenza di un ordine
		// Simile a ArrayList, ma è synchronized, cioè non thread-safe
		Vector vector = new Vector();
		
		// I metodi sono molto simili
        vector.add(10);
        vector.add("Ciao");
        vector.add(3.14);
        vector.add(2, true);
        
        IO.list(vector);
		
        IO.sepL();
        
		
        // Interfacce
        
		// List è un'interfaccia implementata da 
		// ArrayList, LinkedList, Vector, Stack, e altri tipi.
        
        // Possiamo istanziare un'interfaccia assegnandolo
        // ad una classe che implementa la medesima intefaccia:
        
		List list2 = books; // ArrayList implementa List
		List list3 = vector; // Vector implementa List
		
		// Non è possibile istanziare l'interfaccia stessa
		// List list4 = new List();
				
		
		list2.add("Bo, che ne so");
		
		
		IO.list(list2);
		
		
		// Il metodo remove() può anche essere usato per rimuovere un elemento 
		// da una posizione specifica e lo restituisce, quindi possiamo salvarlo
		Object b8 = list2.remove(7);
		
		IO.pl("\nHai rimosso: " + b8);
		
		IO.sepL();
		
		
		
		// Classe LinkedList implementa altre interfacce come List, e Deque
		LinkedList<Book> newList = new LinkedList();
		
        newList.add(b1);
        newList.add(b2);
        newList.add(b3);
        
        newList.remove();
        
        IO.pl("Stampa LinkedList");
        IO.list(newList);
        
        // Riproviamo istanziando l'interfaccia Deque che viene
        // implementata da LinkedList:
        Deque<Book> deque = new LinkedList<>(newList);
	}
}
