package br.com.compassuol.pb.msorder.domain.service;

import br.com.compassuol.pb.msorder.domain.repository.OrderRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private OrderRepository orderRepository;

}
