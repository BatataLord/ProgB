/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciamento_de_biblioteca;

import gerenciamento_de_biblioteca.A_Livro;

/**
 *
 * @author AndreyFernandesTraja
 */
public class A_LivrosBook extends A_Livro {

    
    public void ImprimirNomeLivro(String nome_livro) {
        System.out.println("Nome livro = "+nome_livro);
    }

    public void Nome_Autor(String nome_autor) {
        System.out.println("Nome autor = "+nome_autor);
    }
    
    public void publicacao(String publicacao) {
        System.out.println("publicacao = "+publicacao);
    }
    
    public void genero(String genero) {
        System.out.println("genero = "+genero);
    }
    public void editora(String editora) {
        System.out.println("Nome autor = "+editora);
    }
}
