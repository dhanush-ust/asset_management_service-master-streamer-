package com.demo.asset_management_service.repository;

import com.demo.asset_management_service.model.Allocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetRepo extends JpaRepository<Allocation,Long> {
}
