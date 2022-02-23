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
@Table(name = "category")
@NoArgsConstructor
@Where(clause = "deleted = 0")
public class CategoryEntity implements Serializable {
    private static final long serialVersionUID = -8083692919874407697L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", insertable = false, nullable = false)
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name = "parent_id")
    private Integer parentId;

    @Column(name="created_at", nullable = false, updatable = false)
    @JsonIgnore
    private Timestamp createdAt;

    @Column(name="updated_at", nullable = false)
    @JsonIgnore
    private Timestamp updatedAt;

    @Column(name="deleted", nullable = false, columnDefinition = "TINYINT")
    private Integer deleted;

}
