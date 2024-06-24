package autowireName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class autowireNameApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowireByName.xml");

        Car myCar = (Car) context.getBean("myCar");
        myCar.DisplayDetails();
    }
}
