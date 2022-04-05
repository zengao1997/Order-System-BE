package com.ao.zeng.ordersystem.repository;

import com.ao.zeng.ordersystem.model.BrandEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author aozeng
 */
@Repository
public interface BrandRepository extends JpaRepository<BrandEntity, Integer> {
}
