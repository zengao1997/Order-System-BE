package com.ao.zeng.ordersystem.repository;

import com.ao.zeng.ordersystem.model.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<ItemEntity, Integer> {

    List<ItemEntity> findAllByOrderBySortDesc();
}
