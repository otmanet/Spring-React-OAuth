package com.example.AuthGoogleFacebookGithub;

import com.example.AuthGoogleFacebookGithub.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class AuthGoogleFacebookGithub {

	public static void main(String[] args) {
		SpringApplication.run(AuthGoogleFacebookGithub.class, args);
	}
}
