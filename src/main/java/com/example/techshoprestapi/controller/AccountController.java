package com.example.techshoprestapi.controller;

import com.example.techshoprestapi.model.Account;
import com.example.techshoprestapi.repository.AccountRepository;
import com.example.techshoprestapi.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userapi")
public class AccountController {
    @Autowired
    AccountService accountService;

    @GetMapping("/users")
    public ResponseEntity<List<Account>> getAll(){
        try{
            List<Account> list = accountService.getAllAccount();
            if (list.isEmpty()){
                return new ResponseEntity<>(HttpStatus.NO_CONTENT) ;
            }
            return new ResponseEntity<List<Account>>(list, HttpStatus.OK) ;
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR) ;
        }
    }

    @GetMapping("/email/{id}")
    public ResponseEntity<String> getemail(@PathVariable int id){
        try{
            String email = accountService.getEmailbyId(id);
            if (email == null || email == ""){
                return new ResponseEntity<>(HttpStatus.NO_CONTENT) ;
            }
            return new ResponseEntity<String>(email, HttpStatus.OK) ;
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR) ;
        }
    }
}
