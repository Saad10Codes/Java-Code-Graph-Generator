/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 *
 * @author User
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        ListModel inv;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabPanels = new javax.swing.JTabbedPane();
        salePanel = new javax.swing.JPanel();
        selectedPanel = new javax.swing.JPanel();
        lblPOSName = new javax.swing.JLabel();
        lblPOSPrice = new javax.swing.JLabel();
        lblPOSDesc = new javax.swing.JLabel();
        cartPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        checkoutList = new javax.swing.JList();
        cartRemove = new javax.swing.JButton();
        paymentButton = new javax.swing.JButton();
        lblPOSSubTotal = new javax.swing.JLabel();
        lblPOSTax = new javax.swing.JLabel();
        lblPOSTotal = new javax.swing.JLabel();
        jcbPOSItems = new javax.swing.JComboBox();
        btnPOSAdd = new javax.swing.JButton();
        invPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jliInvLog = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        invDisplay = new javax.swing.JList();
        incDisplayPanel = new javax.swing.JPanel();
        lblInvName = new javax.swing.JLabel();
        lblInvPrice = new javax.swing.JLabel();
        lblInvCost = new javax.swing.JLabel();
        lblInvStock = new javax.swing.JLabel();
        lblInvDesc = new javax.swing.JLabel();
        btnInvEdit = new javax.swing.JButton();
        btnInvDelete = new javax.swing.JButton();
        btnInvRestock = new javax.swing.JButton();
        invAddToCart = new javax.swing.JButton();
        newItemButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPOSName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPOSName.setText("Product Name");

        lblPOSPrice.setText("Price");

        lblPOSDesc.setText("Description");
        lblPOSDesc.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout selectedPanelLayout = new javax.swing.GroupLayout(selectedPanel);
        selectedPanel.setLayout(selectedPanelLayout);
        selectedPanelLayout.setHorizontalGroup(
            selectedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectedPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(selectedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPOSName)
                    .addGroup(selectedPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(selectedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(selectedPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblPOSDesc, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                            .addComponent(lblPOSPrice))))
                .addContainerGap())
        );
        selectedPanelLayout.setVerticalGroup(
            selectedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectedPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPOSName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPOSPrice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPOSDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(283, 283, 283))
        );

        checkoutList.setModel(new javax.swing.DefaultListModel());
        checkoutList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                checkoutListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(checkoutList);

        cartRemove.setText("Remove / Refund");
        cartRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartRemoveActionPerformed(evt);
            }
        });

        paymentButton.setText("Proceed To Payment");
        paymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentButtonActionPerformed(evt);
            }
        });

        lblPOSSubTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPOSSubTotal.setText("<html>\n<b>Sub Total</b> $0.00\n</html>");

        lblPOSTax.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPOSTax.setText("<html>\n<b>Tax</b> $0.00\n</html>");

        lblPOSTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPOSTotal.setText("<html>\n<b>Total</b> $0.00\n</html>");

        javax.swing.GroupLayout cartPanelLayout = new javax.swing.GroupLayout(cartPanel);
        cartPanel.setLayout(cartPanelLayout);
        cartPanelLayout.setHorizontalGroup(
            cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cartPanelLayout.createSequentialGroup()
                        .addComponent(cartRemove, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(paymentButton, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addComponent(lblPOSSubTotal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPOSTax)
                    .addComponent(lblPOSTotal))
                .addContainerGap())
        );
        cartPanelLayout.setVerticalGroup(
            cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cartPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPOSSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lblPOSTax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPOSTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cartRemove)
                    .addComponent(paymentButton))
                .addContainerGap())
        );

        jcbPOSItems.setModel(new javax.swing.DefaultComboBoxModel<Item>());

        btnPOSAdd.setText("Add");
        btnPOSAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPOSAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout salePanelLayout = new javax.swing.GroupLayout(salePanel);
        salePanel.setLayout(salePanelLayout);
        salePanelLayout.setHorizontalGroup(
            salePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(salePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(selectedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salePanelLayout.createSequentialGroup()
                        .addComponent(jcbPOSItems, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPOSAdd)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        salePanelLayout.setVerticalGroup(
            salePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(salePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(salePanelLayout.createSequentialGroup()
                        .addGroup(salePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbPOSItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPOSAdd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectedPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        selectedPanel.getAccessibleContext().setAccessibleName("");

        tabPanels.addTab("Point-of-Sale", salePanel);

        jliInvLog.setModel(new javax.swing.DefaultListModel());
        jScrollPane2.setViewportView(jliInvLog);

        invDisplay.setModel(new javax.swing.DefaultListModel<Item>());
        invDisplay.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        invDisplay.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                invDisplayValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(invDisplay);

        lblInvName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblInvName.setText("Product Name");

        lblInvPrice.setText("Price");

        lblInvCost.setText("Wholesale Cost");

        lblInvStock.setText("Stock");

        lblInvDesc.setText("Description");
        lblInvDesc.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnInvEdit.setText("Edit");
        btnInvEdit.setEnabled(false);
        btnInvEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvEditActionPerformed(evt);
            }
        });

        btnInvDelete.setText("Delete");
        btnInvDelete.setEnabled(false);
        btnInvDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvDeleteActionPerformed(evt);
            }
        });

        btnInvRestock.setText("Restock");
        btnInvRestock.setEnabled(false);
        btnInvRestock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvRestockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout incDisplayPanelLayout = new javax.swing.GroupLayout(incDisplayPanel);
        incDisplayPanel.setLayout(incDisplayPanelLayout);
        incDisplayPanelLayout.setHorizontalGroup(
            incDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(incDisplayPanelLayout.createSequentialGroup()
                .addGroup(incDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(incDisplayPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(incDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInvName)
                            .addGroup(incDisplayPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(incDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblInvCost)
                                    .addComponent(lblInvPrice)
                                    .addComponent(lblInvStock))))
                        .addGap(0, 408, Short.MAX_VALUE))
                    .addGroup(incDisplayPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblInvDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, incDisplayPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnInvDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInvEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInvRestock)))
                .addContainerGap())
        );
        incDisplayPanelLayout.setVerticalGroup(
            incDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(incDisplayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInvName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInvPrice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInvCost)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInvStock)
                .addGap(18, 18, 18)
                .addComponent(lblInvDesc, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(incDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInvEdit)
                    .addComponent(btnInvDelete)
                    .addComponent(btnInvRestock)))
        );

        invAddToCart.setText("Add To Cart");
        invAddToCart.setToolTipText("");
        invAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invAddToCartActionPerformed(evt);
            }
        });

        newItemButton.setText("New Item");
        newItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newItemButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout invPanelLayout = new javax.swing.GroupLayout(invPanel);
        invPanel.setLayout(invPanelLayout);
        invPanelLayout.setHorizontalGroup(
            invPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(invPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(invPanelLayout.createSequentialGroup()
                        .addComponent(newItemButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(invAddToCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(invPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(incDisplayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE))
                .addContainerGap())
        );
        invPanelLayout.setVerticalGroup(
            invPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(invPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(invPanelLayout.createSequentialGroup()
                        .addGroup(invPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newItemButton)
                            .addComponent(invAddToCart))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3))
                    .addGroup(invPanelLayout.createSequentialGroup()
                        .addComponent(incDisplayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tabPanels.addTab("Inventory", invPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabPanels)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabPanels)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newItemButtonActionPerformed
        //show the add item dialog
        NewItemDialog nid = new NewItemDialog();
        nid.showDialog();
    }//GEN-LAST:event_newItemButtonActionPerformed

    private void invAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invAddToCartActionPerformed
        //add currently selected item to cart
        if (invDisplay.getSelectedIndex() != -1) {
            FinalProject.cart.add((Item)invDisplay.getSelectedValue());
        }
    }//GEN-LAST:event_invAddToCartActionPerformed

    private void cartRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartRemoveActionPerformed
        //check if we have actually selected anything
        if (checkoutList.getSelectedIndex() != -1) {
            FinalProject.cart.remove(checkoutList.getSelectedIndex());
            FinalProject.clearPOSInfo();
        }
        
    }//GEN-LAST:event_cartRemoveActionPerformed

    private void invDisplayValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_invDisplayValueChanged
        //selected an item
        if (invDisplay.getSelectedIndex() != -1) { //if selected
            //load the item
            FinalProject.loadItem(((Item)invDisplay.getSelectedValue()).id);
        }
    }//GEN-LAST:event_invDisplayValueChanged

    private void btnInvDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvDeleteActionPerformed
        if (FinalProject.lastLoadedId != -1) { //check if anything is actually loaded
            //it is, prompt for confirmation
            int res = JOptionPane.showConfirmDialog(this, 
                    "Are you sure you want to delete this product?", "Confirm", 
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            
            if (res == JOptionPane.YES_OPTION) {
                FinalProject.db.deleteItem(FinalProject.lastLoadedId); //delete the item
                FinalProject.loadItems(); //reload the item list
            }
        }
    }//GEN-LAST:event_btnInvDeleteActionPerformed

    private void btnInvRestockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvRestockActionPerformed
        //show the restocking GUI
        RestockDialog rd = new RestockDialog(FinalProject.lastLoadedId);
        rd.showDialog();
    }//GEN-LAST:event_btnInvRestockActionPerformed

    private void btnInvEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvEditActionPerformed
        //show the edit item gui
        EditItemDialog ed = new EditItemDialog(FinalProject.lastLoadedItem);
        ed.showDialog();
    }//GEN-LAST:event_btnInvEditActionPerformed

    private void paymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentButtonActionPerformed
        //checkout
        DecimalFormat twoD = new DecimalFormat("#.##");
        int res = JOptionPane.showConfirmDialog(this, "Thank you for your purchase! You owe $" + twoD.format(FinalProject.cart.total()), "Checkout", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (res == JOptionPane.OK_OPTION) {
            //do the checkout
            FinalProject.cart.checkout();
            
            //clear the cart
            FinalProject.cart = new Cart();
            FinalProject.clearPOSInfo();
            FinalProject.updateCartGUI();
        }
        
    }//GEN-LAST:event_paymentButtonActionPerformed

    private void checkoutListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_checkoutListValueChanged
        if (checkoutList.getSelectedIndex() != -1) { //if an item is selected
            //set some labels
            Item i = (Item)checkoutList.getSelectedValue();
            lblPOSName.setText(i.name);
            lblPOSPrice.setText("$"+i.price.toString());
            lblPOSDesc.setText("<html>"+i.desc+"</html>");
        }
    }//GEN-LAST:event_checkoutListValueChanged

    private void btnPOSAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPOSAddActionPerformed
        if (jcbPOSItems.getSelectedIndex() != -1) { //if an item is selected
            //add the item to the cart
            FinalProject.cart.add((Item)jcbPOSItems.getSelectedItem());
        }
    }//GEN-LAST:event_btnPOSAddActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnInvDelete;
    public javax.swing.JButton btnInvEdit;
    public javax.swing.JButton btnInvRestock;
    private javax.swing.JButton btnPOSAdd;
    private javax.swing.JPanel cartPanel;
    private javax.swing.JButton cartRemove;
    public javax.swing.JList checkoutList;
    private javax.swing.JPanel incDisplayPanel;
    private javax.swing.JButton invAddToCart;
    public javax.swing.JList invDisplay;
    private javax.swing.JPanel invPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JComboBox jcbPOSItems;
    public javax.swing.JList jliInvLog;
    public javax.swing.JLabel lblInvCost;
    public javax.swing.JLabel lblInvDesc;
    public javax.swing.JLabel lblInvName;
    public javax.swing.JLabel lblInvPrice;
    public javax.swing.JLabel lblInvStock;
    public javax.swing.JLabel lblPOSDesc;
    public javax.swing.JLabel lblPOSName;
    public javax.swing.JLabel lblPOSPrice;
    public javax.swing.JLabel lblPOSSubTotal;
    public javax.swing.JLabel lblPOSTax;
    public javax.swing.JLabel lblPOSTotal;
    private javax.swing.JButton newItemButton;
    private javax.swing.JButton paymentButton;
    private javax.swing.JPanel salePanel;
    private javax.swing.JPanel selectedPanel;
    private javax.swing.JTabbedPane tabPanels;
    // End of variables declaration//GEN-END:variables
}