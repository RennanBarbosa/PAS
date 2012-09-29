/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Rennan
 */
public class EnderecoBr extends AbstractEnd {
    
    private String rua;
    private String cidade;
    private String cep;

    Pattern pattern = Pattern.compile("\\d{5,5}-\\d{3,3}");
    
    public EnderecoBr(){
    }
    
    @Override
    public void set(String _rua, String _cidade, String _cep) throws Exception{
        if (this.checarZipCep(_cep))
            this.cep = _cep;
        else
            throw new Exception("Erro de formatação do CEP.");
        
        this.cidade = _cidade;
        this.rua = _rua;
    }
    
    @Override
    public boolean checarZipCep(String _cep) {
        Matcher matcher = pattern.matcher(_cep);
        return (matcher.find());
    }
    
    public String toString(){
        return (this.rua+", "+this.cidade+", "+this.cep);
    }
    
}
