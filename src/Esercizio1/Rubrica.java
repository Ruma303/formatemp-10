package Esercizio1;

import java.util.ArrayList;

public class Rubrica {

	public static ArrayList<Contatto> contatti;
	
	public Rubrica() {
		contatti = new ArrayList<>();
	}

	public void aggiungiContatto(String nome, String numero) {
		contatti.add(new Contatto(nome, numero));
		System.out.println("Contatto aggiunto con successo!");
	}

	public void visualizzareContatto() {

		if (contatti.isEmpty()) {
			System.out.println("La rubrica è vuota.");
		} else {
			for (Contatto c : contatti) {
				System.out.println(c);
			}
		}
	}

	public void cercaContatto(String nome) {

		boolean trovato = false;
		for (Contatto c : contatti) {
			if (c.getNome().equalsIgnoreCase(nome)) {
				System.out.println("Contatto trovato" + c);
				trovato = true;
				break;
			}
		}

		if (!trovato) {
			System.out.println("Contatto non trovato");
		}

	}

	public void eliminareContatto(String nome) {	
		for (Contatto c : contatti) {
			if (c.getNome().equalsIgnoreCase(nome)) {
				contatti.remove(c);
				System.out.println("Contatto eliminato con successo!");
				return;

			} else {
				System.out.println("Contatto non trovato");
			}
		}

	}

	public void menu() {

		System.out.println("n/****MENU*****");
		System.out.println("1. Aggiunge un nuovo contatto.");
		System.out.println("2. Visualizzare tutti i contatti.");
		System.out.println("3. Cercare un contatto per nome.");
		System.out.println("4. Eliminare un contatto dato il nome.");
		System.out.println("5. Uscire dal programma.");

	}
}