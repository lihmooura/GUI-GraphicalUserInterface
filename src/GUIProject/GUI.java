package GUIProject;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// GUI stand for Graphic User Interface

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI implements ActionListener {
    private int clicks = 0;
    private JLabel label = new JLabel("Number of clicks:  0     ");
    private JFrame frame = new JFrame();

    public GUI() {

//    	Generate the clickable button
        JButton button = new JButton("Click Me");
        button.addActionListener(this);

//        Generate the panel with button and text
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

// 		Generate the frame and display it
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI");
        frame.pack();
        frame.setVisible(true);
    }

//  	Generate the moment where button clicks
    public void actionPerformed(ActionEvent e) {
        clicks++;
        label.setText("Number of clicks:  " + clicks);
    }
//		Generate one Frame
    public static void main(String[] args) {
    	new GUI();
}

}
