package test;


import com.Monkey;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("demo.xml");
        Monkey monkey = context.getBean("Monkey",Monkey.class);
        try {
            monkey.stealPeaches("孙大圣的大徒弟");
        }
        catch(Exception e) {}
    }

}
