package br.com.compassuol.pb.msorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MsOrderApplication {

    public static void main(String[] args) {
		SpringApplication.run(MsOrderApplication.class, args);
	}

}
