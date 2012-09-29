/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author Rennan
 */
public class FactoryEUA extends AbstractFactoryAgenda {
    
    public AbstractTel criarTel(){
        return new TelefoneEUA();
    }
    
    public AbstractEnd criarEnd(){
        return new EnderecoEUA();
    }
    
}
