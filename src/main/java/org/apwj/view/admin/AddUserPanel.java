/*
 * Created by JFormDesigner on Mon Jul 04 00:56:14 BDT 2022
 */

package org.apwj.view.admin;

import org.apwj.dao.userDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author unknown
 */
public class AddUserPanel extends JPanel {
    public AddUserPanel() {
        initComponents();
    }

    private void close(ActionEvent e) {
        // TODO add your code here
    }

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
    userDAO userDAO = applicationContext.getBean("userDao", userDAO.class);

    private void add(ActionEvent e) {
        String username = usernameTF.getText().trim();
        String email = emailTF.getText().trim();
        String password = passwordTF.getText().trim();
        String confirmPassword = passwordTF.getText().trim();
        String phone = phoneTF.getText().trim();
        String gender = "male";

        if (username.isEmpty() || email.isEmpty() || password.isEmpty() || !password.equals(confirmPassword) || phone.isEmpty()) {
            System.out.println("Fill out all the fields properly");
        } else {
            userDAO.insertRow(username, email, password, phone, gender);
            System.out.println("Successfully added");
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel = new JPanel();
        label5 = new JLabel();
        label2 = new JLabel();
        label4 = new JLabel();
        usernameTF = new JTextField();
        emailTF = new JTextField();
        label3 = new JLabel();
        passwordTF = new JPasswordField();
        passwordField2 = new JPasswordField();
        label6 = new JLabel();
        label7 = new JLabel();
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        addButton = new JButton();
        radioButton3 = new JRadioButton();
        label8 = new JLabel();
        phoneTF = new JTextField();

        //======== panel ========
        {

            //---- label5 ----
            label5.setText("Add Users");
            label5.setFont(new Font("Segoe UI", Font.BOLD, 45));
            label5.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label2 ----
            label2.setText("Username");
            label2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- label4 ----
            label4.setText("Email");
            label4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- usernameTF ----
            usernameTF.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- emailTF ----
            emailTF.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- label3 ----
            label3.setText("Password");
            label3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- passwordTF ----
            passwordTF.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- passwordField2 ----
            passwordField2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- label6 ----
            label6.setText("Confirm Password");
            label6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- label7 ----
            label7.setText("Gender");
            label7.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- radioButton1 ----
            radioButton1.setText("Male");
            radioButton1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- radioButton2 ----
            radioButton2.setText("Female");
            radioButton2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- addButton ----
            addButton.setText("Add");
            addButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
            addButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            addButton.addActionListener(e -> add(e));

            //---- radioButton3 ----
            radioButton3.setText("Other");
            radioButton3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- label8 ----
            label8.setText("Phone Number");
            label8.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- phoneTF ----
            phoneTF.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            GroupLayout panelLayout = new GroupLayout(panel);
            panel.setLayout(panelLayout);
            panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup()
                    .addComponent(label5, GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(panelLayout.createParallelGroup()
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(panelLayout.createParallelGroup()
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(label2)
                                        .addGap(83, 83, 83)
                                        .addComponent(usernameTF, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(label4)
                                        .addGap(127, 127, 127)
                                        .addComponent(emailTF, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(label3)
                                        .addGap(89, 89, 89)
                                        .addComponent(passwordTF, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup()
                                    .addComponent(label6)
                                    .addComponent(label8))
                                .addGap(12, 12, 12)
                                .addGroup(panelLayout.createParallelGroup()
                                    .addComponent(passwordField2, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phoneTF, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE)))
                            .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addComponent(label7)
                                .addGap(110, 110, 110)
                                .addComponent(radioButton1)
                                .addGap(12, 12, 12)
                                .addComponent(radioButton2)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioButton3))
                            .addComponent(addButton, GroupLayout.PREFERRED_SIZE, 431, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
            );
            panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(label5)
                        .addGap(59, 59, 59)
                        .addGroup(panelLayout.createParallelGroup()
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(label2))
                            .addComponent(usernameTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(panelLayout.createParallelGroup()
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(label4))
                            .addComponent(emailTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(panelLayout.createParallelGroup()
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(label3))
                            .addComponent(passwordTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(panelLayout.createParallelGroup()
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(label6))
                            .addComponent(passwordField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup()
                            .addComponent(label8)
                            .addComponent(phoneTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup()
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(label7))
                            .addComponent(radioButton1)
                            .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(radioButton2)
                                .addComponent(radioButton3)))
                        .addGap(36, 36, 36)
                        .addComponent(addButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(95, Short.MAX_VALUE))
            );
        }

        //---- genderRadio ----
        ButtonGroup genderRadio = new ButtonGroup();
        genderRadio.add(radioButton1);
        genderRadio.add(radioButton2);
        genderRadio.add(radioButton3);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    public JPanel panel;
    private JLabel label5;
    private JLabel label2;
    private JLabel label4;
    private JTextField usernameTF;
    private JTextField emailTF;
    private JLabel label3;
    private JPasswordField passwordTF;
    private JPasswordField passwordField2;
    private JLabel label6;
    private JLabel label7;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JButton addButton;
    private JRadioButton radioButton3;
    private JLabel label8;
    private JTextField phoneTF;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
