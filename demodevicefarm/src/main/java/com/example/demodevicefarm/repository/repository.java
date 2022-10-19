package com.example.demodevicefarm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demodevicefarm.domain.mobile;


public interface repository extends JpaRepository<mobile,Integer>,CrudRepository<mobile, Integer> {
	
	@Query("Select Count(client_deviceid)from mobile")
	int getmobileCount();
	
	
	

	@Query("Select Count(DISTINCT Type )from mobile  ")
	int getmobilecounttype();
	
	@Query("SELECT SUM(CASE WHEN status = 'Active' THEN 1 ELSE 0 END) AS Active FROM mobile")
	int get_types_sum();
	
	@Query("SELECT SUM(CASE WHEN status = 'Inactive' THEN 1 ELSE 0 END) AS Inactive FROM mobile")
	int get_inactive_sum();
	
	@Query("SELECT SUM(CASE WHEN status = 'Damaged' THEN 1 ELSE 0 END) AS Damaged FROM mobile")
	int get_damaged_sum();
	
	
@Query(value="SELECT client_deviceid FROM mobile",nativeQuery=true)
List<Integer> get_id();
	
	}
