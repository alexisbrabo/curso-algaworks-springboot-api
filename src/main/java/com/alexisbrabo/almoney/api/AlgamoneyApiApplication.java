package com.alexisbrabo.almoney.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.alexisbrabo.almoney.api.config.property.AlgaMoneyApiProperty;

@SpringBootApplication
@EnableConfigurationProperties(AlgaMoneyApiProperty.class)
public class AlgamoneyApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlgamoneyApiApplication.class, args);
	}
}
