package raf.petrovicpleskonjic.rafairlinesuserservice;

import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableDiscoveryClient
public class RafAirlinesUserServiceApplication {
	
	@Bean
	public JavaMailSender getJavaMailSender() {
	    JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
	    mailSender.setHost("smtp.126.com");
	    mailSender.setPort(465);
	    
	    mailSender.setUsername("airlinems@126.com");
	    mailSender.setPassword("RIWMDQLJQTDWXDKC");
	    
	    Properties props = mailSender.getJavaMailProperties();
	    props.put("mail.transport.protocol", "smtp");
	    props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.ssl.enable","true");
	    props.put("mail.smtp.starttls.enable", "true");
	    props.put("mail.debug", "true");
	    
	    return mailSender;
	}
	
	@Bean
	public static BCryptPasswordEncoder encoder() {
		return new BCryptPasswordEncoder(10);
	}

	public static void main(String[] args) {
		SpringApplication.run(RafAirlinesUserServiceApplication.class, args);
	}

}
