/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author Rennan
 */
public class FactoryBrasil extends AbstractFactoryAgenda{

    @Override
    public AbstractEnd criarEnd() {
        return new EnderecoBr();
    }

    @Override
    public AbstractTel criarTel() {
        return new TelefoneBr();
    }
    
}
