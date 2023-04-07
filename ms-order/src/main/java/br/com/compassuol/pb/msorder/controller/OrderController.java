package br.com.compassuol.pb.msorder.controller;

import br.com.compassuol.pb.msorder.domain.dto.request.OrderDtoRequest;
import br.com.compassuol.pb.msorder.domain.dto.response.OrderDtoResponse;
import br.com.compassuol.pb.msorder.domain.service.OrderService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @PostMapping("/order")
    public ResponseEntity<OrderDtoResponse> save(@RequestBody OrderDtoRequest request){
        OrderDtoResponse orderDtoResponse = orderService.save(request);
        return ResponseEntity.ok(orderDtoResponse);
    }
    @GetMapping("/api/order")
    public ResponseEntity<List<OrderDtoResponse>> getAll(){
        List<OrderDtoResponse> orderDtoResponses = orderService.getAll();
        return ResponseEntity.ok(orderDtoResponses);
    }
    @GetMapping("/api/order/{cpf}")
    public ResponseEntity<List<OrderDtoResponse>> getByCpf(@PathVariable String cpf){
        List<OrderDtoResponse> orderDtoResponses = orderService.getByCpf(cpf);
        return ResponseEntity.ok(orderDtoResponses);
    }
    @GetMapping("/api/order/amount")
    public ResponseEntity<List<OrderDtoResponse>> getByAmount(){
        List<OrderDtoResponse> orderDtoResponses = orderService.getByAmount();
        return ResponseEntity.ok(orderDtoResponses);
    }
    @GetMapping("/api/order/id/{id}")
    public ResponseEntity<OrderDtoResponse> getById(@PathVariable ObjectId id){
        OrderDtoResponse orderDtoResponse = orderService.getById(id);
        return ResponseEntity.ok(orderDtoResponse);
    }
    @DeleteMapping("/api/order/{id}")
    public ResponseEntity<OrderDtoResponse> delete(@PathVariable ObjectId id){
        OrderDtoResponse orderDtoResponse = orderService.delete(id);
        return ResponseEntity.ok(orderDtoResponse);
    }
    @PutMapping("/api/order/{id}")
    public ResponseEntity<OrderDtoResponse> update(@PathVariable ObjectId id, @RequestBody OrderDtoRequest request){
        OrderDtoResponse orderDtoResponse = orderService.update(id, request);
        return ResponseEntity.ok(orderDtoResponse);
    }
}
