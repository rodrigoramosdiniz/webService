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
public class TesteArvore {

    public static void main(String[] args) throws Exception {
        
        Arvore arvore = new Arvore();
        arvore.add(12);
        arvore.add(10);
        arvore.add(9);
        arvore.add(11);
        arvore.add(14);
        arvore.add(13);
        arvore.add(16);
        
        
        
        
        System.out.println("Colocando em ordem");
        
        
        arvore.emOrdem();
        System.out.print("-------------");
        arvore.preOrdem();
        System.out.print("------------------");
        arvore.posOrdem();
        arvore.print();
        
        
    }
}
