/*
 * Created by JFormDesigner on Sun Jul 03 00:59:00 BDT 2022
 */

package org.apwj.view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

import static org.apwj.view.FoodDetails.foodDetailsFrame;

/**
 * @author unknown
 */
public class SearchPanel extends JPanel {
    public SearchPanel() {
        initComponents();
    }

    private void foodDetails(ActionEvent e) {
        foodDetailsFrame.setTitle("BearBurger");
        foodDetailsFrame.setResizable(false);
        FoodDetails foodDetails = new FoodDetails();
        foodDetailsFrame.setContentPane(foodDetails.panel);
        foodDetailsFrame.pack();
        foodDetailsFrame.setLocationRelativeTo(null);
        foodDetailsFrame.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel = new JPanel();
        label1 = new JLabel();
        scrollPane2 = new JScrollPane();
        list2 = new JList();
        label5 = new JLabel();
        addToCartButton = new JButton();
        foodDetailsButton = new JButton();
        textField1 = new JTextField();
        button9 = new JButton();

        //======== panel ========
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

            //---- addToCartButton ----
            addToCartButton.setText("Add to Cart");
            addToCartButton.setFont(new Font("Segoe UI", Font.BOLD, 20));

            //---- foodDetailsButton ----
            foodDetailsButton.setText("View Details");
            foodDetailsButton.setFont(new Font("Segoe UI", Font.BOLD, 20));
            foodDetailsButton.addActionListener(e -> foodDetails(e));

            //---- button9 ----
            button9.setText("Search");
            button9.setFont(new Font("Segoe UI", Font.BOLD, 20));

            GroupLayout panelLayout = new GroupLayout(panel);
            panel.setLayout(panelLayout);
            panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup()
                            .addGroup(panelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup()
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGap(158, 158, 158)
                                        .addComponent(foodDetailsButton, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
                                        .addGap(57, 57, 57)
                                        .addComponent(addToCartButton, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addGroup(panelLayout.createParallelGroup()
                                            .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 636, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label5)
                                            .addGroup(panelLayout.createSequentialGroup()
                                                .addGap(88, 88, 88)
                                                .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 309, GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26)
                                                .addComponent(button9, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 62, Short.MAX_VALUE)))
                        .addContainerGap())
            );
            panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(label1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup()
                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button9, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(label5)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(foodDetailsButton, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                            .addComponent(addToCartButton, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    public JPanel panel;
    private JLabel label1;
    private JScrollPane scrollPane2;
    private JList list2;
    private JLabel label5;
    private JButton addToCartButton;
    private JButton foodDetailsButton;
    private JTextField textField1;
    private JButton button9;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
