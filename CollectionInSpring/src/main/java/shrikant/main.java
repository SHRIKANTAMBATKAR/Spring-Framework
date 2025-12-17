package shrikant;

import java.awt.List;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main{

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("application.xml");

        Deparment emp = (Deparment) context.getBean("d1");
        System.out.println("Original Object:");
        System.out.println(emp);
        
        Iterator<Employee> itr = emp.getList().iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        }
        
    }

