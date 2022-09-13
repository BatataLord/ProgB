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
public class Compra {
    //Criar o construtor default
    public Compra(){}// criado construtor default
    public Compra (String nome_livro, String nome_autor, String publicacao){}
    
    private int id_usuario = 0;
    private String livro = "";
    private String autor = "";
    private String publicacao = "";
    private String genero = "";
    
    public void setId_Usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    public int getId_Usuario() {
        return id_usuario;
    }
    
    public void setLivro(String livro) {
        this.livro = livro;
    }
    public String getLivro() {
        return livro;
    }
        
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAutor() {
        return autor;
    }
        
    public void setPublicacao(String publicacao) {
        this.publicacao = publicacao;
    }
    public String getPublicacao() {
        return publicacao;
    }
        
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getGenero() {
        return genero;
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
