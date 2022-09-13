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
public class Autentica {
    public Autentica(){}
    public Autentica(String usuario, String senha){
    
        System.out.println("Usuario: "+usuario+"Senha: "+senha);
    
        if(usuario.equals("Andrey") && senha.equals("123")){
            System.out.println("Acesso permitido");
        }
        else{
            System.out.println("Acesso negado");
        }
    
    }
}
