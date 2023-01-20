package com.example.techshoprestapi.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Component
@NoArgsConstructor
@AllArgsConstructor
public class Bill {


    @Id
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String customerName;
    private Date datecreate;
    private int price;
    private int shipprice;
    private String address;
    private String phone;
    private boolean paid;
    private String status;
    private String note;

//    @OneToMany(mappedBy = "bill", cascade = CascadeType.ALL)
//    private Set<Bill_detail> items =new HashSet<>();


}
