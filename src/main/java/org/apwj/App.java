package org.apwj;

import com.formdev.flatlaf.intellijthemes.*;
import org.apwj.ui.MainForm;

import javax.swing.*;

public class App 
{
    public static void main( String[] args )
    {
        FlatOneDarkIJTheme.setup(); // set theme

        JFrame frame = new JFrame("BearBurger");
        frame.setContentPane(new MainForm());
        frame.pack();
        frame.setVisible(true);

    }
}
