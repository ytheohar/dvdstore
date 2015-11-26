package org.ytheohar.dvdstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "org.ytheohar.dvdstore" })
@EntityScan(basePackages = { "org.ytheohar.dvdstore.domain" })
@EnableJpaRepositories(basePackages = { "org.ytheohar.dvdstore.repository" })
public class DvdstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(DvdstoreApplication.class, args);
	}
}
