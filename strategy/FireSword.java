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
public class FireSword extends DecoratedWpn{
    
    private int dano;
    
    public FireSword(Weapon wpn){
        super(wpn);
        this.dano = 5;
    }
    
    public int getAtk(){
        return super.getAtk()+dano;
    }
}
