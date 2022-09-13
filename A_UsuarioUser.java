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
public class A_UsuarioUser extends A_Usuario {
    
    public void Nome(String nome) {
        System.out.println("Nome = "+nome);        
    }
    
    public void Idade(int idade) {
        System.out.println("Idade = "+idade);        
    }
    
    public void Telefone(int telefone) {
        System.out.println("Telefone = "+telefone);        
    }
    
    public void Email(String email) {
        System.out.println("Email = "+email);        
    }
    
    public void Endereco(String endereco) {
        System.out.println("Endereco = "+endereco);        
    }
}
