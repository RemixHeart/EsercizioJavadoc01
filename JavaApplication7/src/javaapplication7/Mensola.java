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
public class Mensola {
    
    private static final int max_num_volumi = 100;
    private Libro volumi[];

    public Mensola() {
    
        volumi = new Libro[max_num_volumi];
        
    }

    public Mensola(Mensola mensola) {
        int i;
        volumi = new Libro[max_num_volumi];
        for ( i = 0; i < max_num_volumi; i++){
            
            if ( mensola.getVolume(i) != null )
                volumi[i] = new Libro( mensola.getVolume(i) );
        }
    }

    public int setVolume (Libro libro, int pos) {
        if (pos < 0 || pos > max_num_volumi)
            return -1;                  //Posizione non valida
        if (volumi[pos] != null)
            return -2;                  //Posizione Occupata
        volumi[pos] = new Libro(libro);
        return pos;                     //Ritorna la posizione Sovrascritta
    }
    public int setVolume2 (Libro libro, int pos) {          //Esercizio a
        if (pos < 0 || pos > max_num_volumi)
            return -1;                  //Posizione non valida
        if (volumi[pos] == null){
            volumi[pos] = new Libro(libro);
            return pos; 
        }
                             //Posizione Occupata
        else{
            System.arraycopy(volumi, pos , volumi, pos + 1, max_num_volumi - pos -1 );
            volumi[pos] = new Libro(libro);
        }        
        
        return pos;                     //Ritorna la posizione Sovrascritta
        
        
    }
    
    public int setVolume3 (Libro libro, int pos){       //Esercizio b
        int cont = 0;
        if (pos < 0 || pos > max_num_volumi)
            return -1;                  //Posizione non valida
        for ( int i = 0; i < max_num_volumi; i++)
            if (volumi[i] != null)
                cont = i;
        if ( pos > cont) {
            volumi[cont + 1] = libro;
            
        }
        return cont + 1;
    }

    public Libro getVolume( int pos ) {
        if (pos < 0 || pos > max_num_volumi || volumi[pos] == null)
            return null;            //Pos non valida o non c'è niente a pos
        return new Libro (volumi[pos]);
        
    }
    
    public int rimuoviVolume ( int pos ) {
        if (pos < 0 || pos > max_num_volumi)
            return -1;                  //Posizione non valida
        if (volumi[pos] == null)
            return -2;                  //Posizione Vuota
        volumi[pos] = null;
        return pos;                     //Ritorna la Posizione libera
    }
    
    public int getNumMaxVolumi(){
        return max_num_volumi;
    }
    
    public int getNumVolumi(){
        int i, cont = 0;
        for ( i = 0; i < max_num_volumi; i++)
            if (volumi[i] != null)
                cont++;
        return cont;
    }
    
    public void killLibro( int n ) {            
        this.volumi[n] = null;
        System.arraycopy(volumi, n + 1, volumi, n, max_num_volumi - n -1 );
        
    }
    
    
    
    
    
    
    
    


    public static void main(String[] args) {
        // TODO code application logic here
        
        Libro l1 = new Libro("pollo", "polino", "8937364905");
        Libro l2 = new Libro("pollo2", "polino2", "4374908274");
        Libro l3 = new Libro("pollo3", "polino3", "3480340239");
        
        Mensola m = new Mensola();
        m.setVolume(l3, 0);
        m.setVolume(l1, 1);
        System.out.println ( "" + m.getVolume(0).getAutore());
        System.out.println ( "" + m.getVolume(1).getAutore());
        m.setVolume2(l1, 0);
        System.out.println ( "" + m.getVolume(0).getAutore());
        System.out.println ( "" + m.getVolume(1).getAutore());
        System.out.println ( "" + m.getVolume(2).getAutore());
    }
    
}
