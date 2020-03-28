package Virtual_spring.Demo_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context=new AnnotationConfigApplicationContext(TrainerConfig.class);
         
         Trainee trainee=(Trainee) context.getBean("trainee");
         trainee.display();
    }
}
