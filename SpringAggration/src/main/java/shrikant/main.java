package shrikant;

import java.io.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main{

    public static void main(String[] args) throws Exception {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("application.xml");

        Employee emp = context.getBean("e1", Employee.class);
        System.out.println("Original Object:");
        System.out.println(emp);

        FileOutputStream fos = new FileOutputStream("file.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(emp);
        oos.close();

        System.out.println("Object serialized");

        FileInputStream fis = new FileInputStream("file.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Employee emp2 = (Employee) ois.readObject();
        ois.close();

        System.out.println("Deserialized Object:");
        System.out.println(emp2);
    }
}
