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
public class EnderecoEUA extends AbstractEnd {
    
    private String rua;
    private String cidade;
    private String zip;

    Pattern pattern = Pattern.compile("\\d{5,5}-\\d{4,4}");
    
    public EnderecoEUA(){
    }
    
    @Override
    public void set(String _rua, String _cidade, String _zip) throws Exception{
        if (this.checarZipCep(_zip))
            this.zip = _zip;
        else
            throw new Exception("Erro de formatação do Zip Code.");
        
        this.cidade = _cidade;
        this.rua = _rua;
    }
    
    @Override
    public boolean checarZipCep(String _zip) {
        Matcher matcher = pattern.matcher(_zip);
        return (matcher.find());
    }
    
    public String toString(){
        return (this.rua+", "+this.cidade+", "+this.zip);
    }
    
}
