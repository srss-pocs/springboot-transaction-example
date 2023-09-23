package com.example.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa.entity.PassengerInfo;

public interface PassengerInfoRepository extends JpaRepository<PassengerInfo,Long> {
}
