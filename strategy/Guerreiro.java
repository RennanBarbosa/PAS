/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author Rennan
 */
public class Guerreiro {
    
        private String nome;
	private int life;
	private Weapon wpn;
	private Armor armor;

	public Guerreiro(int _life) {
		this.nome = "";
		this.life = _life;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEnergia() {
		return life;
	}

	public void setEnergia(int dano) {
		this.life = dano;
	}

        public void setArmor(Armor armadura) {
		this.armor = armadura;
	}

	public Armor getArmor() {
		return this.armor;
	}
        
	public void setWpn(Weapon arma) {
		this.wpn = arma;
	}

	public Weapon getWpn(){
		return this.wpn;
	}

	public void atacar(Guerreiro alvo) {

		int dano = this.wpn.getAtk() - alvo.getArmor().getDefesa();
                if (dano <= 0) dano = 0;
                
		alvo.setEnergia(alvo.getEnergia() - dano);

		System.out.println(this.nome + "atacou >> " +alvo.getNome() + " perdeu " + dano + " de life.");
	}
}
