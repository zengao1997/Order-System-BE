package com.ao.zeng.ordersystem.controller;

import com.ao.zeng.ordersystem.model.ItemEntity;
import com.ao.zeng.ordersystem.repository.ItemRepository;
import com.ao.zeng.ordersystem.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {

    private ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("")
    public List<ItemEntity> getAllItems() {
        return itemService.getAllItems();
    }

}
