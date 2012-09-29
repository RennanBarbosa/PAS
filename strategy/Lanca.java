/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author Rennan
 */
public class Lanca implements Weapon{
    
    int atk = 20; //A lança devera tirar menos que a espada, just sayin'
    
    public int getAtk() {
        return atk;
    }
}
