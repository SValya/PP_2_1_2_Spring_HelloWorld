import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        //HelloWorld
        HelloWorld beanHelloWorld =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHelloWorld.getMessage());
        HelloWorld secondBeanHelloWorld =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(secondBeanHelloWorld.getMessage());
        System.out.println(beanHelloWorld == secondBeanHelloWorld);

        //Cat
        Cat beanCat = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat.getMessage());
        Cat secondBeanCat = (Cat) applicationContext.getBean("cat");
        System.out.println(secondBeanCat.getMessage());
        System.out.println(beanCat == secondBeanCat);
    }
}