/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;

import java.io.File;

/**
 *
 * @author Rennan
 */
public class DocumentoMarkDown extends Documento {
    
    public DocumentoMarkDown(String _nome, String _prof, String _email){
        super(_nome, _prof, _email);
    }
    
    @Override
    public void escreverArquivo(String _nome) {
        File file = new File (_nome);
        
    }
    
}
