/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;

/**
 *
 * @author Rennan
 */
public abstract class Documento {
    private String nome;
    private String prof;
    private String email;


    public Documento(String _nome, String _prof, String _email){
        this.nome = _nome;
        this.prof = _prof;
        this.email = _email;
    }
    
    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getProf() {
        return prof;
    }


    public void setProf(String prof) {
        this.prof = prof;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }
    
    public abstract void escreverArquivo(String _nome);
    
}
