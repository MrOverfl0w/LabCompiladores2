/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2compiladores;

/**
 *
 * @author yudyh
 */
public class Simbolo {
     private String sym;
    private boolean noTerm;

    public Simbolo(String symb, boolean noTerm) {
        this.sym = symb;
        this.noTerm = noTerm;
    }

    public String getSimbolo() {
        return sym;
    }
    
    public boolean isNoTerminal(){
        return noTerm;
    }

    public void setNoTerminal(boolean noTerm) {
        this.noTerm = noTerm;
    }
    
    @Override
    public String toString(){
        return sym;
    }
}


