package com.example.demodevicefarm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demodevicefarm.domain.otherdevices;


public interface otherdevicesRepo  extends JpaRepository<otherdevices,Integer>,CrudRepository<otherdevices,Integer> {

	@Query("Select Count(client_deviceid)from otherdevices")
	int getotherdevicesCount();
	
	@Query("Select Count(DISTINCT Type )from mobile  ")
	int getotherdevicescounttype();
	
	@Query("SELECT SUM(CASE WHEN status = 'Active' THEN 1 ELSE 0 END) AS Active FROM mobile")
	int get_types_sum_otherdevice();
	
	@Query("SELECT SUM(CASE WHEN status = 'Inactive' THEN 1 ELSE 0 END) AS Inactive FROM mobile")
	int get_inactive_sum_otherdevices();
	
	@Query("SELECT SUM(CASE WHEN status = 'Damaged' THEN 1 ELSE 0 END) AS Damaged FROM mobile")
	int get_damaged_sum_otherdevices();

	@Query(value="SELECT client_deviceid FROM otherdevices ",nativeQuery=true)
	List<Integer> get_otherdevices_id();
	
}
