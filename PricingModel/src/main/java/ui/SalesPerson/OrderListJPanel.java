/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.SalesPerson;

import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Business.Business;
import model.OrderManagement.Order;
import model.SalesManagement.SalesPersonProfile;
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
    SalesPersonProfile salesPersonProfile;

    public OrderListJPanel(JPanel cardSequencePanel, Business business, UserAccount userAccount) {
        initComponents();
        this.cardSequencePanel = cardSequencePanel;
        this.business = business;
        this.userAccount = userAccount;
        this.salesPersonProfile = (SalesPersonProfile) userAccount.getAssociatedPersonProfile();

        populateOrderTable();
        PopulateOrderItemTable();
    }

    private void populateOrderTable() {
        DefaultTableModel model = (DefaultTableModel) jTableCustomerDetails.getModel();
        model.setRowCount(0);
        for (Order order : business.getSalesPersonOrderList(salesPersonProfile).getOrders()) {
            Object[] row = new Object[5];
            row[0] = order;
            row[1] = order.getOrderTotal();
            row[2] = order.getOrderPricePerformance();
            row[3] = order.isOrderAboveTotalTarget();
            model.addRow(row);
        }
    }

    private void PopulateOrderItemTable() {
        int selectedRow = jTableCustomerDetails.getSelectedRow();
        if (selectedRow >= 0) {
            Order order = (Order) jTableCustomerDetails.getValueAt(selectedRow, 0);
            DefaultTableModel model = (DefaultTableModel) jTableOrderItem.getModel();
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneCustomerDetails = new javax.swing.JScrollPane();
        jTableCustomerDetails = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jScrollPaneProductDetails = new javax.swing.JScrollPane();
        jTableOrderItem = new javax.swing.JTable();
        lblProductDetails = new javax.swing.JLabel();
        lblCustomerDetails = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 226, 223));

        jTableCustomerDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Customer", "Order Total", "Price Performance", "Is Above Target"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableCustomerDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableCustomerDetailsMousePressed(evt);
            }
        });
        jScrollPaneCustomerDetails.setViewportView(jTableCustomerDetails);

        btnBack.setBackground(new java.awt.Color(219, 104, 159));
        btnBack.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jTableOrderItem.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPaneProductDetails.setViewportView(jTableOrderItem);

        lblProductDetails.setText("Product Details");

        lblCustomerDetails.setText("Customer Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCustomerDetails)
                    .addComponent(lblProductDetails)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPaneProductDetails)
                        .addComponent(jScrollPaneCustomerDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCustomerDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneCustomerDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblProductDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneProductDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        cardSequencePanel.remove(this);
        CardLayout layout = (CardLayout) cardSequencePanel.getLayout();
        layout.previous(cardSequencePanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void jTableCustomerDetailsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCustomerDetailsMousePressed
        // TODO add your handling code here:
        PopulateOrderItemTable();
    }//GEN-LAST:event_jTableCustomerDetailsMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPaneCustomerDetails;
    private javax.swing.JScrollPane jScrollPaneProductDetails;
    private javax.swing.JTable jTableCustomerDetails;
    private javax.swing.JTable jTableOrderItem;
    private javax.swing.JLabel lblCustomerDetails;
    private javax.swing.JLabel lblProductDetails;
    // End of variables declaration//GEN-END:variables
}