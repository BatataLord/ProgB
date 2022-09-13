/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciamento_de_biblioteca;

/**
 *
 * @author AndreyFernandesTraja
 */
public class Emprestimo extends Livro {
    
    
    public Emprestimo(){}
    public Emprestimo(int id_usuario, int id_emprestimo, String data_inicio){}
    
    private String usuario = "";
    private int id_livro = 0;
    private int id_emprestimo = 0;
    private String data_inicio = "";
    private String data_fim = "";
    //data devolução
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getUsuario() {
        return usuario;
    }
    
    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }
    public int getId_livro() {
        return id_livro;
    }
    
    public void setId_emprestrimo(int id_emprestimo) {
        this.id_emprestimo = id_emprestimo;
    }
    public int getId_emprestrimo() {
        return id_emprestimo;
    }
    
    public void setData_Inicio(String data_inicio) {
        this.data_inicio = data_inicio;
    }
    public String getData_Inicio() {
        return data_inicio;
    }
    
    public void setData_Fim(String data_fim) {
        this.data_fim = data_fim;
    }
    public String getData_Fim() {
        return data_fim;
    }
    
    
    
    
    
    
    public void inserir(){
        
    }
    public void pesquisar(){
        
    }
    public void atualizar(){
        
    }
    public void deletar(){
        
    }   
}
