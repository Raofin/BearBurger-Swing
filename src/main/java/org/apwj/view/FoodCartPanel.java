/*
 * Created by JFormDesigner on Mon Jul 04 23:52:31 BDT 2022
 */

package org.apwj.view;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author unknown
 */
public class FoodCartPanel extends JPanel {
    public FoodCartPanel() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel = new JPanel();
        label5 = new JLabel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        label10 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        passwordField1 = new JPasswordField();
        button1 = new JButton();

        //======== panel ========
        {

            //---- label5 ----
            label5.setText("Food Cart");
            label5.setFont(new Font("Segoe UI", Font.BOLD, 45));
            label5.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label1 ----
            label1.setText("Total Added Foods :");
            label1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));

            //---- label2 ----
            label2.setText("01");
            label2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));

            //---- label3 ----
            label3.setText("Total Cost :");
            label3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));

            //---- label4 ----
            label4.setText("1000tk");
            label4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));

            //---- label6 ----
            label6.setText("Credit Card Details");
            label6.setFont(new Font("Segoe UI", Font.BOLD, 30));
            label6.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label7 ----
            label7.setText("Name");
            label7.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));

            //---- label8 ----
            label8.setText("Card Number");
            label8.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));

            //---- label9 ----
            label9.setText("Expiration Date");
            label9.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));

            //---- label10 ----
            label10.setText("Code CVV");
            label10.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));

            //---- button1 ----
            button1.setText("Buy");
            button1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            GroupLayout panelLayout = new GroupLayout(panel);
            panel.setLayout(panelLayout);
            panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup()
                            .addComponent(label5, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 746, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 746, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup()
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(label1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label2)
                                .addGap(86, 86, 86)
                                .addComponent(label3)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label4))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addGroup(panelLayout.createParallelGroup()
                                    .addComponent(label9)
                                    .addComponent(label8)
                                    .addComponent(label7)
                                    .addComponent(label10))
                                .addGap(27, 27, 27)
                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textField3)
                                    .addComponent(textField2)
                                    .addComponent(textField1)
                                    .addComponent(passwordField1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 289, GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(298, 298, 298)
                                .addComponent(button1, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(132, Short.MAX_VALUE))
            );
            panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(label5)
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label1)
                            .addComponent(label2)
                            .addComponent(label3)
                            .addComponent(label4))
                        .addGap(28, 28, 28)
                        .addComponent(label6)
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label7)
                            .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label8)
                            .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label9)
                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label10)
                            .addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(60, Short.MAX_VALUE))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    public JPanel panel;
    private JLabel label5;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JPasswordField passwordField1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
