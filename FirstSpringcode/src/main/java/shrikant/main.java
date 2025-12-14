package shrikant;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {

   ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        demo d = (demo) context.getBean("helloBean");
        d.sayHello();
    }
}
