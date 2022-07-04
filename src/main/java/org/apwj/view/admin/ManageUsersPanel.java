/*
 * Created by JFormDesigner on Mon Jul 04 00:50:34 BDT 2022
 */

package org.apwj.view.admin;

import org.apwj.dao.userDAO;
import org.apwj.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;
import java.awt.event.*;
import java.util.List;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.table.DefaultTableModel;

/**
 * @author unknown
 */
public class ManageUsersPanel extends JPanel {
    public ManageUsersPanel() {
        initComponents();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        userDAO userDAO = applicationContext.getBean("userDao", userDAO.class);

        List<User> allUsers = userDAO.getAllUsers();
        Object[][] data = new Object[allUsers.size()][];

        for (int i = 0; i < allUsers.size(); i++) {
            for (User user : allUsers) {
                data[i][0] = user.getUsername();
                data[i][1] = user.getEmail();
                data[i][2] = user.getPass();
                data[i][3] = user.getGender();
                data[i][4] = user.getPhone();
                data[i][5] = user.getReg_date();
            }
        }

        usersTable.setModel(new DefaultTableModel(
                data, new String[]{"Username", "Email", "Password", "Gender", "Phone", "Joined"}
        ));
    }

    private void close(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel = new JPanel();
        label5 = new JLabel();
        scrollPane1 = new JScrollPane();
        usersTable = new JTable();
        closeButton = new JButton();
        closeButton2 = new JButton();

        //======== panel ========
        {

            //---- label5 ----
            label5.setText("Manage Users");
            label5.setFont(new Font("Segoe UI", Font.BOLD, 45));
            label5.setHorizontalAlignment(SwingConstants.CENTER);

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(usersTable);
            }

            //---- closeButton ----
            closeButton.setText("Delete");
            closeButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
            closeButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            closeButton.addActionListener(e -> close(e));

            //---- closeButton2 ----
            closeButton2.setText("Modify");
            closeButton2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
            closeButton2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            closeButton2.addActionListener(e -> close(e));

            GroupLayout panelLayout = new GroupLayout(panel);
            panel.setLayout(panelLayout);
            panelLayout.setHorizontalGroup(
                    panelLayout.createParallelGroup()
                            .addComponent(label5, GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
                            .addGroup(panelLayout.createSequentialGroup()
                                    .addGroup(panelLayout.createParallelGroup()
                                            .addGroup(panelLayout.createSequentialGroup()
                                                    .addGap(172, 172, 172)
                                                    .addComponent(closeButton, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
                                                    .addGap(93, 93, 93)
                                                    .addComponent(closeButton2, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panelLayout.createSequentialGroup()
                                                    .addGap(50, 50, 50)
                                                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 631, GroupLayout.PREFERRED_SIZE)))
                                    .addContainerGap(61, Short.MAX_VALUE))
            );
            panelLayout.setVerticalGroup(
                    panelLayout.createParallelGroup()
                            .addGroup(panelLayout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addComponent(label5)
                                    .addGap(18, 18, 18)
                                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 348, GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(closeButton2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(closeButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                    .addContainerGap(41, Short.MAX_VALUE))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    public JPanel panel;
    private JLabel label5;
    private JScrollPane scrollPane1;
    private JTable usersTable;
    private JButton closeButton;
    private JButton closeButton2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
