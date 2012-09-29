/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Rennan
 */
public class AbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AbstractFactoryAgenda fabrica = new FactoryBrasil();
        AbstractEnd endereco = fabrica.criarEnd();
        AbstractTel telefone = fabrica.criarTel();
        
        try {
            
            endereco.set("34th Street", "New York", "55555-999");
            telefone.setTelefone("5555-1234");
            System.out.println(endereco);
            telefone.exibir();
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
       
        
    }
}
