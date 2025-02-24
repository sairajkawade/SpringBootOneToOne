package com.example.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Serializable>{

	public Transaction findById(Integer id);
}
