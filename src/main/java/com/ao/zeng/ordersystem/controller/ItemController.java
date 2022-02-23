package com.ao.zeng.ordersystem.controller;

import com.ao.zeng.ordersystem.model.ItemEntity;
import com.ao.zeng.ordersystem.repository.ItemRepository;
import com.ao.zeng.ordersystem.request.ItemCreationRequest;
import com.ao.zeng.ordersystem.service.ItemService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
        return this.itemService.getAllItems();
    }

    @PostMapping("")
    public String saveItem(@ApiParam(value="item meta to save", required = true)
                               @Valid @RequestBody ItemCreationRequest itemCreationRequest) {
        return this.itemService.insertOrUpdateItem(itemCreationRequest);
    }

}
