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
import static org.apwj.bearburger.view.LoginPanel.recoveryFrame;

public class RecoveryPanel extends JPanel {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
    UserDao userDao = applicationContext.getBean("userDao", UserDao.class);

    public RecoveryPanel() {
        initComponents();
    }

    private void close(ActionEvent e) {
        recoveryFrame.dispatchEvent(new WindowEvent(recoveryFrame, WindowEvent.WINDOW_CLOSING));
    }

    private void recoverButton(ActionEvent e) {

        User user = userDao.getByEmail(emailTF.getText());

        if (user == null) {
            dialogueBox("User not found!");
            return;
        }

        usernameLabel.setText(user.getUsername());
        passwordLabel.setText(user.getPass());
        dialogueBox("Your account has been successfully recovered.");
    }

    private void emailTFKeyReleased(KeyEvent e) {

        User user = userDao.getByEmail(emailTF.getText());

        if (user != null){
            usernameLabel.setText(user.getUsername());
            passwordLabel.setText(user.getPass());
            dialogueBox("Your account has been successfully recovered.");
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel = new JPanel();
        recoverButton = new JButton();
        emailTF = new JTextField();
        label2 = new JLabel();
        label1 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        usernameLabel = new JLabel();
        passwordLabel = new JLabel();
        closeButton = new JButton();

        //======== panel ========
        {
            //---- recoverButton ----
            recoverButton.setText("Recover");
            recoverButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
            recoverButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            recoverButton.addActionListener(e -> recoverButton(e));

            //---- emailTF ----
            emailTF.setFont(new Font("Segoe UI", Font.PLAIN, 20));
            emailTF.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                }
                @Override
                public void keyReleased(KeyEvent e) {
                    emailTFKeyReleased(e);
                }
                @Override
                public void keyTyped(KeyEvent e) {
                }
            });

            //---- label2 ----
            label2.setText(" EMAIL");
            label2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- label1 ----
            label1.setText("Account Recovery");
            label1.setFont(new Font("Segoe UI", Font.BOLD, 45));

            //---- label3 ----
            label3.setText("Username :");
            label3.setFont(new Font("Segoe UI Semibold", Font.BOLD, 22));

            //---- label4 ----
            label4.setText("Password  :");
            label4.setFont(new Font("Segoe UI Semibold", Font.BOLD, 22));

            //---- usernameLabel ----
            usernameLabel.setText("...");
            usernameLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 22));
            usernameLabel.setForeground(new Color(0, 153, 51));

            //---- passwordLabel ----
            passwordLabel.setText("...");
            passwordLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 22));
            passwordLabel.setForeground(new Color(0, 153, 51));

            //---- closeButton ----
            closeButton.setText("Close");
            closeButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
            closeButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            closeButton.addActionListener(e -> close(e));

            GroupLayout panelLayout = new GroupLayout(panel);
            panel.setLayout(panelLayout);
            panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup()
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label2)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGroup(panelLayout.createParallelGroup()
                                            .addGroup(panelLayout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addGroup(panelLayout.createParallelGroup()
                                                    .addComponent(label4)
                                                    .addComponent(label3))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(panelLayout.createParallelGroup()
                                                    .addComponent(usernameLabel)
                                                    .addComponent(passwordLabel)))
                                            .addComponent(closeButton, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE))
                                        .addGap(34, 34, 34)
                                        .addComponent(recoverButton, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(emailTF)))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(label1)))
                        .addContainerGap(73, Short.MAX_VALUE))
            );
            panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(label1)
                        .addGap(36, 36, 36)
                        .addComponent(label2)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailTF, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(panelLayout.createParallelGroup()
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(label3)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label4))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(usernameLabel)
                                .addGap(6, 6, 6)
                                .addComponent(passwordLabel)))
                        .addGap(44, 44, 44)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(recoverButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addComponent(closeButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(55, Short.MAX_VALUE))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    public JPanel panel;
    private JButton recoverButton;
    private JTextField emailTF;
    private JLabel label2;
    private JLabel label1;
    private JLabel label3;
    private JLabel label4;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JButton closeButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
