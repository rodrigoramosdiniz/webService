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
public class Arvore {
    private No raiz=null;
    
    public void add(int valor){
        raiz = inserir2(raiz, valor);
    }
    
    /* private No inserir(No no, int valor) {
        if (no != null) {
            if (valor < no.elemento) {
                if (no.filhoEsquerdo != null) {
                    no.filhoEsquerdo = inserir(no.filhoEsquerdo, valor);
                } else {
                    no.filhoEsquerdo = new No(valor);
                }
            }
            if (valor > no.elemento) {
                if (no.filhoDireito != null) {
                    no.filhoDireito = inserir(no.filhoDireito, valor);
                } else {
                    no.filhoDireito = new No(valor);
                }
            }
        }else{
            no = new No(valor);
        }
        return no;
    }
*/

   public static No inserir2(No no, int valor){
       if(no == null){
           
            no  = new No(valor); 
           
       }else if(valor < no.elemento){
            
           no.filhoEsquerdo = inserir2(no.filhoEsquerdo, valor);
       }else{
           no.filhoDireito = inserir2(no.filhoDireito, valor);
       }
  
   return no;
   }
    
    public void print(){
        print(raiz, null);
    }
    
    private void print(No no, No pai){
        if(no != null){
            if(pai == null){
                System.out.println("Raíz: "+no.elemento);
            }else{
                System.out.println("No: "+no.elemento+" --- "+pai.elemento);
            }
            print(no.filhoEsquerdo, no);
            print(no.filhoDireito, no);
            
        }
    }
    
    public void preOrdem(){
        preOrdem(raiz);
    }
    
    private void preOrdem(No no) {
        if(no != null){
            System.out.print(no.elemento + " ");
            preOrdem(no.filhoEsquerdo);
            preOrdem(no.filhoDireito);
        }

    }
    
    public void posOrdem(){
        posOrdem(raiz);
    }
    
    private void posOrdem(No no){
        if(no != null){
            posOrdem(no.filhoEsquerdo);
            posOrdem(no.filhoDireito);
            System.out.print(no.elemento + " ");
        }
    }
    
    public void emOrdem(){
        emOrdem(raiz);
    }
      
    private void emOrdem(No no) {
       if(no != null){
            emOrdem(no.filhoEsquerdo);
            System.out.print(no.elemento + " ");
            emOrdem(no.filhoDireito);
        }
    }
    
    public void vixi() {
        System.out.println(vixi2(raiz));
    }
    
    private int vixi2(No no){
        if(no == null)
            return 0;
        
        No esq = no.filhoEsquerdo;
        No dir = no.filhoDireito;
        if(esq == null && dir == null)
            return 1;
        else
        return vixi2(no.filhoEsquerdo) + vixi2(no.filhoDireito);
    }
        
    public No codeQ7(int elemento){
        No no = codeQ7(raiz, elemento);
        
        if(no != null)
            System.out.println("false");
        else
            System.out.println("true");
        return no;
    }

    private No codeQ7(No no, int elemento){
        if(no != null){
            if(no.elemento==elemento){
                return no;
            }

            if(elemento>no.elemento){
                return codeQ7(no.filhoDireito, elemento);
            }

            if(elemento<no.elemento){
                return codeQ7(no.filhoEsquerdo, elemento);
            }
        }
        return null;
    }    
    
    public void codeQ8(){
        System.out.println(codeQ8(raiz));
    }
    
    private int codeQ8(No no){
        return (no == null) ? 0 : 1 + codeQ8(no.filhoEsquerdo) + codeQ8(no.filhoDireito);
    }    
        
}

