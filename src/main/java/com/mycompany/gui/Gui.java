/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gui;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author ochuk
 */
public class Gui {
    public static void main(String[] args) {
        Runnable GUITask = new Runnable(){
            public void run() {
                MakeGUI();
            }
        };
        
        SwingUtilities.invokeLater(GUITask);
    }
    
    private static void MakeGUI() {
    JFrame frame = new JFrame("Hello World");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setPreferredSize(new Dimension(400, 400));
        
        JLabel label = new JLabel("Hi. I am a Gui.");
        
        frame.getContentPane().add(label);
        
        frame.pack();
        frame.setVisible(true);
    }
}
