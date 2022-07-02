/*
 * Created by JFormDesigner on Sat Jul 02 12:10:34 BDT 2022
 */

package org.apwj.ui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

public class RegistrationPanel extends JPanel {
    public RegistrationPanel() {
        initComponents();
    }

    private void registerMouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        textField1 = new JTextField();
        label3 = new JLabel();
        passwordField1 = new JPasswordField();
        registerButton = new JButton();
        label5 = new JLabel();
        loginLabel = new JLabel();
        label4 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        textField2 = new JTextField();
        passwordField2 = new JPasswordField();
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        radioButton3 = new JRadioButton();

        //======== panel ========
        {

            //---- label1 ----
            label1.setText("Create an Account");
            label1.setFont(new Font("Segoe UI", Font.BOLD, 45));

            //---- label2 ----
            label2.setText("Username");
            label2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));

            //---- label3 ----
            label3.setText("Password");
            label3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));

            //---- registerButton ----
            registerButton.setText("Register");
            registerButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
            registerButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            //---- label5 ----
            label5.setText("Already have an account?");
            label5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));

            //---- loginLabel ----
            loginLabel.setText("Login");
            loginLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
            loginLabel.setForeground(new Color(56, 117, 237));
            loginLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            loginLabel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    registerMouseClicked(e);
                }
            });

            //---- label4 ----
            label4.setText("Email");
            label4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));

            //---- label6 ----
            label6.setText("Confirm Password");
            label6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));

            //---- label7 ----
            label7.setText("Gender");
            label7.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));

            //---- radioButton1 ----
            radioButton1.setText("Male");
            radioButton1.setFont(new Font("Segoe UI", Font.PLAIN, 16));

            //---- radioButton2 ----
            radioButton2.setText("Female");
            radioButton2.setFont(new Font("Segoe UI", Font.PLAIN, 16));

            //---- radioButton3 ----
            radioButton3.setText("Other");
            radioButton3.setFont(new Font("Segoe UI", Font.PLAIN, 16));

            GroupLayout panelLayout = new GroupLayout(panel);
            panel.setLayout(panelLayout);
            panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap(489, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addComponent(label1)
                                .addGap(146, 146, 146))
                            .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup()
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(panelLayout.createParallelGroup()
                                            .addComponent(label2)
                                            .addComponent(label4)
                                            .addComponent(label3))
                                        .addGap(73, 73, 73)
                                        .addGroup(panelLayout.createParallelGroup()
                                            .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, 244, GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(registerButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(140, 140, 140))
                            .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addComponent(label5)
                                .addGap(6, 6, 6)
                                .addComponent(loginLabel)
                                .addGap(231, 231, 231))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup()
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(label7)
                                        .addGap(83, 83, 83))
                                    .addComponent(label6, GroupLayout.Alignment.TRAILING))
                                .addGroup(panelLayout.createParallelGroup()
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(radioButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioButton2)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioButton3))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(passwordField2, GroupLayout.PREFERRED_SIZE, 244, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())))
            );
            panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(label1)
                        .addGap(21, 21, 21)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label2)
                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label4)
                            .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordField2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label7)
                            .addComponent(radioButton1)
                            .addComponent(radioButton2)
                            .addComponent(radioButton3))
                        .addGap(34, 34, 34)
                        .addComponent(registerButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup()
                            .addComponent(label5)
                            .addComponent(loginLabel))
                        .addContainerGap(102, Short.MAX_VALUE))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    public JPanel panel;
    private JLabel label1;
    private JLabel label2;
    private JTextField textField1;
    private JLabel label3;
    private JPasswordField passwordField1;
    private JButton registerButton;
    private JLabel label5;
    private JLabel loginLabel;
    private JLabel label4;
    private JLabel label6;
    private JLabel label7;
    private JTextField textField2;
    private JPasswordField passwordField2;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
