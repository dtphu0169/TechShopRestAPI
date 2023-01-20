package com.example.techshoprestapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;


@Getter
@Setter
@Entity
@Component
@NoArgsConstructor
@AllArgsConstructor
public class Bill_detail {

    @Id
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int bill_id;
    private int product_id;
    private int quantity;
    private int unit_price;
    //    @Column(name = "bill_id")
//    @ManyToOne
//    private Bill bill;


}
