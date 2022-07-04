/*
 * Created by JFormDesigner on Mon Jul 04 01:09:17 BDT 2022
 */

package org.apwj.view.admin;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author unknown
 */
public class PurchaseLogPanel extends JPanel {
    public PurchaseLogPanel() {
        initComponents();
    }

    private void close(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel = new JPanel();
        label5 = new JLabel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();

        //======== panel ========
        {

            //---- label5 ----
            label5.setText("Purchase Log");
            label5.setFont(new Font("Segoe UI", Font.BOLD, 45));
            label5.setHorizontalAlignment(SwingConstants.CENTER);

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(table1);
            }

            GroupLayout panelLayout = new GroupLayout(panel);
            panel.setLayout(panelLayout);
            panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup()
                    .addComponent(label5, GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 629, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(64, Short.MAX_VALUE))
            );
            panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(label5)
                        .addGap(18, 18, 18)
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 399, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(59, Short.MAX_VALUE))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    public JPanel panel;
    private JLabel label5;
    private JScrollPane scrollPane1;
    private JTable table1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
