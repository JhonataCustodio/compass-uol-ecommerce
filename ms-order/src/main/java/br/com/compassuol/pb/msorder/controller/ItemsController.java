package br.com.compassuol.pb.msorder.controller;

import br.com.compassuol.pb.msorder.domain.dto.request.ItemsDtoRequest;
import br.com.compassuol.pb.msorder.domain.dto.response.ItemsDtoResponse;
import br.com.compassuol.pb.msorder.domain.service.ItemsService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ItemsController {
    @Autowired
    private ItemsService itemsService;
    @PostMapping("/api/item")
    public ResponseEntity<ItemsDtoResponse> save(@RequestBody ItemsDtoRequest request){
        ItemsDtoResponse itemsDtoResponse = itemsService.save(request);
        return  ResponseEntity.ok(itemsDtoResponse);
    }
    @PutMapping("/api/order/{idOrder}/item/{idItem}")
    public ResponseEntity<ItemsDtoResponse> update(@PathVariable("idOrder") ObjectId idOrder, @PathVariable("idItem")
                       ObjectId idItem, @RequestBody ItemsDtoRequest request){
        ItemsDtoResponse itemsDtoResponse = itemsService.update(idOrder, idItem, request);
        return ResponseEntity.ok(itemsDtoResponse);
    }
}
