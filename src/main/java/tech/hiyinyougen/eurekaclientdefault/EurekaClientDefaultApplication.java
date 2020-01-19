package tech.hiyinyougen.eurekaclientdefault;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientDefaultApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientDefaultApplication.class, args);
	}

}
