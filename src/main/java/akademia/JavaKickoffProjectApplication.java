package akademia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:config.properties")
public class JavaKickoffProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaKickoffProjectApplication.class, args);
    }

}
