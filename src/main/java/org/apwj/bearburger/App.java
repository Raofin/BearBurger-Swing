package org.apwj.bearburger;

import com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme;
import org.apwj.bearburger.view.MainPanel;

import javax.swing.*;

public class App {

    public static JFrame mainFrame = new JFrame(String.valueOf(FlatOneDarkIJTheme.setup()));

    public static void main(String[] args) {

        mainFrame.setTitle("BearBurger");
        mainFrame.setResizable(false);
        MainPanel mainPanel = new MainPanel();
        mainFrame.setContentPane(mainPanel.panel);
        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
