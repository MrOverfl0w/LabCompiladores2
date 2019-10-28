/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2compiladores;

import java.util.ArrayList;

/**
 *
 * @author yudyh
 */
public class Production {
    private ArrayList<Simbolo> prod;

    public Production() {
        this.prod = new ArrayList<>();
    }
    
    public void agregarSym(Simbolo symb){
        prod.add(symb);
    }

    public ArrayList<Simbolo> getProd() {
        return prod;
    }
    
    public Simbolo getSimbolo(int index){
        return prod.get(index);
    }
    
    public Simbolo getPrimero(){
        return prod.get(0);
    }
    
    public Simbolo getUltimo(){
        return prod.get(prod.size() - 1);
    }
    
    @Override
    public String toString(){
        String data = "";
        for (Simbolo prod1 : prod) {
            data += prod1.getSimbolo();
        }
        return data;
    }
    
}



