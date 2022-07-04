/*
 * Created by JFormDesigner on Sat Jul 02 12:10:34 BDT 2022
 */

package org.apwj.view;

import org.apwj.dao.userDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

import static org.apwj.App.mainFrame;

public class RegistrationPanel extends JPanel {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
    userDAO userDao = applicationContext.getBean("userDao", userDAO.class);
    private ButtonGroup genders;
    String selectedGender = null;

    public RegistrationPanel() {
        initComponents();
        genders = new ButtonGroup();
        genders.add(maleRadioButton);
        genders.add(femaleRadioButton);
        genders.add(otherRadioButton);
        maleRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedGender = maleRadioButton.getText();
                System.out.println("Selected button: "+selectedGender);
            }
        });

        femaleRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedGender = femaleRadioButton.getText();
                System.out.println("Selected button: "+selectedGender);
            }
        });

        otherRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedGender = otherRadioButton.getText();
                System.out.println("Selected button: "+selectedGender);
            }
        });
        seePasswordCheckbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                passwordTF.setEchoChar(seePasswordCheckbox.isSelected() ? '\u0000' : (Character) UIManager.get("PasswordField.echoChar"));
            }
        });
    }


    private void loginLabelMouseClicked(MouseEvent e) {
        LoginPanel loginPanel = new LoginPanel();
        mainFrame.setContentPane(loginPanel.panel);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }

    private void register(ActionEvent e) {
        String username = usernameTF.getText().trim();
        String email = emailTF.getText().trim();
        String phone = phoneTF.getText().trim();
        String password = String.valueOf(passwordTF.getPassword());
        String confirmPassoword = String.valueOf(confirmPasswordTF.getPassword());
        if(!username.isEmpty() && !email.isEmpty() && phone.length()>=11 && password.equals(confirmPassoword)) {

            if(userDao.insertRow(username,email,password,phone,selectedGender)){
                System.out.println("New user registered successfully!");
                LoginPanel loginPanel = new LoginPanel();
                mainFrame.setContentPane(loginPanel.panel);
                mainFrame.pack();
                mainFrame.setVisible(true);
            }
        }    }

        private void registerMouseClicked(MouseEvent e) {
            // TODO add your code here
        }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        usernameTF = new JTextField();
        label3 = new JLabel();
        passwordTF = new JPasswordField();
        registerButton = new JButton();
        label5 = new JLabel();
        loginLabel = new JLabel();
        label4 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        emailTF = new JTextField();
        confirmPasswordTF = new JPasswordField();
        maleRadioButton = new JRadioButton();
        femaleRadioButton = new JRadioButton();
        otherRadioButton = new JRadioButton();
        label8 = new JLabel();
        seePasswordCheckbox = new JCheckBox();
        label9 = new JLabel();
        phoneTF = new JTextField();

        //======== panel ========
        {
            panel.setMaximumSize(new Dimension(1025, 575));
            panel.setPreferredSize(new Dimension(1025, 575));
            panel.setMinimumSize(new Dimension(1025, 575));

            //---- label1 ----
            label1.setText("Create an Account");
            label1.setFont(new Font("Segoe UI", Font.BOLD, 45));

            //---- label2 ----
            label2.setText("Username");
            label2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- usernameTF ----
            usernameTF.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- label3 ----
            label3.setText("Password");
            label3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- passwordTF ----
            passwordTF.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- registerButton ----
            registerButton.setText("Register");
            registerButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
            registerButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            registerButton.addActionListener(e -> register(e));

            //---- label5 ----
            label5.setText("Already have an account?");
            label5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));

            //---- loginLabel ----
            loginLabel.setText("Login");
            loginLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
            loginLabel.setForeground(new Color(56, 117, 237));
            loginLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            loginLabel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    registerMouseClicked(e);
                    loginLabelMouseClicked(e);
                }
            });

            //---- label4 ----
            label4.setText("Email");
            label4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- label6 ----
            label6.setText("Confirm Password");
            label6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- label7 ----
            label7.setText("Gender");
            label7.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- emailTF ----
            emailTF.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- confirmPasswordTF ----
            confirmPasswordTF.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- maleRadioButton ----
            maleRadioButton.setText("Male");
            maleRadioButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- femaleRadioButton ----
            femaleRadioButton.setText("Female");
            femaleRadioButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- otherRadioButton ----
            otherRadioButton.setText("Other");
            otherRadioButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- label8 ----
            label8.setIcon(new ImageIcon("src/main/java/org/apwj/view/resources/logo-2.png"));

            //---- seePasswordCheckbox ----
            seePasswordCheckbox.setText("See password?");

            //---- label9 ----
            label9.setText("Contact no.");
            label9.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- phoneTF ----
            phoneTF.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            GroupLayout panelLayout = new GroupLayout(panel);
            panel.setLayout(panelLayout);
            panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label8, GroupLayout.PREFERRED_SIZE, 393, GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelLayout.createParallelGroup()
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup()
                                    .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addGroup(panelLayout.createParallelGroup()
                                            .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                                .addComponent(label5)
                                                .addGap(6, 6, 6)
                                                .addComponent(loginLabel)
                                                .addGap(95, 95, 95))
                                            .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                                .addComponent(label1)
                                                .addGap(22, 22, 22))))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addGroup(panelLayout.createParallelGroup()
                                            .addGroup(panelLayout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addGroup(panelLayout.createParallelGroup()
                                                    .addComponent(label2)
                                                    .addComponent(label4)
                                                    .addComponent(label3)))
                                            .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addGroup(panelLayout.createSequentialGroup()
                                                    .addComponent(label6)
                                                    .addGap(64, 64, 64)
                                                    .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(confirmPasswordTF)
                                                        .addComponent(passwordTF)
                                                        .addComponent(emailTF)
                                                        .addComponent(usernameTF, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(panelLayout.createSequentialGroup()
                                                        .addComponent(label7)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(maleRadioButton)
                                                        .addGap(12, 12, 12)
                                                        .addComponent(femaleRadioButton)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(otherRadioButton))
                                                    .addGroup(panelLayout.createSequentialGroup()
                                                        .addComponent(label9)
                                                        .addGap(126, 126, 126)
                                                        .addComponent(phoneTF, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)))))
                                        .addGap(12, 12, 12)))
                                .addComponent(seePasswordCheckbox)
                                .addGap(12, 12, 12))
                            .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(registerButton, GroupLayout.PREFERRED_SIZE, 431, GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100))))
            );
            panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(label1)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label2)
                            .addComponent(usernameTF, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label4)
                            .addComponent(emailTF, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup()
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(label9))
                            .addComponent(phoneTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(otherRadioButton)
                            .addComponent(maleRadioButton)
                            .addComponent(femaleRadioButton)
                            .addComponent(label7))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label3)
                            .addComponent(passwordTF, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                            .addComponent(seePasswordCheckbox))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(confirmPasswordTF, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6))
                        .addGap(71, 71, 71)
                        .addComponent(registerButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup()
                            .addComponent(label5)
                            .addComponent(loginLabel))
                        .addGap(112, 112, 112))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(label8, GroupLayout.PREFERRED_SIZE, 507, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    public JPanel panel;
    private JLabel label1;
    private JLabel label2;
    private JTextField usernameTF;
    private JLabel label3;
    private JPasswordField passwordTF;
    private JButton registerButton;
    private JLabel label5;
    private JLabel loginLabel;
    private JLabel label4;
    private JLabel label6;
    private JLabel label7;
    private JTextField emailTF;
    private JPasswordField confirmPasswordTF;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JRadioButton otherRadioButton;
    private JLabel label8;
    private JCheckBox seePasswordCheckbox;
    private JLabel label9;
    private JTextField phoneTF;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
