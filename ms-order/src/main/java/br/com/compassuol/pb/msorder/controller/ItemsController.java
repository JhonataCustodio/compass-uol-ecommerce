package br.com.compassuol.pb.msorder.controller;

import br.com.compassuol.pb.msorder.domain.dto.request.ItemsDtoRequest;
import br.com.compassuol.pb.msorder.domain.dto.response.ItemsDtoResponse;
import br.com.compassuol.pb.msorder.domain.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemsController {
    @Autowired
    private ItemsService itemsService;
    @PostMapping("/items")
    public ResponseEntity<ItemsDtoResponse> save(@RequestBody ItemsDtoRequest request){
        ItemsDtoResponse itemsDtoResponse = itemsService.save(request);
        return  ResponseEntity.ok(itemsDtoResponse);
    }
}
