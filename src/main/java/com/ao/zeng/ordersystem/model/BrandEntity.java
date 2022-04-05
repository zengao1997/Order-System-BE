package com.ao.zeng.ordersystem.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author aozeng
 */
@Entity
@Data
@Table(name = "brand")
@NoArgsConstructor
@Where(clause = "deleted = 0")
public class BrandEntity implements Serializable {
    private static final long serialVersionUID = 5040400606711216557L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", insertable = false, nullable = false)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "created_at", nullable = false, updatable = false)
    @JsonIgnore
    private Timestamp createdAt;

    @Column(name = "updated_at", nullable = false)
    @JsonIgnore
    private Timestamp updatedAt;

    @Column(name = "deleted", nullable = false, columnDefinition = "TINYINT")
    private Integer deleted;

}

