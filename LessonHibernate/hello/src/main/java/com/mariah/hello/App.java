package com.mariah.hello;

import com.mariah.hello.dto.EmployeeEntity;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;

import java.io.File;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        // Add new Employee object
        EmployeeEntity emp = new EmployeeEntity();
        emp.setEmail("demo-user@mail.com");
        emp.setFirstName("demo");
        emp.setLastName("user");

        session.save(emp);

        session.getTransaction().commit();
        HibernateUtil.shutdown();
    }
}
