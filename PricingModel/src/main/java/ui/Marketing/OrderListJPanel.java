/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Marketing;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Business.Business;
import model.OrderManagement.MasterOrderList;
import model.OrderManagement.Order;
import model.ProductManagement.ProductSummary;
import model.UserAccountManagement.UserAccount;

/**
 *
 * @author Group-11
 */
public class OrderListJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderListJPanel
     */
    JPanel cardSequencePanel;
    Business business;
    UserAccount userAccount;
    MasterOrderList masterOrderList;
    
    public OrderListJPanel(JPanel cardSequencePanel, Business business, UserAccount userAccount) {
        initComponents();
        this.cardSequencePanel = cardSequencePanel;
        this.business = business;
        this.userAccount = userAccount;
        this.masterOrderList = business.getMasterOrderList();
        populateOrderDetails();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneOrderDetails = new javax.swing.JScrollPane();
        tblOrderDetails = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jScrollPaneProductInfo = new javax.swing.JScrollPane();
        tblProductInfo = new javax.swing.JTable();
        lblOrderDetails = new javax.swing.JLabel();
        lblProductInfo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 226, 223));

        tblOrderDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Sales Person", "Customer", "Status", "Total Order", "Price Performance", "Is Above Target"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblOrderDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblOrderDetailsMousePressed(evt);
            }
        });
        jScrollPaneOrderDetails.setViewportView(tblOrderDetails);

        btnBack.setBackground(new java.awt.Color(219, 104, 159));
        btnBack.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblProductInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product", "Actual Price", "Quantity", "Is Above Target"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPaneProductInfo.setViewportView(tblProductInfo);

        lblOrderDetails.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblOrderDetails.setText("Order Details:");

        lblProductInfo.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblProductInfo.setText("Product Info:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPaneOrderDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProductInfo)
                            .addComponent(jScrollPaneProductInfo)))
                    .addComponent(lblOrderDetails))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblProductInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPaneProductInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(lblOrderDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPaneOrderDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        cardSequencePanel.remove(this);
        CardLayout layout = (CardLayout) cardSequencePanel.getLayout();
        layout.previous(cardSequencePanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void tblOrderDetailsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrderDetailsMousePressed
        // TODO add your handling code here:
        PopulateOrderItemTable();
    }//GEN-LAST:event_tblOrderDetailsMousePressed

    public void populateOrderDetails(){
        DefaultTableModel model = (DefaultTableModel) tblOrderDetails.getModel();
        model.setRowCount(0);
        for (Order orderList : masterOrderList.getOrders()) {
            Object[] row = new Object[6];
            row[0] = orderList.getSalesperson().getPerson();
            row[1] = orderList.getCustomer().getPerson();
            row[2] = orderList;
            row[3] = orderList.getOrderTotal();
            row[4] = orderList.getOrderPricePerformance();
            row[5] = orderList.isOrderAboveTotalTarget();
            model.addRow(row);
            }
    }
    
    private void PopulateOrderItemTable() {
        int selectedRow = tblOrderDetails.getSelectedRow();
        if (selectedRow >= 0) {
            Order order = (Order) tblOrderDetails.getValueAt(selectedRow, 2);
            DefaultTableModel model = (DefaultTableModel) tblProductInfo.getModel();
            model.setRowCount(0);
            for (model.OrderManagement.OrderItem oi : order.getOrderitems()) {
                Object[] row = new Object[4];
                row[0] = oi.getSelectedProduct();
                row[1] = oi.getActualPrice();
                row[2] = oi.getQuantity();
                row[3] = oi.isActualAboveTarget();
                model.addRow(row);
            }
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPaneOrderDetails;
    private javax.swing.JScrollPane jScrollPaneProductInfo;
    private javax.swing.JLabel lblOrderDetails;
    private javax.swing.JLabel lblProductInfo;
    private javax.swing.JTable tblOrderDetails;
    private javax.swing.JTable tblProductInfo;
    // End of variables declaration//GEN-END:variables
}
