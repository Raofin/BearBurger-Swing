/*
 * Created by JFormDesigner on Sat Jul 02 23:20:47 BDT 2022
 */

package org.apwj.view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

import static org.apwj.view.LoginPanel.recoveryFrame;

/**
 * @author unknown
 */
public class RecoveryPanel extends JPanel {
    public RecoveryPanel() {
        initComponents();
    }

    private void close(ActionEvent e) {
        recoveryFrame.dispatchEvent(new WindowEvent(recoveryFrame, WindowEvent.WINDOW_CLOSING));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel = new JPanel();
        loginButton = new JButton();
        textField1 = new JTextField();
        label2 = new JLabel();
        label1 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        closeButton = new JButton();

        //======== panel ========
        {

            //---- loginButton ----
            loginButton.setText("Recover");
            loginButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
            loginButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            //---- label2 ----
            label2.setText(" EMAIL");
            label2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- label1 ----
            label1.setText("Account Recovery");
            label1.setFont(new Font("Segoe UI", Font.BOLD, 45));

            //---- label3 ----
            label3.setText("Username :");
            label3.setFont(new Font("Segoe UI Semibold", Font.BOLD, 22));

            //---- label4 ----
            label4.setText("Password  :");
            label4.setFont(new Font("Segoe UI Semibold", Font.BOLD, 22));

            //---- label5 ----
            label5.setText("...");
            label5.setFont(new Font("Segoe UI Semibold", Font.BOLD, 22));
            label5.setForeground(new Color(0, 153, 51));

            //---- label6 ----
            label6.setText("...");
            label6.setFont(new Font("Segoe UI Semibold", Font.BOLD, 22));
            label6.setForeground(new Color(0, 153, 51));

            //---- closeButton ----
            closeButton.setText("Close");
            closeButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
            closeButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            closeButton.addActionListener(e -> close(e));

            GroupLayout panelLayout = new GroupLayout(panel);
            panel.setLayout(panelLayout);
            panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup()
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addGroup(panelLayout.createParallelGroup()
                                    .addComponent(label2)
                                    .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(textField1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 332, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                            .addGroup(panelLayout.createParallelGroup()
                                                .addGroup(panelLayout.createSequentialGroup()
                                                    .addGap(12, 12, 12)
                                                    .addGroup(panelLayout.createParallelGroup()
                                                        .addComponent(label4)
                                                        .addComponent(label3))
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(panelLayout.createParallelGroup()
                                                        .addComponent(label5)
                                                        .addComponent(label6)))
                                                .addComponent(closeButton, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(loginButton, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(label1)))
                        .addContainerGap(73, Short.MAX_VALUE))
            );
            panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(label1)
                        .addGap(36, 36, 36)
                        .addComponent(label2)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(panelLayout.createParallelGroup()
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(label3)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label4))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(label5)
                                .addGap(6, 6, 6)
                                .addComponent(label6)))
                        .addGap(44, 44, 44)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(loginButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addComponent(closeButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(55, Short.MAX_VALUE))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    public JPanel panel;
    private JButton loginButton;
    private JTextField textField1;
    private JLabel label2;
    private JLabel label1;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JButton closeButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
