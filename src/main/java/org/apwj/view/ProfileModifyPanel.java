/*
 * Created by JFormDesigner on Sun Jul 03 00:01:28 BDT 2022
 */

package org.apwj.view;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author unknown
 */
public class ProfileModifyPanel extends JPanel {
    public ProfileModifyPanel() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        label5 = new JLabel();
        button7 = new JButton();
        label2 = new JLabel();
        textField1 = new JTextField();
        label4 = new JLabel();
        textField2 = new JTextField();
        label3 = new JLabel();
        textField4 = new JTextField();
        label6 = new JLabel();
        textField3 = new JTextField();
        label7 = new JLabel();
        label9 = new JLabel();
        label8 = new JLabel();
        label10 = new JLabel();
        label11 = new JLabel();
        label12 = new JLabel();

        //======== panel1 ========
        {

            //---- label5 ----
            label5.setText("Modify Details");
            label5.setFont(new Font("Segoe UI", Font.BOLD, 45));
            label5.setHorizontalAlignment(SwingConstants.CENTER);

            //---- button7 ----
            button7.setText("Confirm");
            button7.setFont(new Font("Segoe UI", Font.BOLD, 20));

            //---- label2 ----
            label2.setText("Username");
            label2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));

            //---- textField1 ----
            textField1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));

            //---- label4 ----
            label4.setText("Email");
            label4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));

            //---- textField2 ----
            textField2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));

            //---- label3 ----
            label3.setText("Password");
            label3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));

            //---- textField4 ----
            textField4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));

            //---- label6 ----
            label6.setText("Phone");
            label6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));

            //---- textField3 ----
            textField3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));

            //---- label7 ----
            label7.setText("Gender");
            label7.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));

            //---- label9 ----
            label9.setText("Male");
            label9.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));

            //---- label8 ----
            label8.setText("Joined");
            label8.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));

            //---- label10 ----
            label10.setText("July 2, 2022");
            label10.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));

            //---- label11 ----
            label11.setText("Spend");
            label11.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));

            //---- label12 ----
            label12.setText("$680");
            label12.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGroup(panel1Layout.createParallelGroup()
                                            .addComponent(label2)
                                            .addComponent(label6)
                                            .addComponent(label4)
                                            .addComponent(label3)
                                            .addComponent(label7))
                                        .addGap(18, 18, 18)
                                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(label9)
                                                .addGap(76, 76, 76))
                                            .addComponent(textField1, GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                                            .addComponent(textField2, GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                                            .addComponent(textField4, GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                                            .addComponent(textField3, GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)))
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(label8)
                                        .addGap(65, 65, 65)
                                        .addComponent(label10))
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(label11)
                                        .addGap(65, 65, 65)
                                        .addComponent(label12)))
                                .addGap(0, 153, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGap(0, 296, Short.MAX_VALUE)
                        .addComponent(button7, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
                        .addGap(291, 291, 291))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(label5)
                        .addGap(51, 51, 51)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label2)
                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label4)
                            .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label3)
                            .addComponent(textField4, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label6)
                            .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label7)
                            .addComponent(label9))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label8)
                            .addComponent(label10))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(label11)
                            .addComponent(label12))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(button7, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JLabel label5;
    private JButton button7;
    private JLabel label2;
    private JTextField textField1;
    private JLabel label4;
    private JTextField textField2;
    private JLabel label3;
    private JTextField textField4;
    private JLabel label6;
    private JTextField textField3;
    private JLabel label7;
    private JLabel label9;
    private JLabel label8;
    private JLabel label10;
    private JLabel label11;
    private JLabel label12;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
