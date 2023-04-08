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
import org.springframework.data.mongodb.core.mapping.FieldType;

import javax.validation.constraints.NotBlank;
import java.util.List;


@Document(collection = "order")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    private ObjectId id;
    @Field("cpf")
    @NotBlank
    private String cpf;
    private List<Items> items;
    @NotBlank
    private Double amount;
    @Field(targetType = FieldType.STRING)
    @NotBlank
    private OrderStatus orderStatus;
    @Field(targetType = FieldType.STRING)
    @NotBlank
    private PaymentStatus paymentStatus;

}

