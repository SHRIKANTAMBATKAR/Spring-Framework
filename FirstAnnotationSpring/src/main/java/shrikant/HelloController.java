package shrikant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloController {
 private final HelloService helloService;
 @Autowired
 public HelloController(HelloService helloService) {
	 this.helloService = helloService;
 }
 
 public void showMessage() {
	 System.out.println(helloService.sayHello());
 }
}
