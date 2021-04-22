package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class print {

    JLabel label;
    JFrame frame;
    JPanel panel;

    JLabel formLabel;
    JLabel formLabelA;
    JLabel formLabelB;
    JLabel formLabelC;
    JLabel formLabelD;
    JLabel formLabelError;
    JFrame formFrame;
    JPanel formPanel;
    int intA;
    int intB;
    int intC;
    int intD;

    JLabel doubleSidedLabel;
    JFrame doubleSidedFrame;
    JPanel doubleSidedPanel;
    int intYes;
    int intNo;

    JLabel adminLabel;
    JLabel adminLabelA;
    JLabel adminLabelB;
    JLabel adminLabelC;
    JLabel adminLabelD;
    JLabel adminLabelDouble;
    JFrame adminFrame;
    JPanel adminPanel;


    public print() {

        frame = new JFrame();

        label = new JLabel("Welcome!");

        JButton admin = new JButton("Admin");
        admin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                admin();
            }
        });

        JButton employee = new JButton("Employee");
        employee.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Form();
            }
        });

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(label);
        panel.add(admin);
        panel.add(employee);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Main Menu");
        frame.pack();
        frame.setVisible(true);
    }

    void Form(){

        frame.setVisible(false);

        formFrame = new JFrame();
        formLabel = new JLabel("select your document");

        JButton a = new JButton("A");
        a.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(intA < 5)
                intA++;
                formLabelA.setText("Amount of form A: " + intA);
            }
        });

        JButton b = new JButton("B");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(intB < 5)
                intB++;
                formLabelB.setText("Amount of form B: " + intB);
            }
        });

        JButton c = new JButton("C");
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(intC < 5)
                intC++;
                formLabelC.setText("Amount of form C: " + intC);
            }
        });

        JButton d = new JButton("D");
        d.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(intD < 5)
                intD++;
                formLabelD.setText("Amount of form D: " + intD);
            }
        });

        JButton nextPage = new JButton("Next page");
        nextPage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(intA<1 && intB<1 && intC<1 && intD<1)
                    formLabelError.setText("Error, must click at least 1 form");
                else doubleSided();
            }
        });

        formLabelA = new JLabel("Amount of form A: ");
        formLabelB = new JLabel("Amount of form B: ");
        formLabelC = new JLabel("Amount of form C: ");
        formLabelD = new JLabel("Amount of form D: ");
        formLabelError = new JLabel("");

        formPanel = new JPanel();
        formPanel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        formPanel.setLayout(new GridLayout(0,1));
        formPanel.add(formLabel);
        formPanel.add(a);
        formPanel.add(b);
        formPanel.add(c);
        formPanel.add(d);
        formPanel.add(formLabelA);
        formPanel.add(formLabelB);
        formPanel.add(formLabelC);
        formPanel.add(formLabelD);
        formPanel.add(nextPage);
        formPanel.add(formLabelError);

        formFrame.add(formPanel, BorderLayout.CENTER);
        formFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        formFrame.setTitle("Form");
        formFrame.pack();
        formFrame.setVisible(true);
    }

    void doubleSided(){

        formFrame.setVisible(false);

        doubleSidedFrame = new JFrame();

        doubleSidedLabel = new JLabel("Is you document to be printed as double sided?");

        JButton yes = new JButton("Yes");
        yes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                intYes++;
                doubleSidedFrame.setVisible(false);
                frame.setVisible(true);
            }
        });

        JButton no = new JButton("No");
        no.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                intNo++;
                doubleSidedFrame.setVisible(false);
                frame.setVisible(true);
            }
        });

        doubleSidedPanel= new JPanel();
        doubleSidedPanel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        doubleSidedPanel.setLayout(new GridLayout(0,1));
        doubleSidedPanel.add(doubleSidedLabel);
        doubleSidedPanel.add(yes);
        doubleSidedPanel.add(no);

        doubleSidedFrame.add(doubleSidedPanel, BorderLayout.CENTER);
        doubleSidedFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        doubleSidedFrame.setTitle("Double Sided");
        doubleSidedFrame.pack();
        doubleSidedFrame.setVisible(true);

    }

    void admin(){

        frame.setVisible(false);
        adminFrame = new JFrame();

        adminPanel = new JPanel();

        adminLabel = new JLabel("Print Data: ");
        adminLabelA = new JLabel("Amount to print for A: " + intA);
        adminLabelB = new JLabel("Amount to print for B: " + intB);
        adminLabelC = new JLabel("Amount to print for C: " + intC);
        adminLabelD = new JLabel("Amount to print for D: " + intD);
        JLabel doubleS = new JLabel("To be printed double sided");
        JLabel singleS = new JLabel("To be printed single sided");


        adminPanel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        adminPanel.setLayout(new GridLayout(0,1));
        adminPanel.add(adminLabel);
        adminPanel.add(adminLabelA);
        adminPanel.add(adminLabelB);
        adminPanel.add(adminLabelC);
        adminPanel.add(adminLabelD);
        if(intYes == 1)
            adminPanel.add(doubleS);
        else if(intNo == 1)
            adminPanel.add(singleS);

        adminFrame.add(adminPanel, BorderLayout.CENTER);
        adminFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        adminFrame.setTitle("Admin");
        adminFrame.pack();
        adminFrame.setVisible(true);

    }


    public static void main(String[] args) {
        new print();
    }
}