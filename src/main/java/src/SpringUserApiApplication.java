package src;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@EntityScan

@SpringBootApplication
public class SpringUserApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringUserApiApplication.class, args);
	}

}
