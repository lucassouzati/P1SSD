/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1ssd;

import java.util.ArrayList;

/**
 *
 * @author lsiqueira
 */
public class Atributo {
    
   private String nome;
   private ArrayList<String> valores;

    public Atributo() {
    }

    public Atributo(String nome, ArrayList<String> valores) {
        this.nome = nome;
        this.valores = valores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getValores() {
        return valores;
    }

    public void setValores(ArrayList<String> valores) {
        this.valores = valores;
    }

  
  
   
    
}
