package org.apwj.bearburger.view.admin;

import org.apwj.bearburger.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

import static org.apwj.bearburger.view.DialogueBox.dialogueBox;

public class AddUserPanel extends JPanel {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
    UserDao userDao = applicationContext.getBean("userDao", UserDao.class);

    private String selectedGender = null;

    public AddUserPanel() {

        initComponents();

        ButtonGroup genders = new ButtonGroup();
        genders.add(maleRadioButton);
        genders.add(femaleRadioButton);
        genders.add(otherRadioButton);

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
    }

    private void add(ActionEvent e) {
        String username = usernameTF.getText().trim();
        String email = emailTF.getText().trim();
        String password = String.valueOf(passwordTF.getPassword());
        String confirmPassword = String.valueOf(confirmPasswordTF.getPassword());
        String phone = phoneTF.getText();
        String gender = selectedGender;

        if (username.isEmpty() || email.isEmpty() || password.isEmpty() || !password.equals(confirmPassword) || phone.isEmpty()) {
            dialogueBox("Fill out all the fields properly");
        } else {
            userDao.insertRow(username, email, password, phone, gender);
            dialogueBox("Successfully added user");
            usernameTF.setText("");
            emailTF.setText("");
            passwordTF.setText("");
            confirmPasswordTF.setText("");
            phoneTF.setText("");

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
        confirmPasswordTF = new JPasswordField();
        label6 = new JLabel();
        label7 = new JLabel();
        maleRadioButton = new JRadioButton();
        femaleRadioButton = new JRadioButton();
        addButton = new JButton();
        otherRadioButton = new JRadioButton();
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

            //---- confirmPasswordTF ----
            confirmPasswordTF.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- label6 ----
            label6.setText("Confirm Password");
            label6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- label7 ----
            label7.setText("Gender");
            label7.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- maleRadioButton ----
            maleRadioButton.setText("Male");
            maleRadioButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- femaleRadioButton ----
            femaleRadioButton.setText("Female");
            femaleRadioButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- addButton ----
            addButton.setText("Add");
            addButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
            addButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            addButton.addActionListener(e -> add(e));

            //---- otherRadioButton ----
            otherRadioButton.setText("Other");
            otherRadioButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- label8 ----
            label8.setText("Phone Number");
            label8.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- phoneTF ----
            phoneTF.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            GroupLayout panelLayout = new GroupLayout(panel);
            panel.setLayout(panelLayout);
            panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup()
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
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelLayout.createParallelGroup()
                                    .addComponent(confirmPasswordTF, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phoneTF, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE)))
                            .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addComponent(label7)
                                .addGap(110, 110, 110)
                                .addComponent(maleRadioButton)
                                .addGap(12, 12, 12)
                                .addComponent(femaleRadioButton)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(otherRadioButton))
                            .addComponent(addButton, GroupLayout.PREFERRED_SIZE, 431, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(157, Short.MAX_VALUE))
                    .addComponent(label5, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
            );
            panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(label5)
                        .addGap(38, 38, 38)
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
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(confirmPasswordTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label8))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup()
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(label7))
                            .addComponent(maleRadioButton)
                            .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(femaleRadioButton)
                                .addComponent(otherRadioButton)))
                        .addGap(36, 36, 36)
                        .addComponent(addButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(95, Short.MAX_VALUE))
            );
        }

        //---- genderRadio ----
        ButtonGroup genderRadio = new ButtonGroup();
        genderRadio.add(maleRadioButton);
        genderRadio.add(femaleRadioButton);
        genderRadio.add(otherRadioButton);
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
    private JPasswordField confirmPasswordTF;
    private JLabel label6;
    private JLabel label7;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JButton addButton;
    private JRadioButton otherRadioButton;
    private JLabel label8;
    private JTextField phoneTF;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
