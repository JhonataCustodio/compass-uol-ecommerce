package br.com.compassuol.pb.msorder.domain.entity;

import br.com.compassuol.pb.msorder.domain.enums.OrderStatus;
import br.com.compassuol.pb.msorder.domain.enums.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection = "order")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    private ObjectId id;
    @Field("cpf")
    private String cpf;
    private Items items;
    private Double amount;
    // Colocar uma anotação que faz o mesmo que o @Enumerated do JPA
    private OrderStatus orderStatus;
    // Colocar uma anotação que faz o mesmo que o @Enumerated do JPA
    private PaymentStatus paymentStatus;

}

