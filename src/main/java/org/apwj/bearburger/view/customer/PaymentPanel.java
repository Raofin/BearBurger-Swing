package org.apwj.bearburger.view.customer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

import static org.apwj.bearburger.view.customer.CartPanel.TOTAL_COST_LABEL;
import static org.apwj.bearburger.view.customer.CartPanel.TOTAL_FOODS_LABEL;
import static org.apwj.bearburger.view.DialogueBox.dialogueBox;

public class PaymentPanel extends JPanel {

    public static int TOTAL_FOOD_NUMBER = 0;
    public static int TOTAL_COST = 0;

    public PaymentPanel() {

        initComponents();

        totalFoodNumberLabel.setText(String.valueOf(TOTAL_FOOD_NUMBER));
        totalCostLabel.setText(String.valueOf(TOTAL_COST));
    }

    private void buy(ActionEvent e) {

        if (nameTF.getText().isEmpty() || cardNumberTF.getText().isEmpty() || expDateTF.getText().isEmpty() || cvvTF.getText().isEmpty()) {
            dialogueBox("Fill out all the fields properly");
            return;
        }

        dialogueBox("Payment Successful");
        TOTAL_FOOD_NUMBER = TOTAL_COST = 0;
        TOTAL_FOODS_LABEL.setText("0");
        TOTAL_COST_LABEL.setText("0");

        totalFoodNumberLabel.setText("0");
        totalCostLabel.setText("0");
        nameTF.setText("");
        cardNumberTF.setText("");
        expDateTF.setText("");
        cvvTF.setText("");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel = new JPanel();
        label5 = new JLabel();
        label1 = new JLabel();
        totalFoodNumberLabel = new JLabel();
        label3 = new JLabel();
        totalCostLabel = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        label10 = new JLabel();
        expDateTF = new JTextField();
        cardNumberTF = new JTextField();
        nameTF = new JTextField();
        cvvTF = new JPasswordField();
        buyButton = new JButton();

        //======== panel ========
        {
            //---- label5 ----
            label5.setText("Food Cart");
            label5.setFont(new Font("Segoe UI", Font.BOLD, 45));
            label5.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label1 ----
            label1.setText("Total Added Foods :");
            label1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));

            //---- totalFoodNumberLabel ----
            totalFoodNumberLabel.setText("00");
            totalFoodNumberLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));

            //---- label3 ----
            label3.setText("Total Cost :");
            label3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));

            //---- totalCostLabel ----
            totalCostLabel.setText("00");
            totalCostLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));

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

            //---- expDateTF ----
            expDateTF.setFont(new Font("Segoe UI", Font.PLAIN, 20));

            //---- cardNumberTF ----
            cardNumberTF.setFont(new Font("Segoe UI", Font.PLAIN, 20));

            //---- nameTF ----
            nameTF.setFont(new Font("Segoe UI", Font.PLAIN, 20));

            //---- cvvTF ----
            cvvTF.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));

            //---- buyButton ----
            buyButton.setText("Buy");
            buyButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
            buyButton.addActionListener(e -> buy(e));

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
                                .addComponent(totalFoodNumberLabel)
                                .addGap(86, 86, 86)
                                .addComponent(label3)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalCostLabel))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addGroup(panelLayout.createParallelGroup()
                                    .addComponent(label9)
                                    .addComponent(label8)
                                    .addComponent(label7)
                                    .addComponent(label10))
                                .addGap(27, 27, 27)
                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nameTF)
                                    .addComponent(cardNumberTF)
                                    .addComponent(expDateTF)
                                    .addComponent(cvvTF, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 289, GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(298, 298, 298)
                                .addComponent(buyButton, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)))
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
                            .addComponent(totalFoodNumberLabel)
                            .addComponent(label3)
                            .addComponent(totalCostLabel))
                        .addGap(28, 28, 28)
                        .addComponent(label6)
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label7)
                            .addComponent(nameTF, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label8)
                            .addComponent(cardNumberTF, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label9)
                            .addComponent(expDateTF, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label10)
                            .addComponent(cvvTF, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(buyButton, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(59, Short.MAX_VALUE))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    public JPanel panel;
    private JLabel label5;
    private JLabel label1;
    private JLabel totalFoodNumberLabel;
    private JLabel label3;
    private JLabel totalCostLabel;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JTextField expDateTF;
    private JTextField cardNumberTF;
    private JTextField nameTF;
    private JPasswordField cvvTF;
    private JButton buyButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
