package br.com.compassuol.pb.msorder;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableRabbit
public class MsOrderApplication {

    public static void main(String[] args) {
		SpringApplication.run(MsOrderApplication.class, args);
	}

}
