package com.rci.available.units.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rci.available.units.entity.AvailableUnitsEntity;

@Repository
public interface AvailableUnitsRepository extends JpaRepository<AvailableUnitsEntity, Long> {
	
	@Query("SELECT v FROM AvailableUnitsEntity v WHERE v.resortCode=:resortCode ")
	List<AvailableUnitsEntity> findByResortCode(String resortCode);
	
}