package shrikant;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main{

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("application.xml");

        Collage clg = (Collage) context.getBean("c1");
        System.out.println("Original Object:");
        clg.show();     

        }
        
    }

