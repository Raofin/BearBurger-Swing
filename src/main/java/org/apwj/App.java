package org.apwj;

import com.formdev.flatlaf.intellijthemes.*;
import org.apwj.ui.MainPanel;

import javax.swing.*;

public class App 
{
    public static JFrame mainFrame = new JFrame(String.valueOf(FlatOneDarkIJTheme.setup()));

    public static void main(String[] args )
    {
        mainFrame.setTitle("BearBurger");
        MainPanel mainPanel = new MainPanel();
        mainFrame.setContentPane(mainPanel.panel);
        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);

    }
}
