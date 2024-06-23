package bean;

import injection.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeancontext.xml");
        MyBean myBean = (MyBean) context.getBean("myBean");
        myBean.showMessage();
        // Constructor injection
        ApplicationContext context1 = new ClassPathXmlApplicationContext("applicationConstractorInjection.xml");
        Car car = (Car) context1.getBean("myCar");
        car.DisplayDetails();
        // Setter Injection
        ApplicationContext context2 = new ClassPathXmlApplicationContext("applicationSetterInjection.xml");
        SetterInjection.Car car2 = (SetterInjection.Car) context2.getBean("myCar");
        car2.DisplayDetails();
    }
}
