package com.ao.zeng.ordersystem.service;

import com.ao.zeng.ordersystem.model.ItemEntity;
import com.ao.zeng.ordersystem.repository.ItemRepository;
import com.ao.zeng.ordersystem.request.ItemCreationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ItemService {

    private ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<ItemEntity> getAllItems() {
        return this.itemRepository.findAll();
    }

    public String insertOrUpdateItem(ItemCreationRequest itemCreationRequest) {
        try {
            this.itemRepository.save(itemCreationRequest.toItemEntity());
            return "insert or updated successfully.";
        } catch (Exception e) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, e.getMessage()
            );
        }
    }
}
