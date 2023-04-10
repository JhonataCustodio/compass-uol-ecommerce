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
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


@Document(collection = "order")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    private ObjectId id;
    @Field("cpf")
    @NotEmpty
    private String cpf;
    private List<Items> items;
    @NotEmpty
    @NotNull
    private Double amount;
    @Field(targetType = FieldType.STRING)
    @NotEmpty
    private OrderStatus orderStatus;
    @Field(targetType = FieldType.STRING)
    @NotEmpty
    private PaymentStatus paymentStatus;

}

