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
public class A_EmprestimoEmprest extends A_Emprestimo {
    
    public void Usuario(String usuario) {
        System.out.println("usuario = "+usuario);        
    }
    
    public void Id_Livro(int id_livro) {
        System.out.println("id_livro = "+id_livro);        
    }
    
    public void Id_Emprestimo(int id_emprestimo) {
        System.out.println("id_emprestimo = "+id_emprestimo);        
    }
    
    public void Data_Inicio(String data_inicio) {
        System.out.println("data_inicio = "+data_inicio);        
    }
    
    public void Data_Fim(String data_fim) {
        System.out.println("data_fim = "+data_fim);        
    }
}
