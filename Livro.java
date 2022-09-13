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
public class Livro {
    //Criar o construtor default
    public Livro(){}// criado construtor default
    public Livro(String nome_livro){
        System.out.println("Nome do livro = "+nome_livro);  
    }
    
    private int id_livro = 0;
    private String livro = "";
    private String autor = "";
    private String publicacao = "";
    private String genero = "";
    private String editora = "";
    //quantidade de livros
    //criar uma classe para o estoque de livros
    public void setId_Livro(int id_livro) {
        this.id_livro = id_livro;
    }
    public int getId_Livro() {
        return id_livro;
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
    
    public void setEditora(String editora) {
        this.editora = editora;
    }
    public String getEditora() {
        return editora;
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
