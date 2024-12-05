/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.classeapp.imccalculo;

import java.awt.Color;

/**
 *
 * @author 24153592
 */
public class imcCalculo2 extends javax.swing.JFrame {

    /**
     * Creates new form imcCalculo2
     */
    public imcCalculo2() {
        getContentPane().setBackground(Color.PINK);
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

        pesolbl = new javax.swing.JLabel();
        alturalbl = new javax.swing.JLabel();
        pesotxt = new javax.swing.JTextField();
        alturatxt = new javax.swing.JTextField();
        calcularbtn = new javax.swing.JButton();
        imclbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        label = new javax.swing.JLabel();
        resultadoimc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(408, 270));

        pesolbl.setText("Digite seu peso:");

        alturalbl.setText("Altura:");

        pesotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesotxtActionPerformed(evt);
            }
        });

        alturatxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alturatxtActionPerformed(evt);
            }
        });

        calcularbtn.setText("CALCULAR");
        calcularbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularbtnActionPerformed(evt);
            }
        });

        imclbl.setText("IMC:");

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane2.setViewportView(txtArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pesotxt)
                            .addComponent(alturatxt, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)))
                    .addComponent(pesolbl)
                    .addComponent(alturalbl, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(imclbl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(resultadoimc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(calcularbtn, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(label)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pesolbl)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alturalbl)
                            .addComponent(alturatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(imclbl)
                            .addComponent(resultadoimc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(calcularbtn))
                    .addComponent(pesotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(147, 147, 147)
                .addComponent(label)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pesotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesotxtActionPerformed

    private void calcularbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularbtnActionPerformed
        // TODO add your handling code here:                                           
String pesoX = pesotxt .getText();
String alturaX = alturatxt.getText();
        double pesoY = Double.parseDouble(pesoX);
double alturaY = Double.parseDouble(alturaX);

Double imc =pesoY/(alturaY *  alturaY);
String imcS = String.format("%.2f",imc);
resultadoimc.setText("seu imc e  " + imcS); 

txtArea.setText("Tabela IMC\n" +
"\n" +
"Menor que 18,5	   Abaixo do peso\n" +
"18,5 a 24,9	   Normal\n" +
"25 a 29,9	   Sobrepeso\n" +
"30 a 34,9	   Obesidade grau I\n" +
"35 a 39,9	   Obesidade grau II\n" +
"Maior que 40	   Obesidade grau III");
       String Status;
      if(imc < 18.5) {
           Status = ("Magreza");
           label.setText(Status);
       }
       else if (imc >= 18.5&&imc<24.9) {
           Status = ("peso normal");
           label.setText(Status);
       }
       else if (imc >= 25 && imc<29.9) {
           Status = ("Sobrepeso");
           label.setText(Status);
       }
       else if (imc >= 30&& imc < 34.9) {
           Status = ("Obesidade grau 1");
           label.setText(Status);
       }
        else if (imc >= 35&& imc < 39.9) {
           Status = ("Obesidade grau 2");
           label.setText(Status);
        }
        else if (imc > 40) {
           Status = ("Obesidade grau 3");
           label.setText(Status);
        }
    }//GEN-LAST:event_calcularbtnActionPerformed

    private void alturatxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alturatxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alturatxtActionPerformed

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
            java.util.logging.Logger.getLogger(imcCalculo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(imcCalculo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(imcCalculo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(imcCalculo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new imcCalculo2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alturalbl;
    private javax.swing.JTextField alturatxt;
    private javax.swing.JButton calcularbtn;
    private javax.swing.JLabel imclbl;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label;
    private javax.swing.JLabel pesolbl;
    private javax.swing.JTextField pesotxt;
    private javax.swing.JLabel resultadoimc;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}