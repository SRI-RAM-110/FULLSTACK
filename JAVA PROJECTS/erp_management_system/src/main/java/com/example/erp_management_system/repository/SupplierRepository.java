package com.example.erp_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.erp_management_system.entity.Supplier;

public interface SupplierRepository
                extends JpaRepository<Supplier, Long> {
}
