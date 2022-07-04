/*
 * Created by JFormDesigner on Sun Jul 03 00:21:47 BDT 2022
 */

package org.apwj.view;

import org.apwj.dao.userDAO;
import org.apwj.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

import static org.apwj.App.mainFrame;
import static org.apwj.view.FoodDetails.foodDetailsFrame;

/**
 * @author unknown
 */
public class HomePanel extends JPanel {


    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
    userDAO userDao = applicationContext.getBean("userDao", userDAO.class);
    User loggedInUser;
    public HomePanel(int userId) {
        initComponents();
        loggedInUser = userDao.searchById(userId);
        usernameLabel.setText(loggedInUser.getUsername());
        logoutLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                loggedInUser = null;
                mainFrame.setContentPane(new LoginPanel().panel);
                mainFrame.pack();
                mainFrame.setLocationRelativeTo(null);
                mainFrame.setVisible(true);
            }
        });


    }


    private void browse(ActionEvent e) {
        BrowseFoodsPanel browseFoodsPanel = new BrowseFoodsPanel();
        subHomePanel.setLayout(new java.awt.BorderLayout());
        subHomePanel.removeAll();
        subHomePanel.add(browseFoodsPanel.panel);
        subHomePanel.validate();
    }

    private void search(ActionEvent e) {
        SearchPanel searchPanel = new SearchPanel();
        subHomePanel.setLayout(new java.awt.BorderLayout());
        subHomePanel.removeAll();
        subHomePanel.add(searchPanel.panel);
        subHomePanel.validate();
    }

    private void foodCart(ActionEvent e) {
        // TODO add your code here
    }

    private void userProfile(ActionEvent e) {
        ProfileViewPanel profileViewPanel = new ProfileViewPanel();
        subHomePanel.setLayout(new java.awt.BorderLayout());
        subHomePanel.removeAll();
        subHomePanel.add(profileViewPanel.panel);
        subHomePanel.validate();
    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel = new JPanel();
        subHomePanel = new JPanel();
        browseButton = new JButton();
        searchButton = new JButton();
        foodCartButton = new JButton();
        userProfileButton = new JButton();
        projectDetailsButton = new JButton();
        usernameLabel = new JLabel();
        logoutLabel = new JLabel();
        label1 = new JLabel();

        //======== panel ========
        {

            //======== subHomePanel ========
            {

                GroupLayout subHomePanelLayout = new GroupLayout(subHomePanel);
                subHomePanel.setLayout(subHomePanelLayout);
                subHomePanelLayout.setHorizontalGroup(
                    subHomePanelLayout.createParallelGroup()
                        .addGap(0, 742, Short.MAX_VALUE)
                );
                subHomePanelLayout.setVerticalGroup(
                    subHomePanelLayout.createParallelGroup()
                        .addGap(0, 563, Short.MAX_VALUE)
                );
            }

            //---- browseButton ----
            browseButton.setText("Browse Foods");
            browseButton.setFont(new Font("Segoe UI", Font.BOLD, 22));
            browseButton.addActionListener(e -> browse(e));

            //---- searchButton ----
            searchButton.setText("Search");
            searchButton.setFont(new Font("Segoe UI", Font.BOLD, 22));
            searchButton.addActionListener(e -> search(e));

            //---- foodCartButton ----
            foodCartButton.setText("Food Cart");
            foodCartButton.setFont(new Font("Segoe UI", Font.BOLD, 22));
            foodCartButton.addActionListener(e -> foodCart(e));

            //---- userProfileButton ----
            userProfileButton.setText("User Profile");
            userProfileButton.setFont(new Font("Segoe UI", Font.BOLD, 22));
            userProfileButton.addActionListener(e -> userProfile(e));

            //---- projectDetailsButton ----
            projectDetailsButton.setText("Project Details");
            projectDetailsButton.setFont(new Font("Segoe UI", Font.BOLD, 22));

            //---- usernameLabel ----
            usernameLabel.setText("Username");
            usernameLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 27));

            //---- logoutLabel ----
            logoutLabel.setText("Logout");
            logoutLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
            logoutLabel.setForeground(new Color(255, 51, 51));


            //---- label1 ----
            label1.setIcon(new ImageIcon("src/main/java/org/apwj/view/resources/logo-3.png"));
            label1.setDisabledIcon(new ImageIcon("src/main/java/org/apwj/view/resources/logo-3.png"));

            GroupLayout panelLayout = new GroupLayout(panel);
            panel.setLayout(panelLayout);
            panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup()
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(usernameLabel))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(logoutLabel))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelLayout.createParallelGroup()
                                    .addComponent(browseButton, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(searchButton, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(foodCartButton, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(userProfileButton, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(projectDetailsButton, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(label1)))
                        .addGap(22, 22, 22)
                        .addComponent(subHomePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
            );
            panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(label1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addComponent(browseButton, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(searchButton, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(foodCartButton, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(userProfileButton, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(projectDetailsButton, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(usernameLabel)
                        .addGap(6, 6, 6)
                        .addComponent(logoutLabel)
                        .addGap(35, 35, 35))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(subHomePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    public JPanel panel;
    public static JPanel subHomePanel;
    private JButton browseButton;
    private JButton searchButton;
    private JButton foodCartButton;
    private JButton userProfileButton;
    private JButton projectDetailsButton;
    private JLabel usernameLabel;
    private JLabel logoutLabel;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
