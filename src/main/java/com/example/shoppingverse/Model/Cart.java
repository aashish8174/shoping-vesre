package com.example.shoppingverse.Model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name="cart")

public class Cart {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    int cartId;
    int numberOfItems;
    int totalPrice;

    @OneToOne
    @JoinColumn
    Customer customer;

    @OneToMany(mappedBy = "cart",cascade = CascadeType.ALL)
    List<Item> itemList = new ArrayList<>();
}
