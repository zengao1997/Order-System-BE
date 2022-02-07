package com.ao.zeng.ordersystem.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "item")
@NoArgsConstructor
public class ItemEntity implements Serializable {
    private static final long serialVersionUID = -6080917794541325111L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", insertable = false, nullable = false)
    @JsonIgnore
    private Integer id;

    @Column(name="category")
    private Integer category;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;

    @Column(name="weight")
    private Double weight;

    @Column(name="market_price")
    private Double marketPrice;

    @Column(name="sell_price")
    private Double sellPrice;

    @Column(name="cost")
    private Double cost;

    @Column(name="inventory")
    private Integer inventory;

    @Column(name="inventory_alert")
    private Integer inventoryAlert;

    @Column(name="label")
    private String label;

    @Column(name="image_url")
    private String imageUrl;

    @Column(name="created_at", nullable = false, updatable = false)
    @JsonIgnore
    private Timestamp createdAt;

    @Column(name="updated_at", nullable = false)
    @JsonIgnore
    private Timestamp updatedAt;

    public ItemEntity(Integer category, String name, String description, Double weight, Double marketPrice, Double sellPrice, Double cost, Integer inventory, Integer inventoryAlert, String label, String imageUrl) {
        this.category = category;
        this.name = name;
        this.description = description;
        this.weight = weight;
        this.marketPrice = marketPrice;
        this.sellPrice = sellPrice;
        this.cost = cost;
        this.inventory = inventory;
        this.inventoryAlert = inventoryAlert;
        this.label = label;
        this.imageUrl = imageUrl;
    }
}
