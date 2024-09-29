package br.udesc.ese_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EseEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EseEurekaApplication.class, args);
	}

}
