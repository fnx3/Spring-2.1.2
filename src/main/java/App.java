import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage() );

        HelloWorld newHelloWorldBean = (HelloWorld) applicationContext.getBean("helloworld");

        Cat one = (Cat) applicationContext.getBean("cat");
        Cat two = (Cat) applicationContext.getBean("cat");

        System.out.println(bean == newHelloWorldBean);
        System.out.println(one == two);

    }
}