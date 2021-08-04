package com.java.everis.client.repository;

import com.java.everis.client.entity.TypeCostumer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface TypeCustomerRepository extends ReactiveMongoRepository<TypeCostumer, String> {
}
