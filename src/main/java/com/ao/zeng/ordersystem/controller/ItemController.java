package com.ao.zeng.ordersystem.controller;

import com.ao.zeng.ordersystem.model.ItemEntity;
import com.ao.zeng.ordersystem.request.ItemCreationRequest;
import com.ao.zeng.ordersystem.service.ItemService;
import io.swagger.annotations.ApiParam;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author aozeng
 */
@RestController
@RequestMapping("/item")
@CrossOrigin
public class ItemController {

    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping
    public List<ItemEntity> getAllItems() {
        return this.itemService.getAllItems();
    }

    @PostMapping
    public ResponseEntity<?> saveItem(@ApiParam(value = "item meta to save", required = true)
                                      @Valid @RequestBody ItemCreationRequest itemEntity) {
        return this.itemService.insertOrUpdateItem(itemEntity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteItem(@PathVariable Integer id) {
        return this.itemService.deleteItem(id);
    }
}
