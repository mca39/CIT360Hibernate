package com.demo.test.Hibernate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame{

    JTextField firstNameBox;
    JTextField lastNameBox;
    JTextField socialBox;
    JTextField workPhoneBox;
    JTextField homePhoneBox ;
    JTextField emailBox;
    JTextField streetAddressBox;
    JTextField aptNumberBox;
    JTextField cityBox;
    JTextField stateBox;
    JTextField zipBox;

    JPanel panel;
    JButton submitButton;

    public GUI() {


        this.setTitle("Model-View-Controller");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 400);
        this.setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel firstLabel = new JLabel("First name:");
        JLabel lastLabel = new JLabel(" Last name:");
        JLabel socialLabel = new JLabel("SS Number:");
        JLabel workPhoneLabel = new JLabel("     Work #:");
        JLabel homePhoneLabel = new JLabel("      Home #:");
        JLabel emailLabel = new JLabel("          Email:");
        JLabel streetAddressLabel = new JLabel("        Street:");
        JLabel aptNumberLabel = new JLabel("Apartment:");
        JLabel cityLabel = new JLabel("             City:");
        JLabel stateLabel = new JLabel("State:");
        JLabel zipLabel = new JLabel("Zip Code:");

        final JLabel outputFirst = new JLabel();
        final JLabel outputLast = new JLabel();
        final JLabel outputSocial = new JLabel();
        final JLabel outputWorkPh = new JLabel();
        final JLabel outputHomePh = new JLabel();
        final JLabel outputEmail = new JLabel();
        final JLabel outputStreet = new JLabel();
        final JLabel outputApt = new JLabel();
        final JLabel outputCity = new JLabel();
        final JLabel outputState = new JLabel();
        final JLabel outputZip = new JLabel();

        final JTextArea outputBox = new JTextArea(13,50);
        //JScrollPane scrollPane = new JScrollPane(outputBox);
        outputBox.setEditable(false);


        firstNameBox = new JTextField(18);
        lastNameBox = new JTextField(18);
        socialBox = new JTextField(18);
        workPhoneBox = new JTextField(18);
        homePhoneBox = new JTextField(18);
        emailBox = new JTextField(18);
        streetAddressBox = new JTextField(18);
        aptNumberBox = new JTextField(18);
        cityBox = new JTextField(18);
        stateBox = new JTextField(18);
        zipBox = new JTextField(18);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmployeeController controller = new EmployeeController();
                Employee newEmployee = controller.handleSubmitAction(
                        firstNameBox.getText(),
                        lastNameBox.getText(),
                        socialBox.getText(),
                        workPhoneBox.getText(),
                        homePhoneBox.getText(),
                        emailBox.getText(),
                        streetAddressBox.getText(),
                        aptNumberBox.getText(),
                        cityBox.getText(),
                        stateBox.getText(),
                        zipBox.getText()
                );

                outputFirst.setText("First Name entered: " + newEmployee.getFirstName());
                outputLast.setText(" Last Name entered: " + newEmployee.getLastName());
                outputSocial.setText("SS Number entered: " + newEmployee.getSocialNumber());
                outputWorkPh.setText("Work phone Number entered: " + newEmployee.getWorkPhone());
                outputHomePh.setText("Home phone Number entered: " + newEmployee.getHomePhone());
                outputEmail.setText("Email entered: " + newEmployee.getEmail());
                outputStreet.setText("Street Address entered: " + newEmployee.getStreetAddress());
                outputApt.setText("Apartment Number entered: " + newEmployee.getAptNumber());
                outputCity.setText("City entered: " + newEmployee.getCity());
                outputState.setText("State entered: " + newEmployee.getState());
                outputZip.setText("Zip code entered: " + newEmployee.getZip());

                outputBox.setText(
                        outputFirst.getText() + '\n' +
                                outputLast.getText() + '\n' +
                                outputSocial.getText() + '\n' +
                                outputWorkPh.getText() + '\n' +
                                outputHomePh.getText() + '\n' +
                                outputEmail.getText() + '\n' +
                                outputStreet.getText() + '\n' +
                                outputApt.getText() + '\n' +
                                outputCity.getText() + '\n' +
                                outputState.getText() + '\n' +
                                outputZip.getText()
                );
            }
        });

        panel.add(firstLabel);
        panel.add(firstNameBox);
        panel.add(lastLabel);
        panel.add(lastNameBox);
        panel.add(socialLabel);
        panel.add(socialBox);
        panel.add(workPhoneLabel);
        panel.add(workPhoneBox);
        panel.add(homePhoneLabel);
        panel.add(homePhoneBox);
        panel.add(emailLabel);
        panel.add(emailBox);
        panel.add(streetAddressLabel);
        panel.add(streetAddressBox);
        panel.add(aptNumberLabel);
        panel.add(aptNumberBox);
        panel.add(cityLabel);
        panel.add(cityBox);
        panel.add(stateLabel);
        panel.add(stateBox);
        panel.add(zipLabel);
        panel.add(zipBox);

        panel.add(submitButton);

        panel.add(outputBox);

        this.add(panel);
    }

    public static void main(String[] args) {
        new GUI().setVisible(true);
    }
}
