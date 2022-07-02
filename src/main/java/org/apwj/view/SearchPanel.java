/*
 * Created by JFormDesigner on Sun Jul 03 00:59:00 BDT 2022
 */

package org.apwj.view;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author unknown
 */
public class SearchPanel extends JPanel {
    public SearchPanel() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        label1 = new JLabel();
        scrollPane2 = new JScrollPane();
        list2 = new JList();
        label5 = new JLabel();
        button7 = new JButton();
        button8 = new JButton();
        textField1 = new JTextField();
        button9 = new JButton();

        //======== panel1 ========
        {

            //---- label1 ----
            label1.setText("Search Foods");
            label1.setFont(new Font("Segoe UI", Font.BOLD, 45));
            label1.setHorizontalAlignment(SwingConstants.CENTER);

            //======== scrollPane2 ========
            {
                scrollPane2.setViewportView(list2);
            }

            //---- label5 ----
            label5.setText("Search Results");
            label5.setFont(new Font("Segoe UI Semibold", Font.BOLD, 21));

            //---- button7 ----
            button7.setText("Add to Cart");
            button7.setFont(new Font("Segoe UI", Font.BOLD, 20));

            //---- button8 ----
            button8.setText("View Details");
            button8.setFont(new Font("Segoe UI", Font.BOLD, 20));

            //---- button9 ----
            button9.setText("Search");
            button9.setFont(new Font("Segoe UI", Font.BOLD, 20));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGap(158, 158, 158)
                                        .addComponent(button8, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
                                        .addGap(57, 57, 57)
                                        .addComponent(button7, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addGroup(panel1Layout.createParallelGroup()
                                            .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 636, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label5)
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                .addGap(88, 88, 88)
                                                .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 309, GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26)
                                                .addComponent(button9, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 62, Short.MAX_VALUE)))
                        .addContainerGap())
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(label1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button9, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(label5)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(button8, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button7, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JLabel label1;
    private JScrollPane scrollPane2;
    private JList list2;
    private JLabel label5;
    private JButton button7;
    private JButton button8;
    private JTextField textField1;
    private JButton button9;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
