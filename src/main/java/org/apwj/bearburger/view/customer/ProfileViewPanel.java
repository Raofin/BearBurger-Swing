package org.apwj.bearburger.view.customer;

import org.apwj.bearburger.dao.UserDao;
import org.apwj.bearburger.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

import static org.apwj.bearburger.view.customer.HomePanel.subHomePanel;

public class ProfileViewPanel extends JPanel {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
    UserDao userDao = applicationContext.getBean("userDao", UserDao.class);

    User loggedInUser = null;

    public ProfileViewPanel(int userId) {

        initComponents();

        loggedInUser = userDao.searchById(userId);
        usernameLabel.setText(loggedInUser.getUsername());
        emailLabel.setText(loggedInUser.getEmail());
        phoneLabel.setText(loggedInUser.getPhone());
        genderLabel.setText(loggedInUser.getGender());
        reg_date_label.setText(String.valueOf(loggedInUser.getReg_date()));
    }

    private void modify(ActionEvent e) {

        ProfileModifyPanel profileModifyPanel = new ProfileModifyPanel(loggedInUser);
        subHomePanel.setLayout(new java.awt.BorderLayout());
        subHomePanel.removeAll();
        subHomePanel.add(profileModifyPanel.panel);
        subHomePanel.validate();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel = new JPanel();
        label5 = new JLabel();
        modifyButton = new JButton();
        label2 = new JLabel();
        usernameLabel = new JLabel();
        label4 = new JLabel();
        emailLabel = new JLabel();
        label6 = new JLabel();
        phoneLabel = new JLabel();
        label7 = new JLabel();
        genderLabel = new JLabel();
        label8 = new JLabel();
        reg_date_label = new JLabel();

        //======== panel ========
        {
            //---- label5 ----
            label5.setText("View Details");
            label5.setFont(new Font("Segoe UI", Font.BOLD, 45));
            label5.setHorizontalAlignment(SwingConstants.CENTER);

            //---- modifyButton ----
            modifyButton.setText("Modify");
            modifyButton.setFont(new Font("Segoe UI", Font.BOLD, 20));
            modifyButton.addActionListener(e -> modify(e));

            //---- label2 ----
            label2.setText("Username");
            label2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));

            //---- usernameLabel ----
            usernameLabel.setText("User Name");
            usernameLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));
            usernameLabel.setForeground(Color.white);

            //---- label4 ----
            label4.setText("Email");
            label4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));

            //---- emailLabel ----
            emailLabel.setText("user@email.com");
            emailLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));
            emailLabel.setForeground(Color.white);

            //---- label6 ----
            label6.setText("Phone");
            label6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));

            //---- phoneLabel ----
            phoneLabel.setText("0123456789");
            phoneLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));
            phoneLabel.setForeground(Color.white);

            //---- label7 ----
            label7.setText("Gender");
            label7.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));

            //---- genderLabel ----
            genderLabel.setText("Male");
            genderLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));
            genderLabel.setForeground(Color.white);

            //---- label8 ----
            label8.setText("Joined");
            label8.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));

            //---- reg_date_label ----
            reg_date_label.setText("July 2, 2022");
            reg_date_label.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));
            reg_date_label.setForeground(Color.white);

            GroupLayout panelLayout = new GroupLayout(panel);
            panel.setLayout(panelLayout);
            panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup()
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(207, 207, 207)
                                .addGroup(panelLayout.createParallelGroup()
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(label2)
                                        .addGap(18, 18, 18)
                                        .addComponent(usernameLabel))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(label4)
                                        .addGap(73, 73, 73)
                                        .addComponent(emailLabel))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(label6)
                                        .addGap(62, 62, 62)
                                        .addComponent(phoneLabel))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(label7)
                                        .addGap(50, 50, 50)
                                        .addComponent(genderLabel))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(label8)
                                        .addGap(59, 59, 59)
                                        .addComponent(reg_date_label)))
                                .addGap(0, 211, Short.MAX_VALUE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(label5, GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(modifyButton, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(297, Short.MAX_VALUE))
            );
            panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(label5)
                        .addGap(42, 42, 42)
                        .addGroup(panelLayout.createParallelGroup()
                            .addComponent(label2)
                            .addComponent(usernameLabel))
                        .addGap(7, 7, 7)
                        .addGroup(panelLayout.createParallelGroup()
                            .addComponent(label4)
                            .addComponent(emailLabel))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup()
                            .addComponent(label6)
                            .addComponent(phoneLabel))
                        .addGap(6, 6, 6)
                        .addGroup(panelLayout.createParallelGroup()
                            .addComponent(label7)
                            .addComponent(genderLabel))
                        .addGap(6, 6, 6)
                        .addGroup(panelLayout.createParallelGroup()
                            .addComponent(label8)
                            .addComponent(reg_date_label))
                        .addGap(50, 50, 50)
                        .addComponent(modifyButton, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(84, Short.MAX_VALUE))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    public JPanel panel;
    private JLabel label5;
    private JButton modifyButton;
    private JLabel label2;
    private JLabel usernameLabel;
    private JLabel label4;
    private JLabel emailLabel;
    private JLabel label6;
    private JLabel phoneLabel;
    private JLabel label7;
    private JLabel genderLabel;
    private JLabel label8;
    private JLabel reg_date_label;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
