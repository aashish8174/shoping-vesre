package com.example.shoppingverse.Model;

import com.example.shoppingverse.Enum.Gender;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.mail.SimpleMailMessage;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Table(name="customer")

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int customerId;
    String name;
    @Column(unique = true)
    String emailId;
    @Column(unique = true)
    int mobile;
    Gender gender;
    String address;

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    List<OrderEntity> orderEntityList = new ArrayList<>();

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    List<Card> cardList;

    @OneToOne
    Cart cart;

}
