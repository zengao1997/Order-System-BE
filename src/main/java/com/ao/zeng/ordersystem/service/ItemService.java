package com.ao.zeng.ordersystem.service;

import com.ao.zeng.ordersystem.model.ItemEntity;
import com.ao.zeng.ordersystem.repository.ItemRepository;
import com.ao.zeng.ordersystem.request.ItemCreationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class ItemService {

    private ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<ItemEntity> getAllItems() {
        return this.itemRepository.findAllByOrderBySortDesc();
    }

    @Transactional(rollbackFor = RuntimeException.class)
    public ResponseEntity<?> insertOrUpdateItem(ItemCreationRequest itemCreationRequest) {
        try {
            this.itemRepository.save(itemCreationRequest.toItemEntity());
            return ResponseEntity.ok("create item successfully.");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getCause());
        }
    }
}
