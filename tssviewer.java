package com.example;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tssviewer {
    public static void main(String[] args) {
        // Create JFrame
        JFrame frame = new JFrame("Dropdown Example");

        // Create JComboBox (dropdown)
        String[] options = {"Option 1", "Option 2", "Option 3"};
        JComboBox<String> dropdown = new JComboBox<>(options);

        // Create JButton to show selected option
        JButton showButton = new JButton("Show Selected Option");

        // Create JLabel to display the selected option
        JLabel resultLabel = new JLabel();

        // Add ActionListener to the button
        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedOption = (String) dropdown.getSelectedItem();
                resultLabel.setText("Selected Option: " + selectedOption);
            }
        });

        // Create JPanel and add components
        JPanel panel = new JPanel();
        panel.add(dropdown);
        panel.add(showButton);
        panel.add(resultLabel);

        // Set layout manager for the panel
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Set default close operation and size for the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        // Add the panel to the frame
        frame.getContentPane().add(panel);

        // Set frame visibility
        frame.setVisible(true);
    }
}
