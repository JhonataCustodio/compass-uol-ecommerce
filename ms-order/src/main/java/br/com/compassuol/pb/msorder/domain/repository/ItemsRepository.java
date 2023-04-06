package br.com.compassuol.pb.msorder.domain.repository;

import br.com.compassuol.pb.msorder.domain.entity.Items;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemsRepository extends MongoRepository<Items, ObjectId> {
}
