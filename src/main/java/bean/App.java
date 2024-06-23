package bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeancontext.xml");
            MyBean myBean = (MyBean) context.getBean("myBean");
            myBean.showMessage();
        } catch (Exception e) {
            System.out.println("Error loading context: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
