package br.com.compassuol.pb.msorder.domain.service;

import br.com.compassuol.pb.msorder.domain.dto.request.OrderDtoRequest;
import br.com.compassuol.pb.msorder.domain.dto.response.OrderDtoResponse;
import br.com.compassuol.pb.msorder.domain.entity.Order;
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
    public OrderDtoResponse save(OrderDtoRequest request){
        Order order = modelMapper.map(request, Order.class);
        orderRepository.save(order);
        OrderDtoResponse orderDtoResponse = modelMapper.map(order, OrderDtoResponse.class);
        return orderDtoResponse;
    }
}
