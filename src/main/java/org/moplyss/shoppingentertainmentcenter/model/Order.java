package org.moplyss.shoppingentertainmentcenter.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "order")
public class Order {
    @Id
    private Long id;
    private String creationDate;
    private String status;
    @ManyToOne
    private User user;
    @OneToMany
    private List<Product> products;
}
