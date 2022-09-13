/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciamento_de_biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author AndreyFernandesTraja
 */
public class F_Emprestimo extends javax.swing.JFrame {

    /**
     * Creates new form F_Emprestimo
     */
    public F_Emprestimo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_usuario = new javax.swing.JLabel();
        lbl_livro = new javax.swing.JLabel();
        lbl_emprestimo = new javax.swing.JLabel();
        lbl_inicio = new javax.swing.JLabel();
        lbl_devolucao = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        txt_livro = new javax.swing.JTextField();
        txt_emprestimo = new javax.swing.JTextField();
        txt_inicio = new javax.swing.JTextField();
        txt_devolucao = new javax.swing.JTextField();
        bt_cadastrar = new javax.swing.JButton();
        bt_pesquisar = new javax.swing.JButton();
        bt_atualizar = new javax.swing.JButton();
        bt_deletar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_usuario.setText("Usuario:");

        lbl_livro.setText("ID_Livro:");

        lbl_emprestimo.setText("ID_Emprestimo:");

        lbl_inicio.setText("Data Inicio:");

        lbl_devolucao.setText("Data Devolução:");

        bt_cadastrar.setText("Cadastrar");
        bt_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cadastrarActionPerformed(evt);
            }
        });

        bt_pesquisar.setText("Pesquisar");
        bt_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pesquisarActionPerformed(evt);
            }
        });

        bt_atualizar.setText("Atualizar");
        bt_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_atualizarActionPerformed(evt);
            }
        });

        bt_deletar.setText("Deletar");
        bt_deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_deletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_usuario)
                    .addComponent(lbl_livro)
                    .addComponent(lbl_emprestimo)
                    .addComponent(lbl_inicio)
                    .addComponent(lbl_devolucao))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_devolucao)
                    .addComponent(txt_inicio)
                    .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_livro)
                    .addComponent(txt_emprestimo))
                .addGap(181, 181, 181))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(bt_cadastrar)
                .addGap(18, 18, 18)
                .addComponent(bt_pesquisar)
                .addGap(18, 18, 18)
                .addComponent(bt_atualizar)
                .addGap(18, 18, 18)
                .addComponent(bt_deletar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_usuario)
                    .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_livro)
                    .addComponent(txt_livro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_emprestimo)
                    .addComponent(txt_emprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_inicio)
                    .addComponent(txt_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_devolucao)
                    .addComponent(txt_devolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_cadastrar)
                    .addComponent(bt_pesquisar)
                    .addComponent(bt_atualizar)
                    .addComponent(bt_deletar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cadastrarActionPerformed
        // TODO add your handling code here:
        /*try
        {
            String Usuario = txt_usuario.getText();
            int Livro = Integer.parseInt(txt_livro.getText());
            int Emprestimo = Integer.parseInt(txt_emprestimo.getText());
            String Inicio = txt_inicio.getText();
            String Devolucao = txt_devolucao.getText(); 
        }
        catch (NumberFormatException a) 
        {
            System.out.println("Erro no formato do valor");
            System.out.println(a.fillInStackTrace());
        }
        catch (Exception e)
        {
            System.out.println("ERRO!!! Foi mal :)");
            System.out.println(e.fillInStackTrace());
        }*/
        try {
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);
            String servidor = "193.123.108.138"; //caminho do servidor do BD
            String database = "progb2022"; //nome do banco de dados
            String url = "jdbc:mysql://" + servidor + "/" + database + "?useUnicode=true&characterEncoding=UTF8";
            System.out.println(url);
            String username = "progb2022";
            String senha = "progb2022";
            Connection conn = DriverManager.getConnection(url, username, senha);
            Statement stmt = conn.createStatement();
            int Livro = Integer.parseInt(txt_livro.getText());
            int Emprestimo = Integer.parseInt(txt_emprestimo.getText());
            int Usuario = Integer.parseInt(txt_usuario.getText());
            
            String Inicio = txt_inicio.getText();
            String Devolucao = txt_devolucao.getText();
            String sql  = "INSERT INTO andrey_emprestimo(usuario,id_livro,ID_emprestimo,data_inicio,data_fim) VALUES('"+Usuario+"','"+Livro+"','"+Emprestimo+"','"+Inicio+"','"+Devolucao+"');";
            System.out.println(sql);
            stmt.execute(sql);            ///preparaco da insercao do registro
            conn.close();
            System.out.println("Salvo no Banco");
            
            
            
        } catch (Exception e){
            System.out.println("erro"+e.getLocalizedMessage());
                        System.out.println("erro"+e.getStackTrace());
        }
    }//GEN-LAST:event_bt_cadastrarActionPerformed

    private void bt_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pesquisarActionPerformed
        // TODO add your handling code here:
        try
        {
            System.out.println("Botão Pesquisar");  
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);
            String servidor = "193.123.108.138"; //caminho do servidor do BD
            String database = "progb2022"; //nome do banco de dados
            String url = "jdbc:mysql://" + servidor + "/" + database + "?useUnicode=true&characterEncoding=UTF8";
            System.out.println(url);
            String username = "progb2022";
            String senha = "progb2022";
            Connection conn = DriverManager.getConnection(url, username, senha);
            Statement stmt = conn.createStatement();
            int Livro = Integer.parseInt(txt_livro.getText());
            int Emprestimo = Integer.parseInt(txt_emprestimo.getText());
            int Usuario = Integer.parseInt(txt_usuario.getText());
            
            String Inicio = txt_inicio.getText();
            String Devolucao = txt_devolucao.getText();
            String sql = "UPDATE andrey_emprestimo SET livro = '"+Livro+"',emprestimo='"+Emprestimo+"',usuario='"+Usuario+"',inicio='"+Inicio+"',devolucao='"+Devolucao+"' WHERE ID = 42;";
            System.out.println(sql);
            stmt.execute(sql);            ///preparaco da insercao do registro
            conn.close();
        }
        catch (NumberFormatException a) 
        {
            System.out.println("Erro no formato do valor");
            System.out.println(a.fillInStackTrace());
        }
        catch (Exception e)
        {
            System.out.println("ERRO!!! Foi mal :)");
            System.out.println(e.fillInStackTrace());
        }
    }//GEN-LAST:event_bt_pesquisarActionPerformed

    private void bt_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_atualizarActionPerformed
        // TODO add your handling code here:
        try
        {
            System.out.println("Botão Atualizar");
        }
        catch (NumberFormatException a) 
        {
            System.out.println("Erro no formato do valor");
            System.out.println(a.fillInStackTrace());
        }
        catch (Exception e)
        {
            System.out.println("ERRO!!! Foi mal :)");
            System.out.println(e.fillInStackTrace());
        }
    }//GEN-LAST:event_bt_atualizarActionPerformed

    private void bt_deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_deletarActionPerformed
        // TODO add your handling code here:
        try {
        String drivername = "com.mysql.jdbc.Driver"; /// driver
        String servidor   = "193.123.108.138"; // 
        String database   = "progb";
        String url        = "jdbc:mysql://193.123.108.138/progb2022";
        String usuario    = "progb2022";
        String senha      = "progb2022";
        Connection conexao  =  DriverManager.getConnection(url,usuario,senha);
        Statement stmt  =  conexao.createStatement();
        String sql = "DELETE FROM andrey_emprestimo WHERE id = 1";
        System.out.println(sql);
        stmt.execute(sql);
        stmt.close();       
        
         
        } catch (Exception e) {
            System.out.println("Erro Generico = "+e.fillInStackTrace());
        }
    }//GEN-LAST:event_bt_deletarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(F_Emprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F_Emprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F_Emprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F_Emprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F_Emprestimo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_atualizar;
    private javax.swing.JButton bt_cadastrar;
    private javax.swing.JButton bt_deletar;
    private javax.swing.JButton bt_pesquisar;
    private javax.swing.JLabel lbl_devolucao;
    private javax.swing.JLabel lbl_emprestimo;
    private javax.swing.JLabel lbl_inicio;
    private javax.swing.JLabel lbl_livro;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JTextField txt_devolucao;
    private javax.swing.JTextField txt_emprestimo;
    private javax.swing.JTextField txt_inicio;
    private javax.swing.JTextField txt_livro;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
