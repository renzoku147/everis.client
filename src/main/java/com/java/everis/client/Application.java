package com.java.everis.client;

import com.java.everis.client.entity.Customer;
import com.java.everis.client.entity.TypeCostumer;
import com.java.everis.client.service.CustomerService;
import com.java.everis.client.service.TypeCustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import reactor.core.publisher.Flux;

import java.lang.reflect.Type;

@Slf4j
@SpringBootApplication
//public class Application implements CommandLineRunner {
public class Application  {

	@Autowired
	private ReactiveMongoTemplate mongoTemplate;

	@Autowired
	private TypeCustomerService typeCustomerService;

	@Autowired
	private CustomerService customerService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


//	@Override
//	public void run(String... args) throws Exception {
//		mongoTemplate.dropCollection("CUSTOMER").subscribe();
//		mongoTemplate.dropCollection("TYPECUSTOMER").subscribe();
//
//		TypeCostumer tc1 = TypeCostumer.builder().type("Personal").build();
//		TypeCostumer tc2 = TypeCostumer.builder().type("Empresarial").build();
//
//		Flux.just(tc1, tc2)
//				.flatMap(tc -> typeCustomerService.create(tc))
//				.doOnNext(p -> log.info("TypeCustomer created > " + p.getType()))
//				.thenMany(Flux.just(
//							Customer.builder().name("Renzo").lastName("Espinoza").typeCustomer(tc1).dni("47494742").edad(28).sexo("M").build(),
//							Customer.builder().name("GianCarlos").lastName("Perez").typeCustomer(tc1).dni("54513537").edad(28).sexo("M").build(),
//							Customer.builder().name("Yisel").lastName("Gimena").typeCustomer(tc2).dni("97421208").edad(28).sexo("F").build(),
//							Customer.builder().name("Lidsai").lastName("Alicia").typeCustomer(tc2).dni("12021038").edad(20).sexo("F").build())
//						.flatMap(c -> customerService.create(c)))
//		.subscribe(r -> log.info("Customer created > " + r.getName()+ " " +r.getLastName()));
//	}
}
