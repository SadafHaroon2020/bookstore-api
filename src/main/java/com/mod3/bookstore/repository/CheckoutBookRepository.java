package com.mod3.bookstore.repository;

import com.mod3.bookstore.entity.CheckoutBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CheckoutBookRepository extends JpaRepository<CheckoutBook, UUID>, JpaSpecificationExecutor<CheckoutBook> {

}