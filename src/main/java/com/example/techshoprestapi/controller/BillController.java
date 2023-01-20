package com.example.techshoprestapi.controller;

import com.example.techshoprestapi.model.Bill;
import com.example.techshoprestapi.model.Bill_detail;
import com.example.techshoprestapi.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/billapi")
public class BillController {
    @Autowired
    BillService billService;

    @GetMapping("/bills")
    public ResponseEntity<List<Bill>> getAll(){
        try{
            List<Bill> list = billService.getAllBill();
            if (list.isEmpty()){
                return new ResponseEntity<>(HttpStatus.NO_CONTENT) ;
            }
            return new ResponseEntity<List<Bill>>(list,HttpStatus.OK) ;
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR) ;
        }
    }

    @GetMapping("/billitems/{bill_id}")
    public ResponseEntity<Set<Bill_detail>> getIteminBill(@PathVariable int bill_id){
        try{
            Set<Bill_detail> list = billService.getIteminBill(bill_id);
            if (list.isEmpty()){
                return new ResponseEntity<>(HttpStatus.NO_CONTENT) ;
            }
            return new ResponseEntity<Set<Bill_detail>>(list,HttpStatus.OK) ;
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR) ;
        }
    }
}
