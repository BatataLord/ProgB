/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciamento_de_biblioteca;

import javax.swing.JOptionPane;

/**
 *
 * @author AndreyFernandesTraja
 */
public class AutenticaAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        String usuario = JOptionPane.showInputDialog(null,"Informe seu nome ");
        String senha = JOptionPane.showInputDialog(null,"Informe sua senha ");
        
        Autentica aut = new Autentica(usuario, senha);
        */
        
        Autentica aut = new Autentica(JOptionPane.showInputDialog(null,"Informe seu nome "), JOptionPane.showInputDialog(null,"Informe sua senha "));
        
        
    }
    
}
