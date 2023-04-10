package br.com.compassuol.pb.mspayment.domain.repository;

import br.com.compassuol.pb.mspayment.domain.entity.Payment;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentRepository extends MongoRepository<Payment, ObjectId> {
}
