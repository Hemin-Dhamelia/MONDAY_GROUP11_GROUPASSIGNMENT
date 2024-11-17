/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Marketing;

import java.awt.CardLayout;
import javax.swing.JPanel;
import model.Business.Business;
import model.UserAccountManagement.UserAccount;
import ui.SalesAnalytics.SupplierAnalyticsJPanel;

/**
 *
 * @author Group-11
 */
public class MarketingHomeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MarketingHomeJPanel
     */
    JPanel cardSequencePanel;
    Business business;
    UserAccount userAccount;
    public MarketingHomeJPanel(JPanel cardSequencePanel, Business business, UserAccount userAccount) {
        initComponents();
        this.cardSequencePanel = cardSequencePanel;
        this.business = business;
        this.userAccount = userAccount;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOrderList = new javax.swing.JButton();
        btnSupplierReport = new javax.swing.JButton();
        btnUpdateTargetPrice = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 226, 223));

        btnOrderList.setBackground(new java.awt.Color(219, 104, 159));
        btnOrderList.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnOrderList.setForeground(new java.awt.Color(255, 255, 255));
        btnOrderList.setText("Order List");
        btnOrderList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderListActionPerformed(evt);
            }
        });

        btnSupplierReport.setBackground(new java.awt.Color(219, 104, 159));
        btnSupplierReport.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnSupplierReport.setForeground(new java.awt.Color(255, 255, 255));
        btnSupplierReport.setText("Supplier Report");
        btnSupplierReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplierReportActionPerformed(evt);
            }
        });

        btnUpdateTargetPrice.setBackground(new java.awt.Color(219, 104, 159));
        btnUpdateTargetPrice.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnUpdateTargetPrice.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateTargetPrice.setText("Update Target Price");
        btnUpdateTargetPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTargetPriceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSupplierReport, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnOrderList, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                        .addComponent(btnUpdateTargetPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(355, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btnOrderList, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnUpdateTargetPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnSupplierReport, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderListActionPerformed
        // TODO add your handling code here:
       OrderListJPanel orderListJPanel = new OrderListJPanel(cardSequencePanel, business, userAccount);
       cardSequencePanel.add("OrderListJPanel", orderListJPanel);
       CardLayout layout = (CardLayout) cardSequencePanel.getLayout();
       layout.next(cardSequencePanel);
    }//GEN-LAST:event_btnOrderListActionPerformed

    private void btnSupplierReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplierReportActionPerformed
        // TODO add your handling code here:
        SupplierAnalyticsJPanel supplierAnalyticsJPanel = new SupplierAnalyticsJPanel(cardSequencePanel, business, userAccount);
        cardSequencePanel.add("SupplierAnalyticsJPanel", supplierAnalyticsJPanel);
        CardLayout layout = (CardLayout) cardSequencePanel.getLayout();
        layout.next(cardSequencePanel);
    }//GEN-LAST:event_btnSupplierReportActionPerformed

    private void btnUpdateTargetPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateTargetPriceActionPerformed
        // TODO add your handling code here:
        UpdateTargetPriceJPanel updateTargetPriceJPanel = new UpdateTargetPriceJPanel(cardSequencePanel, business, userAccount);
        cardSequencePanel.add("SupplierAnalyticsJPanel", updateTargetPriceJPanel);
        CardLayout layout = (CardLayout) cardSequencePanel.getLayout();
        layout.next(cardSequencePanel);
    }//GEN-LAST:event_btnUpdateTargetPriceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrderList;
    private javax.swing.JButton btnSupplierReport;
    private javax.swing.JButton btnUpdateTargetPrice;
    // End of variables declaration//GEN-END:variables
}
