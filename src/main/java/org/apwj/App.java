package org.apwj;

import com.formdev.flatlaf.intellijthemes.*;

import org.apwj.view.MainPanel;

import javax.swing.*;

public class App 
{
    public static JFrame mainFrame = new JFrame(String.valueOf(FlatOneDarkIJTheme.setup()));

    public static void main(String[] args )
    {
        mainFrame.setTitle("BearBurger");
        mainFrame.setResizable(false);
        MainPanel mainPanel = new MainPanel();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setContentPane(mainPanel.panel);
        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
