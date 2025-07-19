package com.example.task5.Entity;

import com.example.task5.Enum.KitchenType;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.lang.NonNull;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NonNull
    String title;

    String description;

    @Enumerated(EnumType.STRING)
    @NonNull
    KitchenType kitchenType;

    @NonNull
    double averageBill;

    @NonNull
    BigDecimal rating;


}
