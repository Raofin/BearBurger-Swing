package org.apwj.view;

import com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme;

import javax.swing.*;

public class DialogueBox {
    public static JFrame dialogueFrame = new JFrame(String.valueOf(FlatOneDarkIJTheme.setup()));

    public static void dialogueBox(String message){
        dialogueFrame.setTitle("BearBurger");
        dialogueFrame.setResizable(false);
        DialogueBoxPanel dialogueBoxPanel = new DialogueBoxPanel(message);
        dialogueFrame.setContentPane(dialogueBoxPanel);
        dialogueFrame.pack();
        dialogueFrame.setLocationRelativeTo(null);
        dialogueFrame.setVisible(true);
    }
}
