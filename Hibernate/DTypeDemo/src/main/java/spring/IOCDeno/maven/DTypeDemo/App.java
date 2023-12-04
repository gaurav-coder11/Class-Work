package spring.IOCDeno.maven.DTypeDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
    ApplicationContext apt = new ClassPathXmlApplicationContext("beans.xml");
    
    Performer per = (Performer) apt.getBean("pai");
    per.perform();
  }
}
