/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author Rennan
 * Parte do Exericio Decorator!
 */
public class DecoratedWpn implements Weapon{
    
    private Weapon reference = null;
    
    public DecoratedWpn (Weapon reference){
        this.reference = reference;
    }
    

    public int getAtk() {
        return reference.getAtk();
    }
    
}
