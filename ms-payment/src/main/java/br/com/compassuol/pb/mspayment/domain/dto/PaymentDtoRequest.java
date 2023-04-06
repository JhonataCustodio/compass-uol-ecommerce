package br.com.compassuol.pb.mspayment.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDtoRequest {
    private Double totalOrder;
    private String paymentStatus;
}
