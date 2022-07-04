/*
 * Created by JFormDesigner on Mon Jul 04 00:56:49 BDT 2022
 */

package org.apwj.view.admin;

import org.apwj.dao.foodDAO;
import org.apwj.view.LoginPanel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

import static org.apwj.App.mainFrame;
import static org.apwj.view.DialogueBox.dialogueBox;

/**
 * @author unknown
 */
public class AddFoodsPanel extends JPanel {
    public AddFoodsPanel() {
        initComponents();
        foodCategoriesComboBox.addItem("Burger");
        foodCategoriesComboBox.addItem("Pizza");
    }

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
    foodDAO foodDao = applicationContext.getBean("foodDao", foodDAO.class);

    private void close(ActionEvent e) {
        // TODO add your code here
    }

    private void addFood(ActionEvent e) {
        String title = titleTF.getText().trim();
        String category = String.valueOf(foodCategoriesComboBox.getSelectedItem());
        int price = Integer.parseInt(priceTF.getText());
        String description = descriptionTA.getText();
        if (title.isEmpty() || category.isEmpty() || priceTF.getText().isEmpty() || description.isEmpty()) {
            dialogueBox("Fill out all the fields properly.");
        } else {
            foodDao.insertRow(category, title, description, price);
            titleTF.setText("");
            priceTF.setText("");
            descriptionTA.setText("");
            dialogueBox("New food has been successfully added.");
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel = new JPanel();
        label5 = new JLabel();
        addFoodButton = new JButton();
        label2 = new JLabel();
        titleTF = new JTextField();
        label3 = new JLabel();
        foodCategoriesComboBox = new JComboBox();
        label4 = new JLabel();
        priceTF = new JTextField();
        label6 = new JLabel();
        scrollPane1 = new JScrollPane();
        descriptionTA = new JTextArea();

        //======== panel ========
        {

            //---- label5 ----
            label5.setText("Add Foods");
            label5.setFont(new Font("Segoe UI", Font.BOLD, 45));
            label5.setHorizontalAlignment(SwingConstants.CENTER);

            //---- addFoodButton ----
            addFoodButton.setText("Add");
            addFoodButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
            addFoodButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            addFoodButton.addActionListener(e -> {
                close(e);
                addFood(e);
            });

            //---- label2 ----
            label2.setText(" Food Name");
            label2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));

            //---- label3 ----
            label3.setText(" Catagory");
            label3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));

            //---- foodCategoriesComboBox ----
            foodCategoriesComboBox.setFont(foodCategoriesComboBox.getFont().deriveFont(foodCategoriesComboBox.getFont().getSize() + 5f));

            //---- label4 ----
            label4.setText(" Price");
            label4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));

            //---- label6 ----
            label6.setText(" Description");
            label6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(descriptionTA);
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
                                                    .addComponent(addFoodButton, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panelLayout.createSequentialGroup()
                                                    .addGap(48, 48, 48)
                                                    .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(label3)
                                                            .addComponent(foodCategoriesComboBox, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
                                                            .addComponent(label2)
                                                            .addComponent(titleTF, GroupLayout.PREFERRED_SIZE, 290, GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(label6)
                                                            .addComponent(scrollPane1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)))
                                            .addGroup(panelLayout.createSequentialGroup()
                                                    .addGap(391, 391, 391)
                                                    .addGroup(panelLayout.createParallelGroup()
                                                            .addComponent(label4)
                                                            .addComponent(priceTF, GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))))
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
                                    .addComponent(foodCategoriesComboBox, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(label2)
                                            .addComponent(label4))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panelLayout.createParallelGroup()
                                            .addComponent(titleTF, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(priceTF, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addComponent(label6)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                    .addComponent(addFoodButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                    .addGap(44, 44, 44))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    public JPanel panel;
    private JLabel label5;
    private JButton addFoodButton;
    private JLabel label2;
    private JTextField titleTF;
    private JLabel label3;
    private JComboBox foodCategoriesComboBox;
    private JLabel label4;
    private JTextField priceTF;
    private JLabel label6;
    private JScrollPane scrollPane1;
    private JTextArea descriptionTA;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
