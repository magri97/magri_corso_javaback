package biblioteca_campari;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class BibliotecaApp {
 static Scanner scanner ;
	static Scanner in;
	static ArrayList<Libro> biblioteca;
	static Biblioteca b;
	static Libro l;

	public static void main(String[] args) {
scanner=new Scanner(System.in);
		// DICHIARAZIONE OGGETTI PRINCIPALI
		in = new Scanner(System.in);
		biblioteca = new ArrayList<Libro>();
int risposta =0;
		// POPOLA
		popolaBiblioteca();
		do {
		mostrainfo();
		 risposta=leggiIntero();
		Switch(risposta);
		}while(risposta!=0);
		

	}


	private static void popolaBiblioteca() {

		biblioteca.add(new Libro("Il nome della rosa", "Umberto Eco", 10));
		biblioteca.add(new Libro("1984", "George Orwell", 20));
		biblioteca.add(new Libro("La coscienza di Zeno", "Italo Svevo", 15));
		biblioteca.add(new Libro("Il Gattopardo", "Giuseppe Tomasi di Lampedusa", 19));

	}
	
	public static void mostrainfo() {
		System.out.println("------Menu------");
		System.out.println("1) Per visualizzare l'intera lista libri.");
		System.out.println("2) Per prenotare un libro.");
		System.out.println("3) Restituisci Libro.");
		System.out.println("4) Per Aggiungi libro.");
		System.out.println("5) Per Rimuovere un Libro.");
		System.out.println("0) Per chiudere l'app .");
		System.out.println();
		System.out.print("Inserisci una delle opzioni : ");
		}

		private static  int leggiIntero() {
			int n = 0;
			try {
				n = scanner.nextInt();
				scanner.nextLine();
			} catch (InputMismatchException e) {
				scanner.nextLine();
				System.err.println("ERRORE: valore non valido \ninserisci nuovo valore");
				n = leggiIntero();
			}
			return n;
		}

		public static void Switch(int risposta) {
			
			switch (risposta) { 
			case 1: 	System.out.println("-----Ecco a te la lista Libri-----");
				mostralibri(); break;
			case 2:prenotaLibro(); break;
			case 3:restotuisciLibro();break;	
			case 4: l=aggiungilibro();
			biblioteca.add(l);
			break;
			case 5: cancellaLibro(); break;
			default : System.out.println("Non hai inserito nessun valore valido"); break;
			case 0:System.out.println("Il programma termina"); break;

			
		}

		}

public static void prenotaLibro() {
	System.out.println("Inserisci il numero nella lista del libro");
	int risposta=leggiIntero();
	if (biblioteca.size()>=risposta) {
	Libro l=biblioteca.get(risposta);
	l.setCopieDisp((l.getCopieDisp()-1));	
	System.out.println("Il libro è stato preso in prestito");

	} else {
		System.out.println("Non hai inserito un numero presente nella lista");

		
	}
	
}

public static void restotuisciLibro() {
	System.out.println("Inserisci il numero nella lista del libro");
	int risposta=leggiIntero();
	if (biblioteca.size()>=risposta) {
	Libro l=biblioteca.get(risposta);
	l.setCopieDisp((l.getCopieDisp()+1));	
	System.out.println("Il libro è stato restituito");


	} else {
		System.out.println("Non hai inserito un numero presente nella lista");
	}
}
private static void cancellaLibro() {

    System.out.println("Dimmi poszine libro da gestire:\n> ");
    int pos = leggiIntero();
    if (biblioteca.size()>=pos) {
    	biblioteca.remove(pos);
        System.out.println("Libro cancellato");
       
    } else {
        System.out.println("Posizione non trovata");
    }


}

public boolean cancella(int pos) {

    if(pos < 0 && pos >= biblioteca.size()) {
        return false;
    }



    biblioteca.remove(pos);
    return true;
}


public static Libro aggiungilibro() {
	System.out.println("Inserisci il titolo del libro");
	String titolo=scanner.nextLine();
	System.out.println("Inserisci l'autore del libro");
	String autore=scanner.nextLine();
	System.out.println("Inserisci le copie disponibili del libro");
	int copielibri=scanner.nextInt();
	return new Libro(titolo,autore,copielibri);
}
	
	

	
public static void mostralibri() {
	int i =0;
for (Libro l:biblioteca) {
	System.out.println("Posizione nella lista:" + i);
	System.out.println(l.toString());
	System.out.println();
	i++;
}
}

}






