/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author Rennan
 */
public class Strategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Guerreiro warrior;
        Guerreiro mage;
        Guerreiro knight;
        
        Armor chain = new Chain();
        Armor leather = new Leather();
        Armor ultimate = new Ultimate();
        
        Weapon sword = new Espada();
        Weapon lance = new Lanca();
        Weapon knife = new Faca();
        
        warrior = new Guerreiro(50);
        mage = new Guerreiro(80);
        knight = new Guerreiro(60);
        
        warrior.setNome("Chain Warrior ");
        mage.setNome("leather Mage ");
        knight.setNome("Ultimate knight ");
        
        warrior.setArmor(chain);
        mage.setArmor(leather);
        knight.setArmor(ultimate);
        
        warrior.setWpn(lance);
        mage.setWpn(knife);
        knight.setWpn(sword);
        
        System.out.println("TESTE DO STRATEGY");
        warrior.atacar(mage);
        knight.atacar(warrior);
        knight.atacar(knight);
        mage.atacar(warrior);
        
        System.out.println("\nTESTE DO DECORATOR");
        knight.setWpn(new FireSword(new Espada()));
        
        System.out.println("O life do warrior é: "+ warrior.getEnergia());
        System.out.println("A espada do Knight deve tirar 15! Pois está encantada com fogo.");
        knight.atacar(warrior);
        System.out.println("O poderoso guerreiro defendeu 5 de dano com a armadura.");
        
    }
}
