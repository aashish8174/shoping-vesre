package com.example.shoppingverse.Model;

import com.example.shoppingverse.Enum.CardType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name="card")
@Builder

public class Card {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    int cardId;

    @Column(unique = true)
    String  cardNumber;
    int ccv;
    Date cardExpiry;
    CardType cardType;

    @ManyToOne
    Customer customer;
}
