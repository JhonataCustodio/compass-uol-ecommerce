package br.com.compassuol.pb.mspayment.controller;

import br.com.compassuol.pb.mspayment.domain.dto.PaymentDtoRequest;
import br.com.compassuol.pb.mspayment.domain.dto.PaymentDtoResponse;
import br.com.compassuol.pb.mspayment.domain.service.PaymentService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @GetMapping("/api/payment")
    @RabbitListener(queues = "order")
    public ResponseEntity<List<PaymentDtoResponse>> getAll(){
        List<PaymentDtoResponse> paymentDtoResponse = paymentService.getAll();
        return ResponseEntity.ok(paymentDtoResponse);
    }
}
