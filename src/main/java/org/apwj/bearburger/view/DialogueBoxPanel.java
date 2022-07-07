package org.apwj.bearburger.view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

import static org.apwj.bearburger.view.DialogueBox.dialogueFrame;
import static org.apwj.bearburger.view.LoginPanel.recoveryFrame;

public class DialogueBoxPanel extends JPanel {

    public DialogueBoxPanel(String message) {

        initComponents();
        label.setText(message);
    }

    private void ok(ActionEvent e) {

        dialogueFrame.dispatchEvent(new WindowEvent(recoveryFrame, WindowEvent.WINDOW_CLOSING));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label = new JLabel();
        okButton = new JButton();

        //---- label ----
        label.setText("Fill out all the fields perperly.");
        label.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
        label.setHorizontalAlignment(SwingConstants.CENTER);

        //---- okButton ----
        okButton.setText("OK");
        okButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
        okButton.addActionListener(e -> ok(e));

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label, GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                    .addContainerGap())
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(202, Short.MAX_VALUE)
                    .addComponent(okButton, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
                    .addGap(199, 199, 199))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(label)
                    .addGap(30, 30, 30)
                    .addComponent(okButton, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(31, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label;
    private JButton okButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
