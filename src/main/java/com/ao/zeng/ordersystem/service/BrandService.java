package com.ao.zeng.ordersystem.service;

import com.ao.zeng.ordersystem.model.BrandEntity;
import com.ao.zeng.ordersystem.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author aozeng
 */
@Service
public class BrandService {

    private BrandRepository brandRepository;

    @Autowired
    public BrandService(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    public List<BrandEntity> findAllBrands() {
        return this.brandRepository.findAll();
    }
}
