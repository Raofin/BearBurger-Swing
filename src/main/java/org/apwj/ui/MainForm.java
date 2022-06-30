/*
 * Created by JFormDesigner on Fri Jul 01 03:01:20 BDT 2022
 */

package org.apwj.ui;

import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author unknown
 */
public class MainForm extends JPanel {
    public MainForm() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        button1 = new JButton();

        //======== this ========

        //---- button1 ----
        button1.setText("text");

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(160, 160, 160)
                    .addComponent(button1)
                    .addContainerGap(187, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(130, 130, 130)
                    .addComponent(button1)
                    .addContainerGap(147, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
