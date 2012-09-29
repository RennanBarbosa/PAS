/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rennan
 */
public class Soma implements Componente{
   
    private List<Componente> expr = new ArrayList<Componente>();

    public Soma(){
    }

    public void addComp(Componente n){
        expr.add(n);
    }

    public int calcular(){
	int result = 0;
	for(int i=0; i < expr.size(); i++)
            result += expr.get(i).calcular();
	return result;
    }
}
