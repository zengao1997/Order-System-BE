package com.ao.zeng.ordersystem.request;

import com.ao.zeng.ordersystem.model.ItemEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel
public class ItemCreationRequest implements Serializable {
    private static final long serialVersionUID = 8505901561194395818L;

    @ApiModelProperty(value = "id")
    private Integer id;

    @ApiModelProperty(value = "category name", required = true)
    @NotEmpty(message="Item needs to have a category.")
    private List<Integer> category;

    @ApiModelProperty(value = "name", required = true)
    @NotBlank(message="Item needs to have a name.")
    private String name;

    @ApiModelProperty(value = "subtitle", required = true)
    @NotBlank(message="Item needs to have a subtitle.")
    private String subtitle;

    @ApiModelProperty(value = "brand", required = true)
    @NotEmpty(message="Item needs to have a brand.")
    private Integer brand;

    @Column(name="introduction")
    private String introduction;

    @ApiModelProperty(value = "item_number")
    private String itemNumber;

    @ApiModelProperty(value = "price")
    private Long price;

    @ApiModelProperty(value = "market_price")
    private Long marketPrice;

    @ApiModelProperty(value = "inventory")
    private Long inventory;

    @ApiModelProperty(value = "unit")
    private String unit;

    @ApiModelProperty(value = "weight")
    private Integer weight;

    @ApiModelProperty(value = "sort")
    private Integer sort;

    @ApiModelProperty(value = "detail")
    private String detail;

    @ApiModelProperty(value = "deleted")
    private Integer deleted;


    public ItemEntity toItemEntity() {
        return new ItemEntity(this.id, this.category.get(1), this.name, this.subtitle, this.brand, this.introduction,
                this.itemNumber, this.price, this.marketPrice, this.inventory, this.unit, this.weight, this.sort, this.detail,
                this.deleted);
    }
}
