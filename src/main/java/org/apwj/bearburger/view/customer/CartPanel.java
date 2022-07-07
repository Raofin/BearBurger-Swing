package org.apwj.bearburger.view.customer;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

import static org.apwj.bearburger.view.customer.PaymentPanel.TOTAL_COST;
import static org.apwj.bearburger.view.customer.PaymentPanel.TOTAL_FOOD_NUMBER;

public class CartPanel {

    public CartPanel() {
        initComponents();
    }

    private void initComponents() {

//        String foods = TOTAL_FOOD_NUMBER == 0 ? "0" : String.valueOf(TOTAL_FOOD_NUMBER);
//        String cost = TOTAL_COST == 0 ? "0" : String.valueOf(TOTAL_COST);

        TOTAL_FOODS_LABEL.setText(String.valueOf(TOTAL_FOOD_NUMBER));
        TOTAL_COST_LABEL.setText(String.valueOf(TOTAL_COST));

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel = new JPanel();
        label6 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();

        //======== panel ========
        {
            //---- label6 ----
            label6.setText("Food Cart");
            label6.setFont(new Font("Segoe UI", Font.BOLD, 30));
            label6.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label2 ----
            label2.setText("Added Foods :");
            label2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));

            //---- TOTAL_FOODS_LABEL ----
            TOTAL_FOODS_LABEL.setText("00");
            TOTAL_FOODS_LABEL.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));

            //---- label3 ----
            label3.setText("Total Cost :");
            label3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));

            //---- TOTAL_COST_LABEL ----
            TOTAL_COST_LABEL.setText("00");
            TOTAL_COST_LABEL.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));

            GroupLayout panelLayout = new GroupLayout(panel);
            panel.setLayout(panelLayout);
            panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label6, GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addContainerGap(32, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(label2)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TOTAL_FOODS_LABEL))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(label3)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TOTAL_COST_LABEL)))
                        .addGap(31, 31, 31))
            );
            panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label6)
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label2)
                            .addComponent(TOTAL_FOODS_LABEL))
                        .addGap(12, 12, 12)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label3)
                            .addComponent(TOTAL_COST_LABEL))
                        .addContainerGap(18, Short.MAX_VALUE))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    public JPanel panel;
    private JLabel label6;
    private JLabel label2;
    public static JLabel TOTAL_FOODS_LABEL = new JLabel();
    private JLabel label3;
    public static JLabel TOTAL_COST_LABEL = new JLabel();
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
