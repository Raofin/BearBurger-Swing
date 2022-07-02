/*
 * Created by JFormDesigner on Sun Jul 03 00:21:47 BDT 2022
 */

package org.apwj.view;

import javax.swing.*;
import java.awt.*;

/**
 * @author unknown
 */
public class HomePanel extends JPanel {
    public HomePanel() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel = new JPanel();
        panel1 = new JPanel();
        label1 = new JLabel();
        scrollPane1 = new JScrollPane();
        list1 = new JList();
        scrollPane2 = new JScrollPane();
        list2 = new JList();
        label4 = new JLabel();
        label5 = new JLabel();
        button7 = new JButton();
        button8 = new JButton();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        label2 = new JLabel();
        label3 = new JLabel();

        //======== panel ========
        {

            //======== panel1 ========
            {

                //---- label1 ----
                label1.setText("Browse Foods");
                label1.setFont(new Font("Segoe UI", Font.BOLD, 45));
                label1.setHorizontalAlignment(SwingConstants.CENTER);

                //======== scrollPane1 ========
                {
                    scrollPane1.setViewportView(list1);
                }

                //======== scrollPane2 ========
                {
                    scrollPane2.setViewportView(list2);
                }

                //---- label4 ----
                label4.setText("Catagories");
                label4.setFont(new Font("Segoe UI Semibold", Font.BOLD, 21));

                //---- label5 ----
                label5.setText("Foods");
                label5.setFont(new Font("Segoe UI Semibold", Font.BOLD, 21));

                //---- button7 ----
                button7.setText("Add to Cart");
                button7.setFont(new Font("Segoe UI", Font.BOLD, 20));

                //---- button8 ----
                button8.setText("View Details");
                button8.setFont(new Font("Segoe UI", Font.BOLD, 20));

                GroupLayout panel1Layout = new GroupLayout(panel1);
                panel1.setLayout(panel1Layout);
                panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(label1, GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
                            .addContainerGap())
                        .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                            .addContainerGap(65, Short.MAX_VALUE)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label4))
                            .addGap(62, 62, 62)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addComponent(label5)
                                .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 378, GroupLayout.PREFERRED_SIZE))
                            .addGap(98, 98, 98))
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addGap(158, 158, 158)
                            .addComponent(button8, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
                            .addGap(57, 57, 57)
                            .addComponent(button7, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(201, Short.MAX_VALUE))
                );
                panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(label1)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label5)
                                .addComponent(label4))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                                .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(button8, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                .addComponent(button7, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
                            .addGap(35, 35, 35))
                );
            }

            //---- button1 ----
            button1.setText("Browse Foods");
            button1.setFont(new Font("Segoe UI", Font.BOLD, 22));

            //---- button2 ----
            button2.setText("Search");
            button2.setFont(new Font("Segoe UI", Font.BOLD, 22));

            //---- button3 ----
            button3.setText("Food Cart");
            button3.setFont(new Font("Segoe UI", Font.BOLD, 22));

            //---- button4 ----
            button4.setText("User Profile");
            button4.setFont(new Font("Segoe UI", Font.BOLD, 22));

            //---- button5 ----
            button5.setText("Project Details");
            button5.setFont(new Font("Segoe UI", Font.BOLD, 22));

            //---- label2 ----
            label2.setText("Username");
            label2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 27));

            //---- label3 ----
            label3.setText("Logout");
            label3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
            label3.setForeground(new Color(255, 51, 51));

            GroupLayout panelLayout = new GroupLayout(panel);
            panel.setLayout(panelLayout);
            panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup()
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(label2))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(label3))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelLayout.createParallelGroup()
                                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button2, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button3, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button4, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button5, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
            );
            panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addContainerGap(136, Short.MAX_VALUE)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(button3, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(button4, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(button5, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(label2)
                        .addGap(6, 6, 6)
                        .addComponent(label3)
                        .addGap(35, 35, 35))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel;
    private JPanel panel1;
    private JLabel label1;
    private JScrollPane scrollPane1;
    private JList list1;
    private JScrollPane scrollPane2;
    private JList list2;
    private JLabel label4;
    private JLabel label5;
    private JButton button7;
    private JButton button8;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JLabel label2;
    private JLabel label3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
