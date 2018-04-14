/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author RemixHeart
 */
public class Libro {
    private String titolo;
    private String autore;
    private String isbn;
    
    /**
     * Costruttore principale per la classe Libro
     * 
     * @param titolo    titolo del libro
     * @param autore    autore del libro
     * @param isbn      codice isbn del libro
     */
    public Libro(String titolo, String autore, String isbn) {
        this.titolo = titolo;
        this.autore = autore;
        this.isbn = isbn;
    }
    
    /**
     * Costruttore copia della classe Libro
     * serve ad clonare o duplicare un libro gia esistente
     * @param libro 
     */
    public Libro ( Libro libro ) {
        this.titolo = libro.getTitolo();
        this.autore = libro.getAutore();
        this.isbn = libro.getIsbn();
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
