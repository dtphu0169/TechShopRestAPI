package com.example.techshoprestapi.service;

import com.example.techshoprestapi.model.Bill;
import com.example.techshoprestapi.model.Bill_detail;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public interface BillService {
    List<Bill> getAllBill();

    Set<Bill_detail> getIteminBill(int id);
}
