package Virtual_spring.Demo_spring;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("traineinfo.properties")
public class TrainerConfig {

}
