package br.com.compassuol.pb.msorder.domain.service;

import br.com.compassuol.pb.msorder.domain.dto.request.ItemsDtoRequest;
import br.com.compassuol.pb.msorder.domain.dto.response.ItemsDtoResponse;
import br.com.compassuol.pb.msorder.domain.entity.Items;
import br.com.compassuol.pb.msorder.domain.repository.ItemsRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private ItemsRepository itemsRepository;
    public ItemsDtoResponse save(ItemsDtoRequest request){
        Items items = modelMapper.map(request, Items.class);
        itemsRepository.save(items);
        ItemsDtoResponse itemsDtoResponse = modelMapper.map(items, ItemsDtoResponse.class);
        return  itemsDtoResponse;
    }

}
