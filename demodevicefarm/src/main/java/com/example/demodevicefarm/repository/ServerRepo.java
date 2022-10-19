package com.example.demodevicefarm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demodevicefarm.domain.server;

public interface ServerRepo  extends JpaRepository<server,Integer>,CrudRepository<server,Integer>{

	@Query("Select Count(client_deviceid)from server")
	int getserverCount();
	
	@Query("Select Count(DISTINCT Type )from server  ")
	int getservercounttype();
	
	@Query("SELECT SUM(CASE WHEN status = 'Active' THEN 1 ELSE 0 END) AS Active FROM server")
	int get_types_sum_server();
	
	@Query("SELECT SUM(CASE WHEN status = 'Inactive' THEN 1 ELSE 0 END) AS Inactive FROM server")
	int get_inactive_sum_server();
	
	@Query("SELECT SUM(CASE WHEN status = 'Damaged' THEN 1 ELSE 0 END) AS Damaged FROM server")
	int get_damaged_sum_server();

	@Query(value="SELECT client_deviceid FROM server",nativeQuery=true)
	List<Integer> get_server_id();
	
	
	
}
