package com.ao.zeng.ordersystem.controller;

import com.ao.zeng.ordersystem.model.BrandEntity;
import com.ao.zeng.ordersystem.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author aozeng
 */
@RestController
@RequestMapping("/brand")
@CrossOrigin
public class BrandController {

    private final BrandService brandService;

    @Autowired
    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping
    public List<BrandEntity> getAllBrands() {
        return this.brandService.findAllBrands();
    }
}
