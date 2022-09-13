import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lianderson.brum
 */
public class MeuPrimeiroInsert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);
            String servidor = "193.123.108.138";    //caminho do servidor do BD
            String database = "progb2022";        //nome do seu banco de dados
            String url = "jdbc:mysql://" + servidor + "/" + database + "?useUnicode=true&characterEncoding=UTF8";
            System.out.println("url"+url);
            String usuario = "progb2022";        //nome de um usuário de seu BD      
            String senha    = "progb2022";      //sua senha de acesso
            
            Connection conn = DriverManager.getConnection(url, usuario, senha);
            Statement stmt = conn.createStatement();
            String nome      = JOptionPane.showInputDialog(null, "Informe seu nome");
            String telefone  = "33652541";
            String sql  = "INSERT INTO lianderson_pessoa(nome,telefone) VALUES('"+nome+"','"+telefone+"');";
            System.out.println(sql);
            stmt.execute(sql);            ///preparaco da insercao do registro
            conn.close();
            System.out.println("Salvo no Banco");
            
            
            
        
        
        
        
        } catch (Exception e) {
            System.out.println("erro"+e.getLocalizedMessage());
        }
        
    }
    
}
