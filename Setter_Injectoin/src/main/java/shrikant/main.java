package shrikant;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main{

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("application.xml");

        Deparment dp = (Deparment) context.getBean("dep2");
        System.out.println("Original Object:");
        System.out.println( dp.getDepid()); 
        System.out.println(dp.getDepname());
        for(Employee emp: dp.getList()) {
        	 System.out.println(emp);
        }
        }
        
    }

