package org.apwj.bearburger.view.customer;

import org.apwj.bearburger.dao.UserDao;
import org.apwj.bearburger.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

import static org.apwj.bearburger.view.DialogueBox.dialogueBox;
import static org.apwj.bearburger.view.customer.HomePanel.subHomePanel;

public class ProfileModifyPanel extends JPanel {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
    UserDao userDao = applicationContext.getBean("userDao", UserDao.class);

    private User loggedInUser;
    private String selectedGender = null;


    public ProfileModifyPanel(User loggedInUser) {

        initComponents();

        this.loggedInUser = loggedInUser;
        ButtonGroup gendersButton = new ButtonGroup();
        gendersButton.add(maleRadioButton);
        gendersButton.add(femaleRadioButton);
        gendersButton.add(otherRadioButton);
        this.loggedInUser = loggedInUser;
        usernameLabel.setText(loggedInUser.getUsername());
        emailLabel.setText(loggedInUser.getEmail());
        passwordTF.setText(loggedInUser.getPass());
        phoneTF.setText(loggedInUser.getPhone());

        maleRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedGender = maleRadioButton.getText();
            }
        });

        femaleRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedGender = femaleRadioButton.getText();
            }
        });

        otherRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedGender = otherRadioButton.getText();
            }
        });

        selectedGender = loggedInUser.getGender();

        switch (loggedInUser.getGender()) {
            case "Male":
                maleRadioButton.setSelected(true);
                break;
            case "Female":
                femaleRadioButton.setSelected(true);
                break;
            case "Other":
                otherRadioButton.setSelected(true);
                break;
        }
    }

    private void confirm(ActionEvent e) {

        String pass = String.valueOf(passwordTF.getPassword());
        String phone = phoneTF.getText();

        if (pass.isEmpty() || phone.isEmpty() || selectedGender == null) {
            dialogueBox("Please fill out all the fields properly");
            return;
        }

        try{
            userDao.updateUser(loggedInUser.getUserId(), pass, phone, selectedGender);
        }
        catch (Exception exception){
            dialogueBox("Please fill out all the fields properly");
            return;
        }

        ProfileViewPanel profileViewPanel = new ProfileViewPanel(loggedInUser.getUserId());
        subHomePanel.setLayout(new java.awt.BorderLayout());
        subHomePanel.removeAll();
        subHomePanel.add(profileViewPanel.panel);
        subHomePanel.validate();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel = new JPanel();
        label5 = new JLabel();
        confirmButton = new JButton();
        label2 = new JLabel();
        label4 = new JLabel();
        label3 = new JLabel();
        label6 = new JLabel();
        phoneTF = new JTextField();
        label7 = new JLabel();
        label8 = new JLabel();
        reg_date_label = new JLabel();
        usernameLabel = new JLabel();
        emailLabel = new JLabel();
        maleRadioButton = new JRadioButton();
        femaleRadioButton = new JRadioButton();
        otherRadioButton = new JRadioButton();
        passwordTF = new JPasswordField();

        //======== panel ========
        {
            //---- label5 ----
            label5.setText("Modify Details");
            label5.setFont(new Font("Segoe UI", Font.BOLD, 45));
            label5.setHorizontalAlignment(SwingConstants.CENTER);

            //---- confirmButton ----
            confirmButton.setText("Confirm");
            confirmButton.setFont(new Font("Segoe UI", Font.BOLD, 20));
            confirmButton.addActionListener(e -> confirm(e));

            //---- label2 ----
            label2.setText("Username");
            label2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));

            //---- label4 ----
            label4.setText("Email");
            label4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));

            //---- label3 ----
            label3.setText("Password");
            label3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));

            //---- label6 ----
            label6.setText("Phone");
            label6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));

            //---- phoneTF ----
            phoneTF.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));
            phoneTF.setForeground(Color.white);

            //---- label7 ----
            label7.setText("Gender");
            label7.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));

            //---- label8 ----
            label8.setText("Joined");
            label8.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));

            //---- reg_date_label ----
            reg_date_label.setText("July 2, 2022");
            reg_date_label.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));
            reg_date_label.setForeground(Color.white);

            //---- usernameLabel ----
            usernameLabel.setText("username");
            usernameLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));
            usernameLabel.setForeground(Color.white);

            //---- emailLabel ----
            emailLabel.setText("email");
            emailLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));
            emailLabel.setForeground(Color.white);

            //---- maleRadioButton ----
            maleRadioButton.setText("Male");
            maleRadioButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));
            maleRadioButton.setForeground(Color.white);

            //---- femaleRadioButton ----
            femaleRadioButton.setText("Female");
            femaleRadioButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));
            femaleRadioButton.setForeground(Color.white);

            //---- otherRadioButton ----
            otherRadioButton.setText("Other");
            otherRadioButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));
            otherRadioButton.setForeground(Color.white);

            //---- passwordTF ----
            passwordTF.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));
            passwordTF.setForeground(Color.white);

            GroupLayout panelLayout = new GroupLayout(panel);
            panel.setLayout(panelLayout);
            panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGap(0, 296, Short.MAX_VALUE)
                        .addComponent(confirmButton, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
                        .addGap(291, 291, 291))
                    .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addContainerGap(143, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup()
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(label8)
                                .addGap(65, 65, 65)
                                .addComponent(reg_date_label))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup()
                                    .addComponent(label2)
                                    .addComponent(label4)
                                    .addComponent(label3)
                                    .addComponent(label7)
                                    .addComponent(label6))
                                .addGap(18, 18, 18)
                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(phoneTF)
                                    .addComponent(usernameLabel)
                                    .addComponent(emailLabel)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(maleRadioButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(femaleRadioButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(otherRadioButton))
                                    .addComponent(passwordTF, GroupLayout.PREFERRED_SIZE, 352, GroupLayout.PREFERRED_SIZE))))
                        .addGap(126, 126, 126))
            );
            panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(label5)
                        .addGap(48, 48, 48)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label2)
                            .addComponent(usernameLabel))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label4)
                            .addComponent(emailLabel))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label3)
                            .addComponent(passwordTF, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneTF, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label7)
                            .addComponent(maleRadioButton)
                            .addComponent(femaleRadioButton)
                            .addComponent(otherRadioButton))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label8)
                            .addComponent(reg_date_label))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(confirmButton, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    public JPanel panel;
    private JLabel label5;
    private JButton confirmButton;
    private JLabel label2;
    private JLabel label4;
    private JLabel label3;
    private JLabel label6;
    private JTextField phoneTF;
    private JLabel label7;
    private JLabel label8;
    private JLabel reg_date_label;
    private JLabel usernameLabel;
    private JLabel emailLabel;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JRadioButton otherRadioButton;
    private JPasswordField passwordTF;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
