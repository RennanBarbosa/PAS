/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author Rennan
 */
public class ThunderSword extends DecoratedWpn{
    
    private int dano;
    
    public ThunderSword(Weapon wpn){
        super(wpn);
        this.dano = 5;
    }
    
    public int getAtk(){
        return super.getAtk()+dano;
    }
}
