package biblioteca_campari;

import java.util.ArrayList;

public class Libro extends Biblioteca{

	
	private String titolo;
	private String autore;
	private int copieDisp= (0);
	
	public Libro() {
		
	}
	public Libro(ArrayList<Libro> biblioteca) {
		super(biblioteca);
	}


	public Libro(String titolo, String autore, int copieDisp, int copiePrest) {
		super();
		this.titolo = titolo;
		this.autore = autore;
		this.copieDisp = copieDisp;
	}
	
	

	public Libro(String titolo, String autore, int copieDisp) {
		super();
		this.titolo = titolo;
		this.autore = autore;
		this.copieDisp = copieDisp;
	}
	public String getTitolo() {
		return titolo;
	}



	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}



	public String getAutore() {
		return autore;
	}



	public void setAutore(String autore) {
		this.autore = autore;
	}



	public int getCopieDisp() {
		return copieDisp;
	}



	public void setCopieDisp(int copieDisp) {
		this.copieDisp = copieDisp;
	}




	@Override
	public String toString() {
		return "Titolo : " +titolo + " | Autore: " + autore + " | Copie Disponibili : " + copieDisp + " | " ;
	}
	
	
	
	 
	
}
