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
public class Usuario {
    //Criar o construtor default
    public  Usuario(){}// criado construtor default
    public Usuario(String nome_Usuario, int telefone_Usuario, String endereco){
        System.out.println("Inicializando o usuario "+nome_Usuario+"\nTelefone = "+telefone_Usuario+"\nEndereço = "+endereco);
    }
   
    
    private int id_usuario = 0;
    private String nome = "";
    private int idade = 0;
    private int telefone = 0;
    private String email = "";
    private String endereco = "";
    
    public void setId_Usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    public int getId_Usuario() {
        return id_usuario;
    }   
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    } 
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    } 
    
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public int getTelefone() {
        return telefone;
    } 
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    } 
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getEndereco() {
        return endereco;
    }
    
    public void inserir(int id_usuario, String nome, int idade, int telefone, String email, String Endereco){
        System.out.println("Nome = "+nome);
            System.out.println("Salvar no banco");
    }
    public void pesquisar(){
        
    }
    public void atualizar(){
        
    }
    public void deletar(){
        
    } 
}
