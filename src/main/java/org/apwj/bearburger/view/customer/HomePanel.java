package org.apwj.bearburger.view.customer;

import javax.swing.border.*;

import com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme;
import org.apwj.bearburger.dao.UserDao;
import org.apwj.bearburger.domain.User;
import org.apwj.bearburger.view.LoginPanel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

import static org.apwj.bearburger.App.mainFrame;

public class HomePanel extends JPanel {

    public static User LOGGED_IN_USER;
    public static JFrame cartFrame = new JFrame(String.valueOf(FlatOneDarkIJTheme.setup()));

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
    UserDao userDao = applicationContext.getBean("userDao", UserDao.class);

    public HomePanel(int userId) {
        initComponents();
        LOGGED_IN_USER = userDao.searchById(userId);
        usernameLabel.setText(LOGGED_IN_USER.getUsername());
        logoutLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                LOGGED_IN_USER = null;
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
        PaymentPanel paymentPanel = new PaymentPanel();
        subHomePanel.setLayout(new java.awt.BorderLayout());
        subHomePanel.removeAll();
        subHomePanel.add(paymentPanel.panel);
        subHomePanel.validate();
    }

    private void userProfile(ActionEvent e) {
        ProfileViewPanel profileViewPanel = new ProfileViewPanel(LOGGED_IN_USER.getUserId());
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

    private void viewCart(ActionEvent e) {
        cartFrame.setTitle("Food Cart");
        cartFrame.setResizable(false);
        CartPanel cartPanel = new CartPanel();
        cartFrame.setContentPane(cartPanel.panel);
        cartFrame.pack();
        cartFrame.setLocationRelativeTo(null);
        cartFrame.setVisible(true);
        cartFrame.setAlwaysOnTop(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel = new JPanel();
        subHomePanel = new JPanel();
        browseButton = new JButton();
        searchButton = new JButton();
        projectDetailsButton = new JButton();
        usernameLabel = new JLabel();
        logoutLabel = new JLabel();
        logo = new JLabel();
        viewCart = new JButton();
        userProfileButton = new JButton();
        foodCartButton = new JButton();

        //======== panel ========
        {
            //======== subHomePanel ========
            {
                GroupLayout subHomePanelLayout = new GroupLayout(subHomePanel);
                subHomePanel.setLayout(subHomePanelLayout);
                subHomePanelLayout.setHorizontalGroup(
                    subHomePanelLayout.createParallelGroup()
                        .addGap(0, 728, Short.MAX_VALUE)
                );
                subHomePanelLayout.setVerticalGroup(
                    subHomePanelLayout.createParallelGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
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
            logo.setIcon(new ImageIcon(getClass().getResource("/img/logo-3.png")));
            logo.setDisabledIcon(new ImageIcon("src/main/java/org/apwj/view/resources/logo-3.png"));

            //---- viewCart ----
            viewCart.setText("View Cart");
            viewCart.setFont(new Font("Segoe UI", Font.BOLD, 22));
            viewCart.addActionListener(e -> viewCart(e));

            //---- userProfileButton ----
            userProfileButton.setText("User Profile");
            userProfileButton.setFont(new Font("Segoe UI", Font.BOLD, 22));
            userProfileButton.setBorder(new LineBorder(new Color(33, 37, 43)));
            userProfileButton.addActionListener(e -> userProfile(e));

            //---- foodCartButton ----
            foodCartButton.setText("Payment");
            foodCartButton.setFont(new Font("Segoe UI", Font.BOLD, 22));
            foodCartButton.setBorder(new LineBorder(new Color(33, 37, 43)));
            foodCartButton.addActionListener(e -> {
			foodCart(e);
			foodCart(e);
		});

            GroupLayout panelLayout = new GroupLayout(panel);
            panel.setLayout(panelLayout);
            panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup()
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(logo, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(browseButton, GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                .addComponent(searchButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(userProfileButton, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)
                            .addComponent(projectDetailsButton, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(usernameLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(logoutLabel, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)))
                            .addComponent(viewCart, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)
                            .addComponent(foodCartButton, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(subHomePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(logo, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(browseButton, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewCart, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(foodCartButton, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userProfileButton, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(projectDetailsButton, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(usernameLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logoutLabel)
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addComponent(subHomePanel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    public JPanel panel;
    public static JPanel subHomePanel;
    private JButton browseButton;
    private JButton searchButton;
    private JButton projectDetailsButton;
    private JLabel usernameLabel;
    private JLabel logoutLabel;
    private JLabel logo;
    private JButton viewCart;
    private JButton userProfileButton;
    private JButton foodCartButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
