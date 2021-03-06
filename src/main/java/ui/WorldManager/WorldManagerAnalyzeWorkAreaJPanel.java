/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.WorldManager;

import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JPanel;
import model.UserAccount.UserAccount;

/**
 *
 * @author changxu
 */
public class WorldManagerAnalyzeWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form WorldManagerAnalyzeWorkAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    
    public WorldManagerAnalyzeWorkAreaJPanel(JPanel userProcessContainer, UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        logoEquality = new javax.swing.JLabel();
        lblEquality = new javax.swing.JLabel();
        logoDevelopment = new javax.swing.JLabel();
        lblDevelopment = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 250, 250));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background_vertical.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel3.setText("Analyze World Education Data");

        logoEquality.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-area-chart-64.png"))); // NOI18N
        logoEquality.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoEqualityMouseClicked(evt);
            }
        });

        lblEquality.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblEquality.setText("Education Equality Data");
        lblEquality.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEqualityMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEqualityMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEqualityMouseExited(evt);
            }
        });

        logoDevelopment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-combo-chart-64.png"))); // NOI18N
        logoDevelopment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoDevelopmentMouseClicked(evt);
            }
        });

        lblDevelopment.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblDevelopment.setText("Education Development Data");
        lblDevelopment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDevelopmentMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDevelopmentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDevelopmentMouseExited(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logoEquality, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEquality))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logoDevelopment, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDevelopment))
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 463, Short.MAX_VALUE)
                .addComponent(bg))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg)
                .addGap(0, 25, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoEquality, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblEquality)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoDevelopment, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblDevelopment)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void logoEqualityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoEqualityMouseClicked
        // TODO add your handling code here:
        //        ManagerEducationEqualityJPanel meejp = (ManagerEducationEqualityJPanel) new ManagerEducationEqualityJPanel(userProcessContainer, account, country);
        //        userProcessContainer.add("ManagerEducationEqualityJPanel", meejp);
        //        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        //        crdLyt.next(userProcessContainer);
    }//GEN-LAST:event_logoEqualityMouseClicked

    private void lblEqualityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEqualityMouseClicked
        // TODO add your handling code here:
        WorldEducationEqualityJPanel weejp = (WorldEducationEqualityJPanel) new WorldEducationEqualityJPanel(userProcessContainer, account);
        userProcessContainer.add("WorldEducationEqualityJPanel", weejp);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.next(userProcessContainer);

    }//GEN-LAST:event_lblEqualityMouseClicked

    private void lblEqualityMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEqualityMouseEntered
        // TODO add your handling code here:
        lblEquality.setFont(new Font("Lucida", Font.BOLD, 18));
    }//GEN-LAST:event_lblEqualityMouseEntered

    private void lblEqualityMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEqualityMouseExited
        // TODO add your handling code here:
        lblEquality.setFont(new Font("Lucida", Font.PLAIN, 18));
    }//GEN-LAST:event_lblEqualityMouseExited

    private void logoDevelopmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoDevelopmentMouseClicked
        // TODO add your handling code here:
        //        ManagerEducationDevelopmentJPanel medjp = (ManagerEducationDevelopmentJPanel) new ManagerEducationDevelopmentJPanel(userProcessContainer, account, country);
        //        userProcessContainer.add("ManagerEducationDevelopmentJPanel", medjp);
        //        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        //        crdLyt.next(userProcessContainer);
    }//GEN-LAST:event_logoDevelopmentMouseClicked

    private void lblDevelopmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDevelopmentMouseClicked
        // TODO add your handling code here:
        WorldEducationDevelopmentJPanel wedjp = (WorldEducationDevelopmentJPanel) new WorldEducationDevelopmentJPanel(userProcessContainer, account);
        userProcessContainer.add("WorldEducationDevelopmentJPanel", wedjp);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.next(userProcessContainer);
    }//GEN-LAST:event_lblDevelopmentMouseClicked

    private void lblDevelopmentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDevelopmentMouseEntered
        // TODO add your handling code here:
        lblDevelopment.setFont(new Font("Lucida", Font.BOLD, 18));
    }//GEN-LAST:event_lblDevelopmentMouseEntered

    private void lblDevelopmentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDevelopmentMouseExited
        // TODO add your handling code here:
        lblDevelopment.setFont(new Font("Lucida", Font.PLAIN, 18));
    }//GEN-LAST:event_lblDevelopmentMouseExited

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        back();
    }//GEN-LAST:event_btnBackActionPerformed

    public void back(){
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.last(userProcessContainer);                
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblDevelopment;
    private javax.swing.JLabel lblEquality;
    private javax.swing.JLabel logoDevelopment;
    private javax.swing.JLabel logoEquality;
    // End of variables declaration//GEN-END:variables
}
