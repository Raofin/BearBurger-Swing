package org.apwj.bearburger.view.admin;

import javax.swing.border.*;

import org.apwj.bearburger.view.LoginPanel;
import org.apwj.bearburger.view.customer.ProjectDetails;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

import static org.apwj.bearburger.App.mainFrame;

public class AdminPanel extends JPanel {

    public AdminPanel() {
        initComponents();
        manageUsersButton.doClick();
    }

    private void manageUsers(ActionEvent e) {
        ManageUsersPanel manageUsersPanel = new ManageUsersPanel();
        subAdminPanel.setLayout(new java.awt.BorderLayout());
        subAdminPanel.removeAll();
        subAdminPanel.add(manageUsersPanel.panel);
        subAdminPanel.validate();
    }

    private void addUser(ActionEvent e) {
        AddUserPanel addUserPanel = new AddUserPanel();
        subAdminPanel.setLayout(new java.awt.BorderLayout());
        subAdminPanel.removeAll();
        subAdminPanel.add(addUserPanel.panel);
        subAdminPanel.validate();
    }

    private void addFoods(ActionEvent e) {
        AddFoodsPanel addFoodsPanel = new AddFoodsPanel();
        subAdminPanel.setLayout(new java.awt.BorderLayout());
        subAdminPanel.removeAll();
        subAdminPanel.add(addFoodsPanel.panel);
        subAdminPanel.validate();
    }

    private void projectDetails(ActionEvent e) {
        ProjectDetails projectDetails = new ProjectDetails();
        subAdminPanel.setLayout(new java.awt.BorderLayout());
        subAdminPanel.removeAll();
        subAdminPanel.add(projectDetails.panel);
        subAdminPanel.validate();
    }

    private void logoutLabelMouseClicked(MouseEvent e) {
        mainFrame.setContentPane(new LoginPanel().panel);
        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel = new JPanel();
        subAdminPanel = new JPanel();
        manageUsersButton = new JButton();
        addUserButton = new JButton();
        addFoodsButton = new JButton();
        projectDetailsButton = new JButton();
        label2 = new JLabel();
        logoutLabel = new JLabel();
        label1 = new JLabel();

        //======== panel ========
        {
            panel.setMaximumSize(new Dimension(1025, 575));
            panel.setMinimumSize(new Dimension(1025, 575));

            //======== subAdminPanel ========
            {

                GroupLayout subAdminPanelLayout = new GroupLayout(subAdminPanel);
                subAdminPanel.setLayout(subAdminPanelLayout);
                subAdminPanelLayout.setHorizontalGroup(
                    subAdminPanelLayout.createParallelGroup()
                        .addGap(0, 742, Short.MAX_VALUE)
                );
                subAdminPanelLayout.setVerticalGroup(
                    subAdminPanelLayout.createParallelGroup()
                        .addGap(0, 563, Short.MAX_VALUE)
                );
            }

            //---- manageUsersButton ----
            manageUsersButton.setText("Manage Users");
            manageUsersButton.setFont(new Font("Segoe UI", Font.BOLD, 22));
            manageUsersButton.setBorder(new LineBorder(new Color(33, 37, 43)));
            manageUsersButton.addActionListener(e -> {
			manageUsers(e);
		});

            //---- addUserButton ----
            addUserButton.setText("Add Users");
            addUserButton.setFont(new Font("Segoe UI", Font.BOLD, 22));
            addUserButton.setBorder(new LineBorder(new Color(33, 37, 43)));
            addUserButton.addActionListener(e -> {
			addUser(e);
		});

            //---- addFoodsButton ----
            addFoodsButton.setText("Add Foods");
            addFoodsButton.setFont(new Font("Segoe UI", Font.BOLD, 22));
            addFoodsButton.setBorder(new LineBorder(new Color(33, 37, 43)));
            addFoodsButton.addActionListener(e -> {
			addFoods(e);
		});

            //---- projectDetailsButton ----
            projectDetailsButton.setText("Project Details");
            projectDetailsButton.setFont(new Font("Segoe UI", Font.BOLD, 22));
            projectDetailsButton.setBorder(new LineBorder(new Color(33, 37, 43)));
            projectDetailsButton.addActionListener(e -> projectDetails(e));

            //---- label2 ----
            label2.setText("Admin");
            label2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 27));
            label2.setHorizontalAlignment(SwingConstants.CENTER);

            //---- logoutLabel ----
            logoutLabel.setText("Logout");
            logoutLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
            logoutLabel.setForeground(new Color(255, 51, 51));
            logoutLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            logoutLabel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    logoutLabelMouseClicked(e);
                }
            });

            //---- label1 ----
            label1.setIcon(new ImageIcon(getClass().getResource("/img/logo-3.png")));
            label1.setDisabledIcon(new ImageIcon("src/main/java/org/apwj/view/resources/logo-3.png"));

            GroupLayout panelLayout = new GroupLayout(panel);
            panel.setLayout(panelLayout);
            panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup()
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(panelLayout.createParallelGroup()
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(logoutLabel))
                                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)))
                            .addComponent(manageUsersButton, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
                            .addComponent(addUserButton, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
                            .addComponent(addFoodsButton, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
                            .addComponent(projectDetailsButton, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(subAdminPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
            );
            panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(label1, GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                        .addGap(27, 27, 27)
                        .addComponent(manageUsersButton, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addUserButton, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addFoodsButton, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(projectDetailsButton, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(label2)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logoutLabel)
                        .addGap(46, 46, 46))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(subAdminPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    public JPanel panel;
    public static JPanel subAdminPanel;
    private JButton manageUsersButton;
    private JButton addUserButton;
    private JButton addFoodsButton;
    private JButton projectDetailsButton;
    private JLabel label2;
    private JLabel logoutLabel;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
