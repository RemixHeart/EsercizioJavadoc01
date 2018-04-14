/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author 70743270
 */
public class MensolaEcc extends Exception{
    private String errore;

    public MensolaEcc(String errore) {
        this.errore = errore;
    }

    public String getErrore() {
        return errore;
    }
}
