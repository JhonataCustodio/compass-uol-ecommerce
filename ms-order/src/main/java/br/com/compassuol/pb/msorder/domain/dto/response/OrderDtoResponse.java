package br.com.compassuol.pb.msorder.domain.dto.response;

import br.com.compassuol.pb.msorder.domain.entity.Items;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;

import java.util.List;


@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDtoResponse {
    private ObjectId id;
    private String cpf;
    private List<Items> items;
    private Double amount;
    private String orderStatus;
    private String paymentStatus;
}
