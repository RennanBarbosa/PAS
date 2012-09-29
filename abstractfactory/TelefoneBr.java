/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author Rennan
 */
class TelefoneBr extends AbstractTel {
    
    private String codigo;
    private String telefone;
    
    
    public TelefoneBr(){
        this.codigo = "55";
    }
    
    @Override
    public void setTelefone(String _tel){
        this.telefone = _tel;
    }
    
    @Override
    public void exibir() {
        System.out.println("("+this.codigo+") "+this.telefone);
    }
    
}
