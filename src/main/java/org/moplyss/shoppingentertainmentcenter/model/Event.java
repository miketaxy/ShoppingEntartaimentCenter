package org.moplyss.shoppingentertainmentcenter.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "event")
class Event {
    @Id
    Long id;
    String name;
    String description;
    Date schedule;
}
