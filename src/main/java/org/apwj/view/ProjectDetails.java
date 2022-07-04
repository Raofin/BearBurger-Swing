/*
 * Created by JFormDesigner on Tue Jul 05 00:47:35 BDT 2022
 */

package org.apwj.view;

import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author unknown
 */
public class ProjectDetails extends JPanel {
    public ProjectDetails() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel = new JPanel();
        label1 = new JLabel();

        //======== panel ========
        {

            //---- label1 ----
            label1.setIcon(new ImageIcon("src/main/java/org/apwj/view/resources/contribution.png"));

            GroupLayout panelLayout = new GroupLayout(panel);
            panel.setLayout(panelLayout);
            panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label1, GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                        .addContainerGap())
            );
            panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label1, GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                        .addContainerGap())
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    public JPanel panel;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
