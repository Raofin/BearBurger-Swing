/*
 * Created by JFormDesigner on Sat Jul 02 23:34:39 BDT 2022
 */

package org.apwj.view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

import static org.apwj.view.HomePanel.subHomePanel;

/**
 * @author unknown
 */
public class ProfileViewPanel extends JPanel {
    public ProfileViewPanel() {
        initComponents();
    }

    private void modify(ActionEvent e) {
        ProfileModifyPanel profileModifyPanel = new ProfileModifyPanel();
        subHomePanel.setLayout(new java.awt.BorderLayout());
        subHomePanel.removeAll();
        subHomePanel.add(profileModifyPanel.panel);
        subHomePanel.validate();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel = new JPanel();
        label5 = new JLabel();
        modifyButton = new JButton();
        label2 = new JLabel();
        label13 = new JLabel();
        label4 = new JLabel();
        label14 = new JLabel();
        label3 = new JLabel();
        label15 = new JLabel();
        label6 = new JLabel();
        label16 = new JLabel();
        label7 = new JLabel();
        label9 = new JLabel();
        label8 = new JLabel();
        label10 = new JLabel();
        label11 = new JLabel();
        label12 = new JLabel();

        //======== panel ========
        {

            //---- label5 ----
            label5.setText("View Details");
            label5.setFont(new Font("Segoe UI", Font.BOLD, 45));
            label5.setHorizontalAlignment(SwingConstants.CENTER);

            //---- modifyButton ----
            modifyButton.setText("Modify");
            modifyButton.setFont(new Font("Segoe UI", Font.BOLD, 20));
            modifyButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    modify(e);
                }
            });

            //---- label2 ----
            label2.setText("Username");
            label2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));

            //---- label13 ----
            label13.setText("User Name");
            label13.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));
            label13.setForeground(Color.white);

            //---- label4 ----
            label4.setText("Email");
            label4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));

            //---- label14 ----
            label14.setText("user@email.com");
            label14.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));
            label14.setForeground(Color.white);

            //---- label3 ----
            label3.setText("Password");
            label3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));

            //---- label15 ----
            label15.setText("Password");
            label15.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));
            label15.setForeground(Color.white);

            //---- label6 ----
            label6.setText("Phone");
            label6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));

            //---- label16 ----
            label16.setText("0123456789");
            label16.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));
            label16.setForeground(Color.white);

            //---- label7 ----
            label7.setText("Gender");
            label7.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));

            //---- label9 ----
            label9.setText("Male");
            label9.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));
            label9.setForeground(Color.white);

            //---- label8 ----
            label8.setText("Joined");
            label8.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));

            //---- label10 ----
            label10.setText("July 2, 2022");
            label10.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));
            label10.setForeground(Color.white);

            //---- label11 ----
            label11.setText("Spend");
            label11.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));

            //---- label12 ----
            label12.setText("$680");
            label12.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));
            label12.setForeground(Color.white);

            GroupLayout panelLayout = new GroupLayout(panel);
            panel.setLayout(panelLayout);
            panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup()
                            .addGroup(panelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup()
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addGroup(panelLayout.createParallelGroup()
                                            .addGroup(panelLayout.createSequentialGroup()
                                                .addComponent(label2)
                                                .addGap(18, 18, 18)
                                                .addComponent(label13))
                                            .addGroup(panelLayout.createSequentialGroup()
                                                .addComponent(label4)
                                                .addGap(73, 73, 73)
                                                .addComponent(label14))
                                            .addGroup(panelLayout.createSequentialGroup()
                                                .addComponent(label3)
                                                .addGap(24, 24, 24)
                                                .addComponent(label15))
                                            .addGroup(panelLayout.createSequentialGroup()
                                                .addComponent(label6)
                                                .addGap(62, 62, 62)
                                                .addComponent(label16))
                                            .addGroup(panelLayout.createSequentialGroup()
                                                .addComponent(label7)
                                                .addGap(50, 50, 50)
                                                .addComponent(label9))
                                            .addGroup(panelLayout.createSequentialGroup()
                                                .addComponent(label8)
                                                .addGap(59, 59, 59)
                                                .addComponent(label10))
                                            .addGroup(panelLayout.createSequentialGroup()
                                                .addComponent(label11)
                                                .addGap(62, 62, 62)
                                                .addComponent(label12))))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGap(286, 286, 286)
                                        .addComponent(modifyButton, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 295, Short.MAX_VALUE)))
                        .addContainerGap())
            );
            panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(label5)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup()
                            .addComponent(label2)
                            .addComponent(label13))
                        .addGap(7, 7, 7)
                        .addGroup(panelLayout.createParallelGroup()
                            .addComponent(label4)
                            .addComponent(label14))
                        .addGap(7, 7, 7)
                        .addGroup(panelLayout.createParallelGroup()
                            .addComponent(label3)
                            .addComponent(label15))
                        .addGap(7, 7, 7)
                        .addGroup(panelLayout.createParallelGroup()
                            .addComponent(label6)
                            .addComponent(label16))
                        .addGap(6, 6, 6)
                        .addGroup(panelLayout.createParallelGroup()
                            .addComponent(label7)
                            .addComponent(label9))
                        .addGap(6, 6, 6)
                        .addGroup(panelLayout.createParallelGroup()
                            .addComponent(label8)
                            .addComponent(label10))
                        .addGap(6, 6, 6)
                        .addGroup(panelLayout.createParallelGroup()
                            .addComponent(label11)
                            .addComponent(label12))
                        .addGap(40, 40, 40)
                        .addComponent(modifyButton, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    public JPanel panel;
    private JLabel label5;
    private JButton modifyButton;
    private JLabel label2;
    private JLabel label13;
    private JLabel label4;
    private JLabel label14;
    private JLabel label3;
    private JLabel label15;
    private JLabel label6;
    private JLabel label16;
    private JLabel label7;
    private JLabel label9;
    private JLabel label8;
    private JLabel label10;
    private JLabel label11;
    private JLabel label12;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
