package br.com.compassuol.pb.msorder.domain.dto.request;

import br.com.compassuol.pb.msorder.domain.entity.Items;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDtoRequest {
    private String cpf;
    private Items items;
    private Double amount;
    private String orderStatus;
    private String paymentStatus;
}
