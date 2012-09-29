/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author Rennan
 */
public class Numero implements Componente{
    private int n;
    
    public Numero(int _n){
        this.n = _n;
    }
    
    public int calcular(){
        return n;
    }
    
    public void addComp(Componente expr){
        //Vazio.
    }
}
