package br.com.compassuol.pb.msorder.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<OrderRepository, Integer> {
}
