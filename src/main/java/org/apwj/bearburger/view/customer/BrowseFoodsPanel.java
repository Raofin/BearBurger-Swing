package org.apwj.bearburger.view.customer;

import org.apwj.bearburger.dao.FoodDao;
import org.apwj.bearburger.domain.Food;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.List;

import static org.apwj.bearburger.view.customer.CartPanel.TOTAL_COST_LABEL;
import static org.apwj.bearburger.view.customer.CartPanel.TOTAL_FOODS_LABEL;
import static org.apwj.bearburger.view.customer.PaymentPanel.TOTAL_COST;
import static org.apwj.bearburger.view.customer.PaymentPanel.TOTAL_FOOD_NUMBER;
import static org.apwj.bearburger.view.customer.FoodDetails.FOOD_DETAILS_FRAME;

public class BrowseFoodsPanel extends JPanel {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
    FoodDao foodDao = applicationContext.getBean("foodDao", FoodDao.class);
    
    String selectedCategory = null;
    String selectedTitle = null;

    public BrowseFoodsPanel() {
        initComponents();

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

        foodTitleList.addListSelectionListener(new ListSelectionListener()
        {
            @Override
            public void valueChanged(ListSelectionEvent e) {

                selectedTitle = foodTitleList.getSelectedValue() == null
                        ? "" : foodTitleList.getSelectedValue().toString();

                foodDetailsButton.setEnabled(selectedTitle != null && selectedCategory != null);
                addToCartButton.setEnabled(selectedTitle != null && selectedCategory != null);
            }
        });

        foodDetailsButton.setEnabled(selectedTitle != null && selectedCategory != null);
        addToCartButton.setEnabled(selectedTitle != null && selectedCategory != null);
    }

    private void foodDetails(ActionEvent e) {

        try {
            if (selectedTitle != null && selectedCategory != null) {
                FOOD_DETAILS_FRAME.setTitle("BearBurger");
                FOOD_DETAILS_FRAME.setResizable(false);
                FoodDetails foodDetails = new FoodDetails(selectedCategory, selectedTitle);
                FOOD_DETAILS_FRAME.setContentPane(foodDetails.panel);
                FOOD_DETAILS_FRAME.pack();
                FOOD_DETAILS_FRAME.setLocationRelativeTo(null);
                FOOD_DETAILS_FRAME.setVisible(true);
            }
        } catch (Exception ignored) { }
    }

    private void addToCart(ActionEvent e) {
        try {
            Food selectedFood = foodDao.getFoodDetails(selectedCategory, selectedTitle);

            TOTAL_FOOD_NUMBER++;
            TOTAL_COST += selectedFood.getPrice();
            TOTAL_FOODS_LABEL.setText(String.valueOf(TOTAL_FOOD_NUMBER));
            TOTAL_COST_LABEL.setText(String.valueOf(TOTAL_COST));

        } catch (Exception ignored) { }
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

                //---- categoryList ----
                categoryList.setFont(categoryList.getFont().deriveFont(categoryList.getFont().getSize() + 5f));
                scrollPane1.setViewportView(categoryList);
            }

            //======== scrollPane2 ========
            {

                //---- foodTitleList ----
                foodTitleList.setFont(foodTitleList.getFont().deriveFont(foodTitleList.getFont().getSize() + 5f));
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
                        .addGap(158, 158, 158)
                        .addComponent(foodDetailsButton, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(addToCartButton, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label1, GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(panelLayout.createParallelGroup()
                            .addComponent(label4)
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(panelLayout.createParallelGroup()
                            .addComponent(label5)
                            .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 378, GroupLayout.PREFERRED_SIZE)))
            );
            panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(label1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label5)
                            .addComponent(label4))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                            .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
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
