/*
 * Created by JFormDesigner on Mon Jul 04 00:50:34 BDT 2022
 */

package org.apwj.view.admin;

import org.apwj.dao.userDAO;
import org.apwj.domain.User;
import org.apwj.view.ProfileModifyPanel;
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
    public static JFrame adminModifyUserFrame = new JFrame();
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
    userDAO userDAO = applicationContext.getBean("userDao", userDAO.class);
    User selectedUser = null;
    public ManageUsersPanel() {
        initComponents();


        List<User> allUsers = userDAO.getAllUsers();
        Object[][] data = new Object[allUsers.size()][7];

        for (int i = 0; i < allUsers.size(); i++) {

            data[i][0] = allUsers.get(i).getUserId();
            data[i][1] = allUsers.get(i).getUsername();
            data[i][2] = allUsers.get(i).getEmail();
            data[i][3] = allUsers.get(i).getPass();
            data[i][4] = allUsers.get(i).getGender();
            data[i][5] = allUsers.get(i).getPhone();
            data[i][6] = allUsers.get(i).getReg_date();

        }

        usersTable.setModel(new DefaultTableModel(
                data, new String[]{"User ID","Username", "Email", "Password", "Gender", "Phone", "Joined"}
        ));
    }

    private void close(ActionEvent e) {
        // TODO add your code here
    }

    private void usersTableMouseClicked(MouseEvent e) {
        DefaultTableModel tableModel = (DefaultTableModel) usersTable.getModel();
        int selectedIndex = usersTable.getSelectedRow();
        int userId = (int) tableModel.getValueAt(selectedIndex,0);
        selectedUser = userDAO.searchById(userId);
    }

    private void modify(ActionEvent e) {
        adminModifyUserFrame.setTitle("BearBurger");
        adminModifyUserFrame.setResizable(false);
        ProfileModifyPanel profileModifyPanel = new ProfileModifyPanel(selectedUser);
        adminModifyUserFrame.setContentPane(profileModifyPanel.panel);
        adminModifyUserFrame.pack();
        adminModifyUserFrame.setLocationRelativeTo(null);
        adminModifyUserFrame.setVisible(true);

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel = new JPanel();
        label5 = new JLabel();
        scrollPane1 = new JScrollPane();
        usersTable = new JTable();
        deleteButton = new JButton();
        modifyButton = new JButton();

        //======== panel ========
        {

            //---- label5 ----
            label5.setText("Manage Users");
            label5.setFont(new Font("Segoe UI", Font.BOLD, 45));
            label5.setHorizontalAlignment(SwingConstants.CENTER);

            //======== scrollPane1 ========
            {

                //---- usersTable ----
                usersTable.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        usersTableMouseClicked(e);
                    }
                });
                scrollPane1.setViewportView(usersTable);
            }

            //---- deleteButton ----
            deleteButton.setText("Delete");
            deleteButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
            deleteButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            deleteButton.addActionListener(e -> close(e));

            //---- modifyButton ----
            modifyButton.setText("Modify");
            modifyButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
            modifyButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            modifyButton.addActionListener(e -> {
			close(e);
			modify(e);
		});

            GroupLayout panelLayout = new GroupLayout(panel);
            panel.setLayout(panelLayout);
            panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup()
                    .addComponent(label5, GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup()
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(172, 172, 172)
                                .addComponent(deleteButton, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)
                                .addComponent(modifyButton, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(modifyButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
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
    private JButton deleteButton;
    private JButton modifyButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
