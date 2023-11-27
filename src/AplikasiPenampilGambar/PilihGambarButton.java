/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author user
 */
public class PilihGambarButton extends javax.swing.JFrame {

    /**
     * Creates new form PilihGambarButton
     */
    public PilihGambarButton() {
        initComponents();
        
         Dimension screenSize = 
         Toolkit.getDefaultToolkit().getScreenSize();
            Dimension frameSize = this.getSize();
            if (frameSize.height > screenSize.height) {
                frameSize.height = screenSize.height;
            }
            if (frameSize.width > screenSize.width) {
                frameSize.width = screenSize.width;
            }
            this.setLocation(
                    (screenSize.width - frameSize.width) / 2, 
                    (screenSize.height - frameSize.height) / 2); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPanel = new javax.swing.JPanel();
        btnCF = new javax.swing.JButton();
        btnCook = new javax.swing.JButton();
        btnFruit = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        imagePanel = new javax.swing.JPanel();
        lbCook = new javax.swing.JLabel();
        lbCF = new javax.swing.JLabel();
        lbFruit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonPanel.setBackground(new java.awt.Color(0, 0, 0));

        btnCF.setText("CHEF");
        btnCF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCFActionPerformed(evt);
            }
        });
        buttonPanel.add(btnCF);

        btnCook.setText("COOKING");
        btnCook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCookActionPerformed(evt);
            }
        });
        buttonPanel.add(btnCook);

        btnFruit.setText("FRUIT");
        btnFruit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFruitActionPerformed(evt);
            }
        });
        buttonPanel.add(btnFruit);

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        buttonPanel.add(btnExit);

        getContentPane().add(buttonPanel, java.awt.BorderLayout.PAGE_START);

        imagePanel.setLayout(new java.awt.CardLayout());

        lbCook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cooking mama.jpg"))); // NOI18N
        imagePanel.add(lbCook, "0");

        lbCF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Chefwars.jpg"))); // NOI18N
        imagePanel.add(lbCF, "1");

        lbFruit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fruitydiary.jpg"))); // NOI18N
        imagePanel.add(lbFruit, "2");

        getContentPane().add(imagePanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCFActionPerformed
        CardLayout cl = (CardLayout)(imagePanel.getLayout());
        cl.show(imagePanel, "1");
    }//GEN-LAST:event_btnCFActionPerformed

    private void btnCookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCookActionPerformed
         CardLayout cl = (CardLayout)(imagePanel.getLayout());
        cl.show(imagePanel, "0");
    }//GEN-LAST:event_btnCookActionPerformed

    private void btnFruitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFruitActionPerformed
         CardLayout cl = (CardLayout)(imagePanel.getLayout());
        cl.show(imagePanel, "2");
    }//GEN-LAST:event_btnFruitActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilihGambarButton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCF;
    private javax.swing.JButton btnCook;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFruit;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JLabel lbCF;
    private javax.swing.JLabel lbCook;
    private javax.swing.JLabel lbFruit;
    // End of variables declaration//GEN-END:variables
}
