package br.com.compassuol.pb.msorder.domain.repository;

import br.com.compassuol.pb.msorder.domain.entity.Order;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OrderRepository extends MongoRepository<Order, ObjectId> {
    List<Order> searchByCpf(String cpf);
}
