package cloud.service4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"cloud.service4"})
@SpringBootApplication
public class Service4Application {

	public static void main(String[] args) {
		SpringApplication.run(Service4Application.class, args);
	}

}
