package com.example.techshoprestapi.repository;

import com.example.techshoprestapi.model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill,Integer> {
}
