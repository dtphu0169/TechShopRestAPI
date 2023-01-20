package com.example.techshoprestapi.service;

import com.example.techshoprestapi.model.Bill;
import com.example.techshoprestapi.model.Bill_detail;
import com.example.techshoprestapi.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
public class BillServiceImpl implements BillService{
    @Autowired
    BillRepository billRepository;

    @Override
    public List<Bill> getAllBill() {
        return billRepository.findAll();
    }

    @Override
    public Set<Bill_detail> getIteminBill(int id) {
        Bill bill = billRepository.findById(id).get();
        if (bill != null){
//            return bill.getItems();
        }
        return null;
    }
}
