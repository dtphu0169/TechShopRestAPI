package com.example.techshoprestapi.service;

import com.example.techshoprestapi.model.Account;
import com.example.techshoprestapi.model.UserDetailsImpl;
import com.example.techshoprestapi.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AccountServiceImpl implements AccountService, UserDetailsService {
    @Autowired
    AccountRepository accountRepository;

    @Override
    public List<Account> getAllAccount() {
        return accountRepository.findAll();
    }

    @Override
    public String getEmailbyId(int id) {
        return accountRepository.getEmailbyId(id);
    }


    public UserDetails getById(int id) {
        Account account = accountRepository.findById(id).get();
        if (account == null){
            throw new UsernameNotFoundException(id+"");
        }
        return new UserDetailsImpl(account);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = accountRepository.getbyUsername(username).get();
        if (account == null){
            throw new UsernameNotFoundException(username);
        }
        return new UserDetailsImpl(account);
    }


}
