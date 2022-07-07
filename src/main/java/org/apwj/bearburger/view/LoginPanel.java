package org.apwj.bearburger.view;

import com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme;
import org.apwj.bearburger.dao.UserDao;
import org.apwj.bearburger.domain.User;
import org.apwj.bearburger.view.admin.AdminPanel;
import org.apwj.bearburger.view.customer.BrowseFoodsPanel;
import org.apwj.bearburger.view.customer.HomePanel;
import org.apwj.bearburger.view.customer.RecoveryPanel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

import static org.apwj.bearburger.App.mainFrame;
import static org.apwj.bearburger.view.DialogueBox.dialogueBox;
import static org.apwj.bearburger.view.customer.HomePanel.subHomePanel;

public class LoginPanel extends JPanel {

    public static JFrame recoveryFrame = new JFrame(String.valueOf(FlatOneDarkIJTheme.setup()));

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
    UserDao userDAO = applicationContext.getBean("userDao", UserDao.class);

    public LoginPanel() {
        initComponents();
    }

    private void registerMouseClicked(MouseEvent e) {
        RegistrationPanel registrationPanel = new RegistrationPanel();
        mainFrame.setContentPane(registrationPanel.panel);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }

    private void forgotPasswordMouseClicked(MouseEvent e) {
        recoveryFrame.setTitle("BearBurger");
        recoveryFrame.setResizable(false);
        RecoveryPanel recoveryPanel = new RecoveryPanel();
        recoveryFrame.setContentPane(recoveryPanel.panel);
        recoveryFrame.pack();
        recoveryFrame.setLocationRelativeTo(null);
        recoveryFrame.setVisible(true);
    }

    private void loginButton(ActionEvent e) {
        String username = usernameTF.getText().trim();
        String password = String.valueOf(passwordTF.getPassword());

        if (!username.isEmpty() && !password.isEmpty()) {
            if (username.equals("admin") && password.equals("admin")) {
                AdminPanel adminPanel = new AdminPanel();
                mainFrame.setContentPane(adminPanel.panel);
                mainFrame.pack();
                mainFrame.setVisible(true);
            } else {
                User checkUser = userDAO.searchByUsername(username);
                if (checkUser != null) {
                    if (username.equals(checkUser.getUsername()) && password.equals(checkUser.getPass())) {
                        HomePanel homePanel = new HomePanel(checkUser.getUserId());
                        mainFrame.setContentPane(homePanel.panel);
                        mainFrame.pack();
                        mainFrame.setVisible(true);

                        BrowseFoodsPanel browseFoodsPanel = new BrowseFoodsPanel();
                        subHomePanel.setLayout(new java.awt.BorderLayout());
                        subHomePanel.removeAll();
                        subHomePanel.add(browseFoodsPanel.panel);
                        subHomePanel.validate();
                    } else dialogueBox("Invalid username or password.");
                } else dialogueBox("Invalid username or password.");
            }
        } else dialogueBox("Fill out all the fields properly.");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel = new JPanel();
        usernameTF = new JTextField();
        label1 = new JLabel();
        loginButton = new JButton();
        register = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        forgotPassword = new JLabel();
        label5 = new JLabel();
        passwordTF = new JPasswordField();
        label4 = new JLabel();

        //======== panel ========
        {
            panel.setMaximumSize(new Dimension(1025, 575));
            panel.setMinimumSize(new Dimension(1025, 575));
            panel.setPreferredSize(new Dimension(1025, 575));

            //---- usernameTF ----
            usernameTF.setFont(new Font("Segoe UI", Font.PLAIN, 20));

            //---- label1 ----
            label1.setText("Welcome!");
            label1.setFont(new Font("Segoe UI", Font.BOLD, 45));

            //---- loginButton ----
            loginButton.setText("Login");
            loginButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
            loginButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            loginButton.addActionListener(e -> loginButton(e));

            //---- register ----
            register.setText("Create an Account");
            register.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
            register.setForeground(new Color(56, 117, 237));
            register.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            register.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    registerMouseClicked(e);
                }
            });

            //---- label2 ----
            label2.setText(" Username");
            label2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));

            //---- label3 ----
            label3.setText(" Password");
            label3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));

            //---- forgotPassword ----
            forgotPassword.setText(" Forgot your password?");
            forgotPassword.setForeground(new Color(56, 117, 237));
            forgotPassword.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
            forgotPassword.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            forgotPassword.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    forgotPasswordMouseClicked(e);
                }
            });

            //---- label5 ----
            label5.setText("New here?");
            label5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));

            //---- passwordTF ----
            passwordTF.setFont(new Font("Segoe UI", Font.PLAIN, 20));

            //---- label4 ----
            label4.setIcon(new ImageIcon(getClass().getResource("/img/logo-2.png")));

            GroupLayout panelLayout = new GroupLayout(panel);
            panel.setLayout(panelLayout);
            panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addContainerGap(123, Short.MAX_VALUE)
                        .addComponent(label4, GroupLayout.PREFERRED_SIZE, 399, GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addGroup(panelLayout.createParallelGroup()
                            .addGroup(panelLayout.createParallelGroup()
                                .addComponent(loginButton, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 302, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addGap(60, 60, 60)
                                    .addComponent(label5)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(register)))
                            .addComponent(label3)
                            .addComponent(forgotPassword)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(panelLayout.createParallelGroup()
                                    .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createParallelGroup()
                                        .addComponent(usernameTF, GroupLayout.PREFERRED_SIZE, 301, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label2))
                                    .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                        .addComponent(label1)
                                        .addGap(47, 47, 47))))
                            .addComponent(passwordTF, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 302, GroupLayout.PREFERRED_SIZE))
                        .addGap(112, 112, 112))
            );
            panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(panelLayout.createParallelGroup()
                            .addComponent(label4, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 494, GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(label1)
                                .addGap(35, 35, 35)
                                .addComponent(label2)
                                .addGap(3, 3, 3)
                                .addComponent(usernameTF, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(label3)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passwordTF, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(forgotPassword)
                                .addGap(56, 56, 56)
                                .addComponent(loginButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(register)
                                    .addComponent(label5))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 59, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(42, Short.MAX_VALUE))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    public JPanel panel;
    private JTextField usernameTF;
    private JLabel label1;
    private JButton loginButton;
    private JLabel register;
    private JLabel label2;
    private JLabel label3;
    private JLabel forgotPassword;
    private JLabel label5;
    private JPasswordField passwordTF;
    private JLabel label4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
