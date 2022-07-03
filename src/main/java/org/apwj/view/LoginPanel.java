/*
 * Created by JFormDesigner on Sat Jul 02 11:41:08 BDT 2022
 */

package org.apwj.view;

import com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

import static org.apwj.App.mainFrame;
import static org.apwj.view.HomePanel.subHomePanel;

public class LoginPanel extends JPanel {
    public LoginPanel() {
        initComponents();
    }

    public static JFrame recoveryFrame = new JFrame(String.valueOf(FlatOneDarkIJTheme.setup()));

    private void registerMouseClicked(MouseEvent e) {
        RegistrationPanel registrationPanel = new RegistrationPanel();
        mainFrame.setContentPane(registrationPanel.panel);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }

    private void forgotPasswordMouseClicked(MouseEvent e) {
        recoveryFrame.setTitle("BearBurger");
        recoveryFrame.setResizable(false);
        RecoveryPanel recoveryPanel = new RecoveryPanel();
        recoveryFrame.setContentPane(recoveryPanel.panel);
        recoveryFrame.pack();
        recoveryFrame.setLocationRelativeTo(null);
        recoveryFrame.setVisible(true);
    }

    private void loginButton(ActionEvent e) {
        HomePanel homePanel = new HomePanel();
        mainFrame.setContentPane(homePanel.panel);
        mainFrame.pack();
        mainFrame.setVisible(true);

        BrowseFoodsPanel browseFoodsPanel = new BrowseFoodsPanel();
        subHomePanel.setLayout(new java.awt.BorderLayout());
        subHomePanel.removeAll();
        subHomePanel.add(browseFoodsPanel.panel);
        subHomePanel.validate();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel = new JPanel();
        textField1 = new JTextField();
        label1 = new JLabel();
        loginButton = new JButton();
        register = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        forgotPassword = new JLabel();
        label5 = new JLabel();
        passwordField1 = new JPasswordField();
        label4 = new JLabel();

        //======== panel ========
        {
            panel.setMaximumSize(new Dimension(1025, 575));
            panel.setMinimumSize(new Dimension(1025, 575));
            panel.setPreferredSize(new Dimension(1025, 575));

            //---- label1 ----
            label1.setText("Welcome!");
            label1.setFont(new Font("Segoe UI", Font.BOLD, 45));

            //---- loginButton ----
            loginButton.setText("Login");
            loginButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
            loginButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            loginButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    loginButton(e);
                }
            });

            //---- register ----
            register.setText("Create an Account");
            register.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
            register.setForeground(new Color(56, 117, 237));
            register.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            register.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    registerMouseClicked(e);
                }
            });

            //---- label2 ----
            label2.setText(" USERNAME OR EMAIL");
            label2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));

            //---- label3 ----
            label3.setText(" PASSWORD");
            label3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));

            //---- forgotPassword ----
            forgotPassword.setText(" Forgot your password?");
            forgotPassword.setForeground(new Color(56, 117, 237));
            forgotPassword.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
            forgotPassword.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            forgotPassword.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    forgotPasswordMouseClicked(e);
                }
            });

            //---- label5 ----
            label5.setText("New here?");
            label5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));

            //---- label4 ----
            label4.setIcon(new ImageIcon("src/main/java/org/apwj/view/resources/logo-2.png"));

            GroupLayout panelLayout = new GroupLayout(panel);
            panel.setLayout(panelLayout);
            panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(label4)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 477, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelLayout.createParallelGroup()
                                        .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                            .addComponent(label3)
                                            .addGap(206, 206, 206))
                                        .addComponent(loginButton, GroupLayout.PREFERRED_SIZE, 302, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelLayout.createParallelGroup()
                                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 301, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label2))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(forgotPassword)
                                        .addGap(142, 142, 142))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(label1)
                                        .addGap(47, 47, 47))
                                    .addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, 302, GroupLayout.PREFERRED_SIZE))
                                .addGap(132, 132, 132))
                            .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addComponent(label5)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(register)
                                .addGap(176, 176, 176))))
            );
            panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(label1)
                        .addGap(35, 35, 35)
                        .addComponent(label2)
                        .addGap(3, 3, 3)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label3)
                        .addGap(1, 1, 1)
                        .addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(forgotPassword)
                        .addGap(44, 44, 44)
                        .addComponent(loginButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(register)
                            .addComponent(label5))
                        .addGap(154, 154, 154))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(label4)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    public JPanel panel;
    private JTextField textField1;
    private JLabel label1;
    private JButton loginButton;
    private JLabel register;
    private JLabel label2;
    private JLabel label3;
    private JLabel forgotPassword;
    private JLabel label5;
    private JPasswordField passwordField1;
    private JLabel label4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
