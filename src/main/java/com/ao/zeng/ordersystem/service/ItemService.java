package com.ao.zeng.ordersystem.service;

import com.ao.zeng.ordersystem.model.ItemEntity;
import com.ao.zeng.ordersystem.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    private ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<ItemEntity> getAllItems() {
        return itemRepository.findAll();
    }
}
