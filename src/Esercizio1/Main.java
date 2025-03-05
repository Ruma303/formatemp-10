package Esercizio1;

import java.util.*;

 
public class Main {
 
	public static void main(String[] args) {

//		HashMap<Integer, String> map = new HashMap<Integer, String>();
//		
//		map.put(10, "Pippo");
//		map.put(20, "Pluto");
//		map.put(20, "Pluto");
//		map.put(69, "Tua madre");
//	
//		int size = map.size();
//		
//		System.out.println("La rubrica contiene " + size + " elementi.");
//		
//		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
//		Iterator<Map.Entry<Integer, String>> it = entrySet.iterator();
//		
//		while (it.hasNext()) {
//            Map.Entry<Integer, String> entry = it.next();
//            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//        }
//		
		
		Scanner scanner = new Scanner(System.in);
		Rubrica rubrica = new Rubrica();
		
		int scelta = 0;
 
		do {
 
			try {
				rubrica.menu();
				scelta = scanner.nextInt();
				scanner.nextLine();
			} catch (Exception e) {
				System.out.println("Non hai inserito un'opzione valida.");
			}
 
			switch (scelta) {
			case 1:
				System.out.println("Inserici il nome");
				String nome = scanner.nextLine();
				System.out.println("Inserici il telefono");
				String telefono = scanner.nextLine();
				rubrica.aggiungiContatto(nome, telefono);
 
				break;
			case 2:
 
				rubrica.visualizzareContatto();
				break;
 
			case 3:
				System.out.println("Inserici il nome da cercare");
				String nomeCerca = scanner.nextLine();
				rubrica.cercaContatto(nomeCerca);
 
				break;
 
			case 4:
				System.out.println("Inserici il nome da eliminare");
				String nomeEliminare = scanner.nextLine();
				rubrica.eliminareContatto(nomeEliminare);
 
				break;
 
			case 5:
 
				System.out.println("Uscendo dal programma.");
				break;
 
			default:
 
				System.out.println("valore non valido");
				break;
 
			}
 
		} while (scelta != 5);
		scanner.close();
	}
 
}