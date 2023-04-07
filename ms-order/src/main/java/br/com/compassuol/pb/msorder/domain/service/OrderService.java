package br.com.compassuol.pb.msorder.domain.service;

import br.com.compassuol.pb.msorder.domain.dto.request.OrderDtoRequest;
import br.com.compassuol.pb.msorder.domain.dto.response.OrderDtoResponse;
import br.com.compassuol.pb.msorder.domain.entity.Items;
import br.com.compassuol.pb.msorder.domain.entity.Order;
import br.com.compassuol.pb.msorder.domain.enums.OrderStatus;
import br.com.compassuol.pb.msorder.domain.enums.PaymentStatus;
import br.com.compassuol.pb.msorder.domain.repository.ItemsRepository;
import br.com.compassuol.pb.msorder.domain.repository.OrderRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class OrderService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private ItemsRepository itemsRepository;
    public OrderDtoResponse save(OrderDtoRequest request){
        Optional<Items> items = itemsRepository.findById(request.getItems().getId());
        if(items.isEmpty()){
            items = Optional.empty();
        }
        List<Items> itemsList = items.map(Collections::singletonList)
                .orElse(Collections.emptyList());
        Order order = new Order();
        order.setCpf(request.getCpf());
        order.setItems(itemsList);
        order.setAmount(request.getAmount());
        order.setOrderStatus(OrderStatus.valueOf(request.getOrderStatus()));
        order.setPaymentStatus(PaymentStatus.valueOf(request.getPaymentStatus()));
        orderRepository.save(order);
        OrderDtoResponse orderDtoResponse = modelMapper.map(order, OrderDtoResponse.class);
        return orderDtoResponse;
    }
    public List<OrderDtoResponse> getAll(){
        List<Order> orders = orderRepository.findAll();
        List<OrderDtoResponse> orderDtoResponses = orders.stream()
                .map(order -> modelMapper.map(order, OrderDtoResponse.class)).collect(Collectors.toList());
        return orderDtoResponses;
    }
    public List<OrderDtoResponse> getByCpf(String cpf){
        List<Order> orders = orderRepository.searchByCpf(cpf);
        List<OrderDtoResponse> orderDtoResponses = orders.stream()
                .map(order -> modelMapper.map(order, OrderDtoResponse.class)).collect(Collectors.toList());
        return orderDtoResponses;
    }
    public List<OrderDtoResponse> getByAmount(){
        List<Order> orders = orderRepository.findAllByOrderByAmountAsc();
        List<OrderDtoResponse> orderDtoResponses = orders.stream()
                .map(order -> modelMapper.map(order, OrderDtoResponse.class)).collect(Collectors.toList());
        return orderDtoResponses;
    }
}
