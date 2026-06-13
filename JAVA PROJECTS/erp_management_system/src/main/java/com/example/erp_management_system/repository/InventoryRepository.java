package com.example.erp_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.erp_management_system.entity.Inventory;

public interface InventoryRepository
                extends JpaRepository<Inventory, Long> {
}
