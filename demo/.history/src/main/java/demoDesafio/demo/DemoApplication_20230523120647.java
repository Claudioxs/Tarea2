package demoDesafio.demo;

import demoDesafio.demo.service.AutomovilServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);


		/*AutomovilServiceImpl a = new AutomovilServiceImpl();
		a.generarAutomoviles(5);
		System.out.println(a.buscarColor("Rojo"));*/
	}

}
