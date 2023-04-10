package br.com.compassuol.pb.msorder.domain.dto.request;

import br.com.compassuol.pb.msorder.domain.entity.Items;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDtoRequest {
    @NotBlank
    private String cpf;
    private Items items;
    @NotNull
    private Double amount;
    @NotBlank
    private String orderStatus;
    @NotBlank
    private String paymentStatus;
}
