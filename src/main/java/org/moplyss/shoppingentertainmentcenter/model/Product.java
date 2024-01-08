package org.moplyss.shoppingentertainmentcenter.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "product")
public class Product {
    @Id
    private Long id;
    private String name;
    private String description;
    private double price;
    private boolean availability;
    private String image;
    @ManyToOne()//TODO: add binds(connect)
    private Shop shop;
}
