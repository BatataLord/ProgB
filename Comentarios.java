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
public class Comentarios extends Usuario {
    //Criar o construtor default
    public Comentarios(){}// criado construtor default
    
   
    private int id_livro = 0;
    private int id_comentario = 0;
    private String comentario = "";
    
    
    public void setId_Livro(int id_livro) {
        this.id_livro = id_livro;
    }
    public int getId_Livro() {
        return id_livro;
    }
    
    public void setId_Comentario(int id_comentario) {
        this.id_comentario = id_comentario;
    }
    public int getId_Comentario() {
        return id_comentario;
    }
    
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    public String getComentario() {
        return comentario;
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
