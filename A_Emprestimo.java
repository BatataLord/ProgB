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
public abstract class A_Emprestimo {
    
    public abstract void Usuario (String usuario);
    public abstract void Id_Livro (int id_livro);
    public abstract void Id_Emprestimo (int id_emprestimo);
    public abstract void Data_Inicio (String data_inicio);
    public abstract void Data_Fim (String data_fim);
}
