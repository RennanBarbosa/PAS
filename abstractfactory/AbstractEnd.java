/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author Rennan
 */
public abstract class AbstractEnd {
    
    public abstract void set (String _rua, String _cidade, String _cep) throws Exception;
    public abstract boolean checarZipCep(String _cod);
    
}
