package pe.com.movistar.movclaimsmsclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MovClaimsMsClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovClaimsMsClientApplication.class, args);
	}

}
