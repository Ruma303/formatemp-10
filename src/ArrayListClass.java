import java.util.ArrayList;
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
        
        ArrayList<Book> books = new ArrayList<Book>();

		Book b1 = new Book("titolo1", "autore1", 1990);
		Book b2 = new Book("titolo2", "autore2", 1991);
		Book b3 = new Book("titolo3", "autore3", 1992);
		
		books.add(b1);
		books.add(b2);
		books.add(b3);
		
		int exit = 0;
		
		while (true) {
			int n = IO.getInt("Inserisci l'indice tra 1 e " + books.size() + " oppure 0 per uscire: ");
			
			if (n == 0) {
				IO.exit();
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
		
	}
}
