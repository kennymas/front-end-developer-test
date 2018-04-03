package com.proj.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

import com.proj.base.Classifier;

public class classifier {
    private JButton buttonClassify;
    private JPanel panelMain;
    private JTextField textAge;
    private JTextField textHeight;
    private JLabel labelClass;

    public classifier() {
        buttonClassify.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int age = Integer.parseInt(textAge.getText());
                int height = Integer.parseInt(textHeight.getText());
                Classifier classifier = new Classifier();
                labelClass.setText(classifier.getClassification(age,height));
            }
        });

        textAge.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent event) {
                char character = event.getKeyChar();
                if(!Character.isDigit(character)){
                    JOptionPane.showMessageDialog(null,"Please enter only numbers");
                    textAge.setText("");
                }
            }
        });

        textHeight.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent event) {
                char character = event.getKeyChar();
                if(!Character.isDigit(character)){
                    JOptionPane.showMessageDialog(null,"Please enter only numbers");
                    textHeight.setText("");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("classifier");
        jFrame.setContentPane(new classifier().panelMain);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
