/*
 * Created by JFormDesigner on Mon Jul 04 00:56:49 BDT 2022
 */

package org.apwj.view.admin;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author unknown
 */
public class AddFoodsPanel extends JPanel {
    public AddFoodsPanel() {
        initComponents();
    }

    private void close(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel = new JPanel();
        label5 = new JLabel();
        closeButton2 = new JButton();
        label2 = new JLabel();
        usernameTF = new JTextField();
        label3 = new JLabel();
        comboBox1 = new JComboBox();
        label4 = new JLabel();
        usernameTF2 = new JTextField();
        label6 = new JLabel();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();

        //======== panel ========
        {

            //---- label5 ----
            label5.setText("Add Foods");
            label5.setFont(new Font("Segoe UI", Font.BOLD, 45));
            label5.setHorizontalAlignment(SwingConstants.CENTER);

            //---- closeButton2 ----
            closeButton2.setText("Add");
            closeButton2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
            closeButton2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            closeButton2.addActionListener(e -> close(e));

            //---- label2 ----
            label2.setText(" Food Name");
            label2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));

            //---- label3 ----
            label3.setText(" Catagory");
            label3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));

            //---- comboBox1 ----
            comboBox1.setFont(comboBox1.getFont().deriveFont(comboBox1.getFont().getSize() + 5f));

            //---- label4 ----
            label4.setText(" Price");
            label4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));

            //---- label6 ----
            label6.setText(" Description");
            label6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(textArea1);
            }

            GroupLayout panelLayout = new GroupLayout(panel);
            panel.setLayout(panelLayout);
            panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup()
                    .addComponent(label5, GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(296, 296, 296)
                                .addComponent(closeButton2, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label3)
                                    .addComponent(comboBox1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
                                    .addComponent(label2)
                                    .addComponent(usernameTF, GroupLayout.PREFERRED_SIZE, 290, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label6)
                                    .addComponent(scrollPane1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(391, 391, 391)
                                .addGroup(panelLayout.createParallelGroup()
                                    .addComponent(label4)
                                    .addComponent(usernameTF2, GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))))
                        .addContainerGap(71, Short.MAX_VALUE))
            );
            panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(label5)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label3)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label2)
                            .addComponent(label4))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup()
                            .addComponent(usernameTF, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameTF2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(label6)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(closeButton2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    public JPanel panel;
    private JLabel label5;
    private JButton closeButton2;
    private JLabel label2;
    private JTextField usernameTF;
    private JLabel label3;
    private JComboBox comboBox1;
    private JLabel label4;
    private JTextField usernameTF2;
    private JLabel label6;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
