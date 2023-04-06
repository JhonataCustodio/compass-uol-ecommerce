package br.com.compassuol.pb.mspayment.controller;

import br.com.compassuol.pb.mspayment.domain.dto.PaymentDtoRequest;
import br.com.compassuol.pb.mspayment.domain.dto.PaymentDtoResponse;
import br.com.compassuol.pb.mspayment.domain.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @PostMapping("/payment")
    public ResponseEntity<PaymentDtoResponse> save(@RequestBody PaymentDtoRequest request){
        PaymentDtoResponse paymentDtoResponse = paymentService.save(request);
        return ResponseEntity.ok(paymentDtoResponse);
    }
}
