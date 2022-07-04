/*
 * Created by JFormDesigner on Sun Jul 03 00:21:47 BDT 2022
 */

package org.apwj.view;

import javax.swing.border.*;
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
        FoodCartPanel foodCartPanel = new FoodCartPanel();
        subHomePanel.setLayout(new java.awt.BorderLayout());
        subHomePanel.removeAll();
        subHomePanel.add(foodCartPanel.panel);
        subHomePanel.validate();
    }

    private void userProfile(ActionEvent e) {
        ProfileViewPanel profileViewPanel = new ProfileViewPanel(loggedInUser.getUserId());
        subHomePanel.setLayout(new java.awt.BorderLayout());
        subHomePanel.removeAll();
        subHomePanel.add(profileViewPanel.panel);
        subHomePanel.validate();
    }

    private void projectDetails(ActionEvent e) {
        ProjectDetails projectDetails = new ProjectDetails();
        subHomePanel.setLayout(new java.awt.BorderLayout());
        subHomePanel.removeAll();
        subHomePanel.add(projectDetails.panel);
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
        logo = new JLabel();

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
            browseButton.setBorder(new LineBorder(new Color(33, 37, 43)));
            browseButton.addActionListener(e -> browse(e));

            //---- searchButton ----
            searchButton.setText("Search");
            searchButton.setFont(new Font("Segoe UI", Font.BOLD, 22));
            searchButton.setBorder(new LineBorder(new Color(33, 37, 43)));
            searchButton.addActionListener(e -> search(e));

            //---- foodCartButton ----
            foodCartButton.setText("Food Cart");
            foodCartButton.setFont(new Font("Segoe UI", Font.BOLD, 22));
            foodCartButton.setBorder(new LineBorder(new Color(33, 37, 43)));
            foodCartButton.addActionListener(e -> {
			foodCart(e);
			foodCart(e);
		});

            //---- userProfileButton ----
            userProfileButton.setText("User Profile");
            userProfileButton.setFont(new Font("Segoe UI", Font.BOLD, 22));
            userProfileButton.setBorder(new LineBorder(new Color(33, 37, 43)));
            userProfileButton.addActionListener(e -> userProfile(e));

            //---- projectDetailsButton ----
            projectDetailsButton.setText("Project Details");
            projectDetailsButton.setFont(new Font("Segoe UI", Font.BOLD, 22));
            projectDetailsButton.setBorder(new LineBorder(new Color(33, 37, 43)));
            projectDetailsButton.addActionListener(e -> projectDetails(e));

            //---- usernameLabel ----
            usernameLabel.setText("Username");
            usernameLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 27));
            usernameLabel.setHorizontalAlignment(SwingConstants.CENTER);

            //---- logoutLabel ----
            logoutLabel.setText("Logout");
            logoutLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
            logoutLabel.setForeground(new Color(255, 51, 51));
            logoutLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            logoutLabel.setHorizontalAlignment(SwingConstants.CENTER);

            //---- logo ----
            logo.setIcon(new ImageIcon("src/main/java/org/apwj/view/resources/logo-3.png"));
            logo.setDisabledIcon(new ImageIcon("src/main/java/org/apwj/view/resources/logo-3.png"));

            GroupLayout panelLayout = new GroupLayout(panel);
            panel.setLayout(panelLayout);
            panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup()
                            .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addComponent(logo, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE))
                                .addComponent(browseButton, GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                .addComponent(searchButton, GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                .addComponent(foodCartButton, GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                .addComponent(userProfileButton, GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                .addComponent(projectDetailsButton, GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(usernameLabel, GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                                    .addComponent(logoutLabel, GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))))
                        .addGap(22, 22, 22)
                        .addComponent(subHomePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
            );
            panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(logo, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(browseButton, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(searchButton, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(foodCartButton, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(userProfileButton, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(projectDetailsButton, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(usernameLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logoutLabel)
                        .addContainerGap(53, Short.MAX_VALUE))
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
    private JLabel logo;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
