package org.apwj.bearburger.view.admin;

import org.apwj.bearburger.dao.UserDao;
import org.apwj.bearburger.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

import static org.apwj.bearburger.view.DialogueBox.dialogueBox;
import static org.apwj.bearburger.view.LoginPanel.recoveryFrame;
import static org.apwj.bearburger.view.admin.AdminPanel.subAdminPanel;
import static org.apwj.bearburger.view.admin.ManageUsersPanel.adminModifyUserFrame;

public class ModifyUser extends JPanel {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
    UserDao userDao = applicationContext.getBean("userDao", UserDao.class);

    private User loggedInUser;
    private String selectedGender = null;

    public ModifyUser(User loggedInUser) {

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

    private void modifyButton(ActionEvent e) {

        String phone = phoneTF.getText();
        String pass = String.valueOf(passwordTF.getPassword());

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

        recoveryFrame.dispatchEvent(new WindowEvent(recoveryFrame, WindowEvent.WINDOW_CLOSING));
        dialogueBox("User details has been updated.");
        refreshManagePanel();
        adminModifyUserFrame.dispose();
    }

    private void refreshManagePanel() {
        ManageUsersPanel manageUsersPanel = new ManageUsersPanel();
        subAdminPanel.setLayout(new java.awt.BorderLayout());
        subAdminPanel.removeAll();
        subAdminPanel.add(manageUsersPanel.panel);
        subAdminPanel.validate();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
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

        //---- label5 ----
        label5.setText("Modify User");
        label5.setFont(new Font("Segoe UI", Font.BOLD, 35));
        label5.setHorizontalAlignment(SwingConstants.CENTER);

        //---- confirmButton ----
        confirmButton.setText("Modify");
        confirmButton.setFont(new Font("Segoe UI", Font.BOLD, 20));
        confirmButton.addActionListener(e -> {
			modifyButton(e);
		});

        //---- label2 ----
        label2.setText("Username");
        label2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

        //---- label4 ----
        label4.setText("Email");
        label4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

        //---- label3 ----
        label3.setText("Password");
        label3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

        //---- label6 ----
        label6.setText("Phone");
        label6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

        //---- phoneTF ----
        phoneTF.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
        phoneTF.setForeground(Color.white);

        //---- label7 ----
        label7.setText("Gender");
        label7.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

        //---- label8 ----
        label8.setText("Joined");
        label8.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

        //---- reg_date_label ----
        reg_date_label.setText("July 2, 2022");
        reg_date_label.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
        reg_date_label.setForeground(Color.white);

        //---- usernameLabel ----
        usernameLabel.setText("username");
        usernameLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
        usernameLabel.setForeground(Color.white);

        //---- emailLabel ----
        emailLabel.setText("email");
        emailLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
        emailLabel.setForeground(Color.white);

        //---- maleRadioButton ----
        maleRadioButton.setText("Male");
        maleRadioButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
        maleRadioButton.setForeground(Color.white);

        //---- femaleRadioButton ----
        femaleRadioButton.setText("Female");
        femaleRadioButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
        femaleRadioButton.setForeground(Color.white);

        //---- otherRadioButton ----
        otherRadioButton.setText("Other");
        otherRadioButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
        otherRadioButton.setForeground(Color.white);

        //---- passwordTF ----
        passwordTF.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
        passwordTF.setForeground(Color.white);

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addComponent(label5, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(52, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup()
                                .addComponent(label2)
                                .addComponent(label4))
                            .addGap(24, 24, 24)
                            .addGroup(layout.createParallelGroup()
                                .addComponent(emailLabel)
                                .addComponent(usernameLabel)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup()
                                .addComponent(label6)
                                .addComponent(label7)
                                .addComponent(label3)
                                .addComponent(label8))
                            .addGap(24, 24, 24)
                            .addGroup(layout.createParallelGroup()
                                .addComponent(reg_date_label)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(phoneTF)
                                    .addComponent(passwordTF, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(maleRadioButton)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(femaleRadioButton)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(otherRadioButton)))))
                    .addGap(44, 44, 44))
                .addGroup(layout.createSequentialGroup()
                    .addGap(142, 142, 142)
                    .addComponent(confirmButton, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(label5)
                    .addGap(27, 27, 27)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2)
                        .addComponent(usernameLabel))
                    .addGap(6, 6, 6)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(label4)
                        .addComponent(emailLabel))
                    .addGap(6, 6, 6)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(passwordTF, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label3))
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGap(7, 7, 7)
                            .addComponent(label6))
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(phoneTF, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(label7))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(maleRadioButton)
                            .addComponent(femaleRadioButton)
                            .addComponent(otherRadioButton)))
                    .addGap(6, 6, 6)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(label8)
                        .addComponent(reg_date_label))
                    .addGap(26, 26, 26)
                    .addComponent(confirmButton, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(43, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
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
