package com.example.techshoprestapi.service;

import com.example.techshoprestapi.model.Account;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface AccountService {
    List<Account> getAllAccount();

    String getEmailbyId(int id);
}
