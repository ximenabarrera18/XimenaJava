
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/Application.java to edit this template
 */

/**
 *
 * @author Aprendiz
 */
public class Frm06 extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio06
     */
    public Frm06() {
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

        BtnMostrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtNumero2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TxtNumero1 = new javax.swing.JTextField();
        TxtNumero3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtResultadoo = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        BtnMostrar.setText("MOSTRAR");
        BtnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnMostrar);
        BtnMostrar.setBounds(30, 360, 110, 40);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        jLabel1.setText("DIGITAR 3 NUMEROS ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 40, 210, 70);

        jLabel3.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        jLabel3.setText("EJERCICIO 06");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 20, 190, 30);

        TxtNumero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNumero2ActionPerformed(evt);
            }
        });
        getContentPane().add(TxtNumero2);
        TxtNumero2.setBounds(90, 230, 120, 30);

        jLabel6.setText("DIGITE EL NUMERO UNO ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 110, 160, 20);

        jLabel4.setText("DIGITE EL NUMERO DOS ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 200, 160, 20);

        jLabel7.setText("DIGITE EL NUMERO TRES ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 260, 170, 50);

        TxtNumero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNumero1ActionPerformed(evt);
            }
        });
        getContentPane().add(TxtNumero1);
        TxtNumero1.setBounds(100, 140, 120, 30);

        TxtNumero3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNumero3ActionPerformed(evt);
            }
        });
        getContentPane().add(TxtNumero3);
        TxtNumero3.setBounds(90, 310, 120, 30);

        TxtResultadoo.setColumns(20);
        TxtResultadoo.setRows(5);
        jScrollPane1.setViewportView(TxtResultadoo);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 410, 240, 100);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/03.jpg"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 292, 518);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void BtnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMostrarActionPerformed
        // TODO add your handling code here:
        try{
            int mayor=0;
        int menor=0;
        int medio=0;
        
        int num1=Integer.parseInt(TxtNumero1.getText());
        int num2 = Integer.parseInt(TxtNumero2.getText());
        int num3 = Integer.parseInt(TxtNumero3.getText());
          if (num1==num2 && num1==num3 ) {
           JOptionPane.showMessageDialog(this, "Números iguales",
                   "IGUALES", JOptionPane.ERROR_MESSAGE);
       }
       if (num1==num3) {
        JOptionPane.showMessageDialog(this, "Números iguales",
                   "IGUALES", JOptionPane.ERROR_MESSAGE);
       }else if(num1==num2){
           JOptionPane.showMessageDialog(this, "Números iguales"
                   ,"No válido", JOptionPane.ERROR_MESSAGE);
       }
       if(num2==num3){
           JOptionPane.showMessageDialog(this, "Números iguales",
                   "No válido", JOptionPane.ERROR_MESSAGE);
       }
       
      if(num1>0 && num2>00 && num3>0){
          if((num1>num2)&&(num1>num3)){
            mayor = num1;
            medio = Math.max(num2, num3);
            menor = Math.min(num2, num3); 
       }else if((num2>num1)&&(num2>num3)){
            mayor= num2;
            medio = Math.max(num1, num3);
            menor= Math.min(num1, num3);
       }else{
            mayor= num3;
            medio =Math.max(num1, num2);
            menor = Math.min(num1, num2);
       }
       //Mostrar resultado
       TxtResultadoo.setText(mayor+" Este es el número mayor \n"+medio+" Este es el número medio \n"+menor+" Este es el numero menor");
       
      }else{
          JOptionPane.showMessageDialog(this, "Números negativos",
                   "No válido", JOptionPane.ERROR_MESSAGE);
      }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "No permitido",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
  
      //
    }//GEN-LAST:event_BtnMostrarActionPerformed

    private void TxtNumero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNumero2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNumero2ActionPerformed

    private void TxtNumero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNumero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNumero1ActionPerformed

    private void TxtNumero3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNumero3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNumero3ActionPerformed

    /**
     * @param args the command line argumentss
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
            java.util.logging.Logger.getLogger(Frm06.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm06.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm06.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm06.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Frm06().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnMostrar;
    private javax.swing.JTextField TxtNumero1;
    private javax.swing.JTextField TxtNumero2;
    private javax.swing.JTextField TxtNumero3;
    private javax.swing.JTextArea TxtResultadoo;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}