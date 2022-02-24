package com.ao.zeng.ordersystem.controller;

import com.ao.zeng.ordersystem.model.ItemEntity;
import com.ao.zeng.ordersystem.request.ItemCreationRequest;
import com.ao.zeng.ordersystem.service.ItemService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/item/")
@CrossOrigin
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

    @PostMapping(value = "")
    public ResponseEntity<?> saveItem(@ApiParam(value="item meta to save", required = true)
                               @Valid @RequestBody ItemCreationRequest itemEntity) {
        return this.itemService.insertOrUpdateItem(itemEntity);
    }
}
