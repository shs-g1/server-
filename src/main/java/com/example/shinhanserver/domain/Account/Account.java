package com.example.shinhanserver.domain.Account;

import javax.persistence.*;

import com.example.shinhanserver.domain.Product;
import com.example.shinhanserver.transaction.Transaction;
import com.example.shinhanserver.domain.client.Client;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@NoArgsConstructor(access= AccessLevel.PROTECTED)
@Table(name = "account")
public class Account {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "account_id")
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "client_id")
  private Client client;

  @OneToMany(mappedBy = "account", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Transaction> TransactionList = new ArrayList<>();

  @OneToMany(mappedBy = "account", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Product> ProductList = new ArrayList<>();

  private String accountNumber;

  private int totalAssets;

  private int withdrawalAmount;

}