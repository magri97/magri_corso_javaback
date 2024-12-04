package biblioteca_campari;

import java.util.ArrayList;

public class Biblioteca {
	
	private static ArrayList<Libro> biblioteca;
	
	public Biblioteca() {
	}

	public Biblioteca(ArrayList<Libro> biblioteca) {
		super();
		this.biblioteca = biblioteca;
	}

	public ArrayList<Libro> getBiblioteca() {
		return biblioteca;
	}

	public void setBiblioteca(ArrayList<Libro> biblioteca) {
		this.biblioteca = biblioteca;
	}


	


	
}
