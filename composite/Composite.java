/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author Rennan
 */
public class Composite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Componente numero = new Numero(4);
        Componente numero2 = new Numero(2);
        Componente numero3 = new Numero(9);
        Componente sub = new Subtracao();        
        Componente soma = new Soma();
        Componente div = new Divisao();
        
        System.out.println("Testando expressão: 4/2");
        div.addComp(numero);
        div.addComp(numero2);
        
        int r = div.calcular();
        System.out.println(r);
        
        
        System.out.println("\nTestando expressão: 9-2");
        sub.addComp(numero3);
        sub.addComp(numero2);
        
        int r2 = sub.calcular();
        System.out.println(r2);
        
        
    }
}
