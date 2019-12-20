package com.demo.test.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import javax.swing.*;
import java.io.File;
import org.hibernate.cfg.AnnotationConfiguration;


public class EmployeeController extends JFrame{
    public Employee handleSubmitAction(
            String firstNameBox,
            String lastNameBox,
            String socialBox,
            String workPhoneBox,
            String homePhoneBox,
            String emailBox,
            String streetAddressBox,
            String aptNumberBox,
            String cityBox,
            String stateBox,
            String zipBox
    ){
        Employee employee = new Employee(firstNameBox, lastNameBox);
        employee.setFirstName(firstNameBox);
        employee.setLastName(lastNameBox);
        employee.setSocialNumber(socialBox);
        employee.setWorkPhone(workPhoneBox);
        employee.setHomePhone(homePhoneBox);
        employee.setEmail(emailBox);
        employee.setStreetAddress(streetAddressBox);
        employee.setAptNumber(aptNumberBox);
        employee.setCity(cityBox);
        employee.setState(stateBox);
        employee.setZip(zipBox);

        //Hibernate and session factory
        //StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        SessionFactory sessionFactory;
        try{
            sessionFactory = new AnnotationConfiguration().configure(new File("hibernate.cfg.xml")).buildSessionFactory();
        } catch (Throwable ex){
            System.err.println("initial Session Factory creation faild." + ex);
            throw new ExceptionInInitializerError(ex);
        }

        Session session = sessionFactory.openSession();
        Transaction t = session.beginTransaction();

        session.save(employee);
        t.commit();
        System.out.println("Data was successfully saved");
        session.close();

        return employee;
    }
}

