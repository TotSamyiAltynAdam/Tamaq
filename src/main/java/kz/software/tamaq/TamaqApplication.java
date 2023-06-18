package kz.software.tamaq;

import kz.software.tamaq.model.Apparat;
import kz.software.tamaq.model.Cafeteria;
import kz.software.tamaq.model.Food;
import kz.software.tamaq.model.FoodSet;
import kz.software.tamaq.model.Type;
import kz.software.tamaq.repository.ApparatRepository;
import kz.software.tamaq.repository.CafeteriaRepository;
import kz.software.tamaq.repository.FoodRepository;
import kz.software.tamaq.repository.FoodSetRepository;
import kz.software.tamaq.repository.TypeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class TamaqApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(TamaqApplication.class, args);
	}

}
