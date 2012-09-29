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
public class Subtracao implements Componente{
   
    private List<Componente> expr = new ArrayList<Componente>();

    public Subtracao(){
    }

    public void addComp(Componente n){
        expr.add(n);
    }

    public int calcular(){
	int result = expr.get(0).calcular();
	for(int i=1; i < expr.size(); i++)
            result -= expr.get(i).calcular();
	return result;
    }
}
