package net.benmalek.customerservice;

import net.benmalek.customerservice.config.GlobalConfig;
import net.benmalek.customerservice.entities.Customer;
import net.benmalek.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.UUID;

@SpringBootApplication
@EnableConfigurationProperties(GlobalConfig.class)
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
		return args -> {
			List<Customer> customerList=List.of(
					Customer.builder()
							.firstName("Othman")
							.lastName("Benmalek")
							.email("Othman@gmail.com")
							.build(),
					Customer.builder()
							.firstName("Mina")
							.lastName("Lol")
							.email("Lol@gmail.com")
							.build()
			);

			customerRepository.saveAll(customerList);
		};
	}

}
