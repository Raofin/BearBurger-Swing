/*
 * Created by JFormDesigner on Mon Jul 04 00:50:34 BDT 2022
 */

package org.apwj.view.admin;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author unknown
 */
public class ManageUsersPanel extends JPanel {
    public ManageUsersPanel() {
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
        closeButton = new JButton();
        closeButton2 = new JButton();

        //======== panel ========
        {

            //---- label5 ----
            label5.setText("Manage Users");
            label5.setFont(new Font("Segoe UI", Font.BOLD, 45));
            label5.setHorizontalAlignment(SwingConstants.CENTER);

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(table1);
            }

            //---- closeButton ----
            closeButton.setText("Delete");
            closeButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
            closeButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            closeButton.addActionListener(e -> close(e));

            //---- closeButton2 ----
            closeButton2.setText("Modify");
            closeButton2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
            closeButton2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            closeButton2.addActionListener(e -> close(e));

            GroupLayout panelLayout = new GroupLayout(panel);
            panel.setLayout(panelLayout);
            panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup()
                    .addComponent(label5, GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup()
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 631, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(172, 172, 172)
                                .addComponent(closeButton, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)
                                .addComponent(closeButton2, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(70, Short.MAX_VALUE))
            );
            panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(label5)
                        .addGap(18, 18, 18)
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 348, GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(closeButton2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addComponent(closeButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(41, Short.MAX_VALUE))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    public JPanel panel;
    private JLabel label5;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JButton closeButton;
    private JButton closeButton2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
