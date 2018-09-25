package nab.nabone.npsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("nab.nabone.npsapi.controller")
public class NpsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(NpsApiApplication.class, args);
	}
}
