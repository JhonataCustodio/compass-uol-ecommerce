package br.com.compassuol.pb.msorder.domain.service;

import br.com.compassuol.pb.msorder.domain.dto.request.ItemsDtoRequest;
import br.com.compassuol.pb.msorder.domain.dto.response.ItemsDtoResponse;
import br.com.compassuol.pb.msorder.domain.entity.Items;
import br.com.compassuol.pb.msorder.domain.entity.Order;
import br.com.compassuol.pb.msorder.domain.repository.ItemsRepository;
import br.com.compassuol.pb.msorder.domain.repository.OrderRepository;
import org.bson.types.ObjectId;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private ItemsRepository itemsRepository;
    @Autowired
    private OrderRepository orderRepository;
    public ItemsDtoResponse save(ItemsDtoRequest request){
        Items items = modelMapper.map(request, Items.class);
        itemsRepository.save(items);
        ItemsDtoResponse itemsDtoResponse = modelMapper.map(items, ItemsDtoResponse.class);
        return  itemsDtoResponse;
    }
    public ItemsDtoResponse update(ObjectId idOrder, ObjectId idItem , ItemsDtoRequest request){
        Order order = orderRepository.findById(idOrder)
                .orElseThrow(()-> new RuntimeException("Order id not found"));
        Items items = order.getItems().stream()
                .filter(i -> i.getId().equals(idItem))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Item not found in order"));
        items.setName(request.getName());
        items.setDescription(request.getDescription());
        items.setCreationDate(request.getCreationDate());
        items.setExpirationDate(request.getExpirationDate());
        items.setAmount(request.getAmount());
        orderRepository.save(order);
        return modelMapper.map(items, ItemsDtoResponse.class);

    }

}
