package com.example.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa.entity.PaymentInfo;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo,String> {
}
