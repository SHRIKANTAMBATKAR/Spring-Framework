package shrikant;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
public static void main(String []ar) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	HelloController controller = context.getBean(HelloController.class);
	controller.showMessage();
}
	
}
