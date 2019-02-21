package com.thehecklers.swallow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@EnableBinding(Processor.class)
@SpringBootApplication
public class SwallowApplication {
	@Bean
	public Function<Subscriber, Subscriber> upperCaseIt() {
		return s -> new Subscriber(s.getId(), s.getFirstName().toUpperCase(), s.getLastName().toUpperCase(), s.getSubscribeDate());
	}

	@Bean
	public Function<Subscriber, Subscriber> reverseIt() {
		return s -> new Subscriber(s.getId(),
				reverse(s.getFirstName()),
				reverse(s.getLastName().toUpperCase()),
				s.getSubscribeDate());
	}

	static String reverse(String s) {
		return new StringBuilder(s).reverse().toString();
	}

	public static void main(String[] args) {
		SpringApplication.run(SwallowApplication.class, args);
	}

}