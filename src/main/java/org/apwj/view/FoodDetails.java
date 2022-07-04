/*
 * Created by JFormDesigner on Sun Jul 03 23:01:54 BDT 2022
 */

package org.apwj.view;

import com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme;
import org.apwj.dao.foodDAO;
import org.apwj.domain.Food;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

import static org.apwj.view.LoginPanel.recoveryFrame;

/**
 * @author unknown
 */
public class FoodDetails {
    public FoodDetails(String selectedCategory,String selectedTitle) {
        initComponents();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        foodDAO foodDao = applicationContext.getBean("foodDao", foodDAO.class);
        Food food = foodDao.getFoodDetails(selectedCategory,selectedTitle);
        foodTitle.setText(food.getTitle());
        foodDetails.setText(food.getDescription());
        priceLabel.setText(String.valueOf(food.getPrice()));
        categoryLabel.setText(food.getCategory());
    }
    public FoodDetails(int foodId) {
        initComponents();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        foodDAO foodDao = applicationContext.getBean("foodDao", foodDAO.class);
        Food food = foodDao.getFoodDetails(foodId);
        foodTitle.setText(food.getTitle());
        foodDetails.setText(food.getDescription());
        priceLabel.setText(String.valueOf(food.getPrice()));
        categoryLabel.setText(food.getCategory());
    }
    public FoodDetails(){initComponents();}

    public static JFrame foodDetailsFrame = new JFrame(String.valueOf(FlatOneDarkIJTheme.setup()));

    private void close(ActionEvent e) {
        foodDetailsFrame.dispatchEvent(new WindowEvent(foodDetailsFrame, WindowEvent.WINDOW_CLOSING));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel = new JPanel();
        foodTitle = new JLabel();
        scrollPane1 = new JScrollPane();
        foodDetails = new JTextPane();
        closeButton = new JButton();
        categoryLabel = new JLabel();
        priceLabel = new JLabel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();

        //======== panel ========
        {

            //---- foodTitle ----
            foodTitle.setText("Food Name");
            foodTitle.setFont(new Font("Segoe UI", Font.BOLD, 45));
            foodTitle.setHorizontalAlignment(SwingConstants.CENTER);

            //======== scrollPane1 ========
            {

                //---- foodDetails ----
                foodDetails.setText("Prepared with beef patty, cheese, burger sauce, pickles & onion");
                foodDetails.setFont(new Font("Segoe UI", Font.PLAIN, 20));
                foodDetails.setEditable(false);
                scrollPane1.setViewportView(foodDetails);
            }

            //---- closeButton ----
            closeButton.setText("Close");
            closeButton.setFont(new Font("Segoe UI", Font.BOLD, 20));
            closeButton.addActionListener(e -> close(e));

            //---- categoryLabel ----
            categoryLabel.setText("Category");
            categoryLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));

            //---- priceLabel ----
            priceLabel.setText("Price");
            priceLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));

            //---- label1 ----
            label1.setText(" Catagory :");
            label1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));

            //---- label2 ----
            label2.setText(" Price (tk) :");
            label2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));

            //---- label3 ----
            label3.setText(" Description :");
            label3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));

            GroupLayout panelLayout = new GroupLayout(panel);
            panel.setLayout(panelLayout);
            panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup()
                    .addComponent(foodTitle, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGap(0, 50, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup()
                            .addComponent(label3)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(label1)
                                .addGap(24, 24, 24)
                                .addComponent(categoryLabel))
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 370, GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(label2)
                                .addGap(18, 18, 18)
                                .addComponent(priceLabel)))
                        .addGap(50, 50, 50))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(closeButton, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(154, Short.MAX_VALUE))
            );
            panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(foodTitle)
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup()
                            .addComponent(categoryLabel)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(label1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label2)
                                    .addComponent(priceLabel))))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label3)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(closeButton, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    public JPanel panel;
    private JLabel foodTitle;
    private JScrollPane scrollPane1;
    private JTextPane foodDetails;
    private JButton closeButton;
    private JLabel categoryLabel;
    private JLabel priceLabel;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
