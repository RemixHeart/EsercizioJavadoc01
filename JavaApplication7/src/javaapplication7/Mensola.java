/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.ArrayList;

/**
 *
 * @author RemixHeart
 */
public class Mensola {
    
    private ArrayList<Libro> libri;
    private int nLibri;
    
    /**
     * Costruttore principale della classe mensola
     * Crea una mensola vuota
     * 
     */
    public Mensola() {
        libri = new ArrayList<Libro>();
        nLibri = 0;
    }

    public Mensola(Mensola mensola) {
        libri = new ArrayList<Libro>();
        libri.addAll(mensola.libri);
        nLibri = libri.size();
    }

    public void addLibro (Libro libro) {
        libri.add(nLibri,libro);
        nLibri++;
    }
    

    public Libro getLibro( int pos ) throws MensolaEcc{
        if (pos < 0 || pos > nLibri)
            throw new MensolaEcc("Posizione non valida");
        if (nLibri == 0)
            throw new MensolaEcc("Mensola Vuota");
        return libri.get(pos);
    }
    
    public void rimuoviLibro ( int pos ) throws MensolaEcc{
        if (pos < 0 || pos > nLibri)
            throw new MensolaEcc("Posizione non valida");
        if (nLibri == 0)
            throw new MensolaEcc("Mensola Vuota");
        libri.remove(pos);
        libri.trimToSize();
        nLibri--;
    }
    
    public int getnLibri(){
        return nLibri;
    }
    

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
