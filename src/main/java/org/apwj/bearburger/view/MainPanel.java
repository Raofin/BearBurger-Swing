package org.apwj.bearburger.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

import static org.apwj.bearburger.App.mainFrame;

public class MainPanel {

    public MainPanel() {
        initComponents();
    }

    private void getStarted(ActionEvent e) {
        LoginPanel loginPanel = new LoginPanel();
        mainFrame.setContentPane(loginPanel.panel);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel = new JPanel();
        buttonGetStarted = new JButton();
        label2 = new JLabel();

        //======== panel ========
        {
            panel.setMaximumSize(new Dimension(1025, 575));

            //---- buttonGetStarted ----
            buttonGetStarted.setText("Get Started");
            buttonGetStarted.setFont(new Font("Segoe UI", Font.BOLD, 22));
            buttonGetStarted.setBorderPainted(false);
            buttonGetStarted.setBackground(new Color(102, 153, 255));
            buttonGetStarted.setForeground(Color.white);
            buttonGetStarted.addActionListener(e -> {
			getStarted(e);
			getStarted(e);
		});

            //---- label2 ----
            label2.setIcon(new ImageIcon(getClass().getResource("/img/logo-1.png")));
            label2.setHorizontalAlignment(SwingConstants.CENTER);

            GroupLayout panelLayout = new GroupLayout(panel);
            panel.setLayout(panelLayout);
            panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup()
                    .addComponent(label2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 1025, Short.MAX_VALUE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(427, 427, 427)
                        .addComponent(buttonGetStarted, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(432, Short.MAX_VALUE))
            );
            panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addContainerGap(35, Short.MAX_VALUE)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 418, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonGetStarted, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    public JPanel panel;
    private JButton buttonGetStarted;
    private JLabel label2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
