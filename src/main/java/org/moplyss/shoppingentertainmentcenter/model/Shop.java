package org.moplyss.shoppingentertainmentcenter.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "shop")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Shop {
    @Id
    private Long id;
    private String name;
    private String description;
    private String location;
    private String category;
}
