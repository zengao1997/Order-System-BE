package com.ao.zeng.ordersystem.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "item")
@NoArgsConstructor
@Where(clause = "deleted = 0")
public class ItemEntity implements Serializable {
    private static final long serialVersionUID = -6080917794541325111L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", insertable = false, nullable = false)
    private Integer id;

    @Column(name="category")
    private Integer category;

    @Column(name="name")
    private String name;

    @Column(name="subtitle")
    private String subtitle;

    @Column(name="brand")
    private Integer brand;

    @Column(name="introduction")
    private String introduction;

    @Column(name="item_number")
    private String itemNumber;

    @Column(name="price")
    private Long price;

    @Column(name="market_price")
    private Long marketPrice;

    @Column(name="inventory")
    private Long inventory;


    @Column(name="unit")
    private String unit;

    @Column(name="weight")
    private Integer weight;

    @Column(name="sort")
    private Integer sort;

    @Column(name="detail")
    private String detail;

    @Column(name="created_at", nullable = false, updatable = false)
    @JsonIgnore
    private Timestamp createdAt;

    @Column(name="updated_at", nullable = false)
    @JsonIgnore
    private Timestamp updatedAt;

    @Column(name="deleted", nullable = false, columnDefinition = "TINYINT")
    private Integer deleted;

    public ItemEntity(Integer id, Integer category, String name, String subtitle, Integer brand, String introduction,
                      String itemNumber, Long price, Long marketPrice, Long inventory, String unit, Integer weight, Integer sort,
                      String detail, Integer deleted) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.subtitle = subtitle;
        this.brand = brand;
        this.introduction = introduction;
        this.itemNumber = itemNumber;
        this.price = price;
        this.marketPrice = marketPrice;
        this.inventory = inventory;
        this.unit = unit;
        this.weight = weight;
        this.sort = sort;
        this.detail = detail;
        this.deleted = deleted;
    }
}
