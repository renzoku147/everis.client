package com.java.everis.client.service.impl;

import com.java.everis.client.entity.TypeCostumer;
import com.java.everis.client.repository.TypeCustomerRepository;
import com.java.everis.client.service.TypeCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Service
public class TypeCustomerServiceImpl implements TypeCustomerService{

    @Autowired
    TypeCustomerRepository typeCustomerRepository;

    @Override
    public Mono<TypeCostumer> create(TypeCostumer typeCostumer) {
        return typeCustomerRepository.save(typeCostumer);
    }

    @Override
    public Flux<TypeCostumer> findAll() {
        return typeCustomerRepository.findAll();
    }

    @Override
    public Mono<TypeCostumer> findById(String id) {
        return null;
    }

    @Override
    public Mono<TypeCostumer> update(TypeCostumer typeCostumer) {
        return null;
    }

    @Override
    public Mono<Boolean> delete(String id) {
        return null;
    }
}
