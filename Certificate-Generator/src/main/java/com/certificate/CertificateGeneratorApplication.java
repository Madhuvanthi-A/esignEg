package com.certificate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@EnableJpaRepositories({"com.certificate.repository.X509RevokedCertificateRepository","com.certificate.repository.UserRepository"})
@SpringBootApplication
//@ComponentScan(basePackages = { "com.*"})
//@ComponentScan("com.myapp.repositories")
@EnableCaching
@Configuration
@EnableAutoConfiguration
public class CertificateGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CertificateGeneratorApplication.class, args);
		System.out.print("applicatio started");
	}
	
    @Bean
	CommandLineRunner lookup() {
		return args -> {
			SSLCertificateValidation.disable();
		};
	}
	
}
