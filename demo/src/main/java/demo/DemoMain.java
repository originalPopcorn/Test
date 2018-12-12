package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan
public class DemoMain {
	public static void main(String[] args) {
		SpringApplication.run(DemoMain.class, args);
	}
}
