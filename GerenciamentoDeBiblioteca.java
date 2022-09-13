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
public class GerenciamentoDeBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Livro livro = new Livro("Prog");
        // Livro.id_livro= 001;
        //Livro.livro= "Programação para idiotas";
        //Livro.autor= "Astolfo";
        //Livro.publicacao= "03/03/2022";
        //Livro.genero= "Fantasia";
        livro.setId_Livro(001);
        livro.setLivro("Programação para idiotas");
        livro.setAutor("Astolf");
        livro.setPublicacao("03/03/2022");
        livro.setGenero("Fantasia");
        livro.setEditora("BraZil");
        Estoque esto = new Estoque();
        
        Usuario user = new Usuario ("Andrey", 123, "Martins");
        //user.id_usuario= 1527;
        //user.nome= "Bart";
        //user.idade= 20;
        //user.telefone= 9191;
        //user.email= "bambam@gmail.com";
        //user.endereco= "BlaBla";
               
        //user.inserir(user.nome, user.idade);
        user.setId_Usuario(1527);
        user.setNome("Bart");
        user.setIdade(20);
        user.setTelefone(9191);
        user.setEmail("bambam@gmail.com");
        user.setEndereco("BlaBla");
        
        Emprestimo emprest = new Emprestimo ();
        //emprest.id_usuario= 1527;
        //emprest.id_livro= 001;
        //emprest.id_emprestimo= 999;
        //emprest.data_inicio= "9/3/2022";
        //emprest.data_fim= "16/3/2022";
        emprest.setUsuario("");
        emprest.setId_Livro(001);
        emprest.setId_emprestrimo(999);
        emprest.setData_Inicio("9/3/2022");
        emprest.setData_Fim("16/3/2022");
        
        Comentarios coment = new Comentarios();
        //coment.id_usuario= 1527;
        //coment.id_livro= 001;
        //coment.id_comentario= 857;
        //coment.comentario= "Mucho bueno";
        coment.setId_Usuario(1527);
        coment.setId_Livro(001);
        coment.setId_Comentario(857);
        coment.setComentario("Mucho Bueno");
        
        Compra comp = new Compra();
        //comp.id_usuario= 1527;
        //comp.nome_livro= "Programação Avançada";
        //comp.nome_autor= "Lisa";
        //comp.publicacao= "15/5/2000";
        //comp.genero= "Ficção";
        comp.setId_Usuario(1527);
        comp.setLivro("Programação Avançada");
        comp.setAutor("Lisa");
        comp.setPublicacao("15/5/2022");
        comp.setGenero("Ficção");
        
        //Emprestimo apelido = new Emprestimo();
        //apelido.
        //Comentarios apelido1 = new Comentarios();
        //apelido1.
        
        
    }
   
}
