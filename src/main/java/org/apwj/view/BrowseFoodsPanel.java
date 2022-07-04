/*
 * Created by JFormDesigner on Sun Jul 03 19:27:57 BDT 2022
 */

package org.apwj.view;

import org.apwj.dao.foodDAO;
import org.apwj.domain.Food;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.Random;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import static org.apwj.view.FoodCartPanel.totalCost;
import static org.apwj.view.FoodCartPanel.totalFoodNumber;
import static org.apwj.view.FoodDetails.foodDetailsFrame;

/**
 * @author unknown
 */
public class BrowseFoodsPanel extends JPanel {
    String selectedCategory = null;
    String selectedTitle = null;

    public BrowseFoodsPanel() {
        initComponents();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        foodDAO foodDao = applicationContext.getBean("foodDao", foodDAO.class);

        List<String> categories = foodDao.getAllCategory();
        DefaultListModel<String> categoryListModel = new DefaultListModel<>();

        for (String category : categories) {
            categoryListModel.addElement(category);
        }
        categoryList.setModel(categoryListModel);

        categoryList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                selectedCategory = categoryList.getSelectedValue().toString();
                List<String> titles = foodDao.getTitlesByCategory(selectedCategory);
                DefaultListModel<String> titlesModel = new DefaultListModel<>();
                for (String title : titles) {
                    titlesModel.addElement(title);
                }
                foodTitleList.setModel(titlesModel);
                foodDetailsButton.setEnabled(selectedTitle != null && selectedCategory != null);
                addToCartButton.setEnabled(selectedTitle != null && selectedCategory != null);
            }
        });

        foodTitleList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                selectedTitle = foodTitleList.getSelectedValue().toString();
                foodDetailsButton.setEnabled(selectedTitle != null && selectedCategory != null);
                addToCartButton.setEnabled(selectedTitle != null && selectedCategory != null);
            }
        });

        foodDetailsButton.setEnabled(selectedTitle != null && selectedCategory != null);
        addToCartButton.setEnabled(selectedTitle != null && selectedCategory != null);
    }

    private void foodDetails(ActionEvent e) {
        if (selectedTitle != null && selectedCategory != null) {
            foodDetailsFrame.setTitle("BearBurger");
            foodDetailsFrame.setResizable(false);
            FoodDetails foodDetails = new FoodDetails(selectedCategory, selectedTitle);
            foodDetailsFrame.setContentPane(foodDetails.panel);
            foodDetailsFrame.pack();
            foodDetailsFrame.setLocationRelativeTo(null);
            foodDetailsFrame.setVisible(true);
        }
    }

    private void foodTitleListValueChanged(ListSelectionEvent e) {
        // TODO add your code here
    }

    private void addToCart(ActionEvent e) {
        Random random = new Random();

        totalCost += random.nextInt(((1000-400) + 1) + 400);
        totalFoodNumber++;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel = new JPanel();
        label1 = new JLabel();
        scrollPane1 = new JScrollPane();
        categoryList = new JList();
        scrollPane2 = new JScrollPane();
        foodTitleList = new JList();
        label4 = new JLabel();
        label5 = new JLabel();
        addToCartButton = new JButton();
        foodDetailsButton = new JButton();

        //======== panel ========
        {

            //---- label1 ----
            label1.setText("Browse Foods");
            label1.setFont(new Font("Segoe UI", Font.BOLD, 45));
            label1.setHorizontalAlignment(SwingConstants.CENTER);

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(categoryList);
            }

            //======== scrollPane2 ========
            {

                //---- foodTitleList ----
                foodTitleList.addListSelectionListener(e -> foodTitleListValueChanged(e));
                scrollPane2.setViewportView(foodTitleList);
            }

            //---- label4 ----
            label4.setText("Catagories");
            label4.setFont(new Font("Segoe UI Semibold", Font.BOLD, 21));

            //---- label5 ----
            label5.setText("Foods");
            label5.setFont(new Font("Segoe UI Semibold", Font.BOLD, 21));

            //---- addToCartButton ----
            addToCartButton.setText("Add to Cart");
            addToCartButton.setFont(new Font("Segoe UI", Font.BOLD, 20));
            addToCartButton.addActionListener(e -> addToCart(e));

            //---- foodDetailsButton ----
            foodDetailsButton.setText("View Details");
            foodDetailsButton.setFont(new Font("Segoe UI", Font.BOLD, 20));
            foodDetailsButton.addActionListener(e -> {
			foodDetails(e);
			foodDetails(e);
		});

            GroupLayout panelLayout = new GroupLayout(panel);
            panel.setLayout(panelLayout);
            panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label1, GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addContainerGap(65, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup()
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4))
                        .addGap(62, 62, 62)
                        .addGroup(panelLayout.createParallelGroup()
                            .addComponent(label5)
                            .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 378, GroupLayout.PREFERRED_SIZE))
                        .addGap(98, 98, 98))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(foodDetailsButton, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(addToCartButton, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(201, Short.MAX_VALUE))
            );
            panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(label1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label5)
                            .addComponent(label4))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                            .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
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
    private JScrollPane scrollPane1;
    private JList categoryList;
    private JScrollPane scrollPane2;
    private JList foodTitleList;
    private JLabel label4;
    private JLabel label5;
    private JButton addToCartButton;
    private JButton foodDetailsButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
