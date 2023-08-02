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
@Table(name="seller")
@Builder
@Setter

public class Seller {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    int sellerId;

    String name;
    @Column(unique = true,nullable = false)
    String emailId;
    @Column(unique = true,nullable = false)
    String panNo;
    int mobile;

    @OneToMany(mappedBy = "seller",cascade = CascadeType.ALL)
    List<Product> productList = new ArrayList<>();

}
