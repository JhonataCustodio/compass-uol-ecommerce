package br.com.compassuol.pb.mspayment.domain.service;

import br.com.compassuol.pb.mspayment.domain.dto.PaymentDtoRequest;
import br.com.compassuol.pb.mspayment.domain.dto.PaymentDtoResponse;
import br.com.compassuol.pb.mspayment.domain.entity.Payment;
import br.com.compassuol.pb.mspayment.domain.repository.PaymentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private PaymentRepository paymentRepository;
    public PaymentDtoResponse save(PaymentDtoRequest request){
        Payment payment = modelMapper.map(request, Payment.class);
        paymentRepository.save(payment);
        PaymentDtoResponse paymentDtoResponse = modelMapper.map(payment, PaymentDtoResponse.class);
        return  paymentDtoResponse;
    }
}
