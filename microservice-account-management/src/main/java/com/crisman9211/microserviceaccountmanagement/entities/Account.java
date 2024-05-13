package com.crisman9211.microserviceaccountmanagement.entities;

import java.util.Date;

import com.crisman9211.microserviceaccountmanagement.domain.AccountType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "account")
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Enumerated(value = EnumType.STRING)
    @Column(name = "account_type")
    private AccountType accountType;

    @Column(name = "account_number")
    private String accountNumber;

    private Float balance;

    @Column(name = "debit_card_number")
    private String debitCardNumber;

    @Column(name = "opening_date")
    private Date openingDate;
    
    @Column(name = "user_id")
    private Long userId;
}
