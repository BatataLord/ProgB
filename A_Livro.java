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
public abstract class A_Livro {
    
    public abstract void ImprimirNomeLivro(String nome_livro);
    public abstract void Nome_Autor(String nome_autor);
    public abstract void publicacao(String publicacao);
    public abstract void genero(String genero);
    public abstract void editora(String editora);
}
