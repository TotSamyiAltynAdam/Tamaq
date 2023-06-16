package kz.software.tamaq;

import kz.software.tamaq.controller.AuthController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TamaqApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(TamaqApplication.class, args);
	}

}
