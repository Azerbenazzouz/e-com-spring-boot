package IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCApp {
    public static void main(String[] args) {
        // methode  1
        UserDataProvider dataProvider = new UserDatabase();
        UserManager userManager = new UserManager(dataProvider);
        System.out.println(userManager.getUserInfo());
        // methode  2
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationIOC.xml");
        UserManager userManager2 = (UserManager) context.getBean("userManager");
        System.out.println(userManager2.getUserInfo());
    }
}
