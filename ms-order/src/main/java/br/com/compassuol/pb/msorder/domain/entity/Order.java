package br.com.compassuol.pb.msorder.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection = "order")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    private Integer id;
    @Field("cpf")
    private String cpf;
    private Items items;
    private Double amount;
    private String orderStatus;
    private String paymentStatus;
    private Integer idPayment;

}

