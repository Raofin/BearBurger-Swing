/*
 * Created by JFormDesigner on Sun Jul 03 23:01:54 BDT 2022
 */

package org.apwj.view;

import com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

import static org.apwj.view.LoginPanel.recoveryFrame;

/**
 * @author unknown
 */
public class FoodDetails {
    public FoodDetails() {
        initComponents();
    }

    public static JFrame foodDetailsFrame = new JFrame(String.valueOf(FlatOneDarkIJTheme.setup()));

    private void close(ActionEvent e) {
        foodDetailsFrame.dispatchEvent(new WindowEvent(foodDetailsFrame, WindowEvent.WINDOW_CLOSING));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel = new JPanel();
        label1 = new JLabel();
        scrollPane1 = new JScrollPane();
        textPane1 = new JTextPane();
        closeButton = new JButton();

        //======== panel ========
        {

            //---- label1 ----
            label1.setText("Food Name");
            label1.setFont(new Font("Segoe UI", Font.BOLD, 45));
            label1.setHorizontalAlignment(SwingConstants.CENTER);

            //======== scrollPane1 ========
            {

                //---- textPane1 ----
                textPane1.setText("Prepared with beef patty, cheese, burger sauce, pickles & onion");
                textPane1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
                textPane1.setBorder(null);
                textPane1.setEditable(false);
                scrollPane1.setViewportView(textPane1);
            }

            //---- closeButton ----
            closeButton.setText("Close");
            closeButton.setFont(new Font("Segoe UI", Font.BOLD, 20));
            closeButton.addActionListener(e -> close(e));

            GroupLayout panelLayout = new GroupLayout(panel);
            panel.setLayout(panelLayout);
            panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup()
                    .addComponent(label1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 356, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(57, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addContainerGap(152, Short.MAX_VALUE)
                        .addComponent(closeButton, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147))
            );
            panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(label1)
                        .addGap(18, 18, 18)
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(closeButton, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(51, Short.MAX_VALUE))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    public JPanel panel;
    private JLabel label1;
    private JScrollPane scrollPane1;
    private JTextPane textPane1;
    private JButton closeButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
