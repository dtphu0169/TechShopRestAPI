package com.example.techshoprestapi.repository;

import com.example.techshoprestapi.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
public interface AccountRepository extends JpaRepository<Account,Integer> {

    @Query("select a.email from Account a where a.id = :id")
    String getEmailbyId(int id);

    @Query("select Account from Account a where a.userName = :userName")
    Optional<Account> getbyUsername(String userName);
}
