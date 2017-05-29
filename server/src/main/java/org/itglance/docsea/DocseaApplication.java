package org.itglance.docsea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.activation.DataSource;

@SpringBootApplication
public class DocseaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocseaApplication.class, args);
	}
}
