/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifms.tsi.ipli.arvore;

/**
 *
 * @author Rodrigo
 */
public class No {
    
    No filhoEsquerdo=null;
    No filhoDireito=null;
    int elemento;
    
    public No(int valor){
        this.elemento = valor;
    }
}
