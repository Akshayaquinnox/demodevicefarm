package com.example.demodevicefarm.service;


import java.util.ArrayList;


import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demodevicefarm.InputRequest.Inputrequest;
import com.example.demodevicefarm.domain.count;
import com.example.demodevicefarm.domain.mobile;
import com.example.demodevicefarm.domain.mobile_audit;
import com.example.demodevicefarm.domain.otherdevices;
import com.example.demodevicefarm.domain.server;
import com.example.demodevicefarm.domain.users;
import com.example.demodevicefarm.repository.ServerRepo;
import com.example.demodevicefarm.repository.mobile_auditRepo;
import com.example.demodevicefarm.repository.otherdevicesRepo;
import com.example.demodevicefarm.repository.repository;
import com.example.demodevicefarm.repository.userRepo;

@Service
public class service {

	@Autowired
	private repository repo;
	
	@Autowired
	private ServerRepo srepo;
	
	@Autowired
	private otherdevicesRepo odrepo;

	@Autowired
	private mobile_auditRepo marepo;
	
	@Autowired
	private userRepo urepo;

	
	public String savemobile(Inputrequest<mobile> request)
	{
		

		String currentUser=request.getLoggedInUser();

		request.setTimezone(Calendar.getInstance().getTimeZone().getDisplayName());
		
		mobile m=request.getMobile();
		m.setCreateby(currentUser);
		repo.save(m);
		return "mobile saved successfully";
		
		
	}
	public String saveserver(Inputrequest<server> request)
	{
		

		String currentUser=request.getLoggedInUser();

		request.setTimezone(Calendar.getInstance().getTimeZone().getDisplayName());
		
		server s=request.getServer();
		s.setCreateby(currentUser);
		srepo.save(s);
		return "server saved successfully";
		
		
	}
	public String saveotherdevices(Inputrequest<otherdevices> request)
	{
		

		String currentUser=request.getLoggedInUser();

		request.setTimezone(Calendar.getInstance().getTimeZone().getDisplayName());
		
		otherdevices o=request.getOtherdevices();
		o.setCreateby(currentUser);
		odrepo.save(o);
		return "otherdevices saved successfully";
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String updatemobile(int id,Inputrequest<mobile> request){
		//mobile pm=repo.findById(id).get();
		
		System.out.println("hi");
		//String pl=pm.getLocation();
		//String ptype=pm.getType();
		
		

		
		//mobile_audit ma=new mobile_audit();
		mobile m=repo.findById(id).get();
		if(m!=null){
			
			mobile mu=request.getMobile();
			m.setModifiedby(request.getLoggedInUser());
			m.setLocation(mu.getLocation());
			m.setType(mu.getType());
			m.setManufacture(mu.getManufacture());
			m.setOs(mu.getOs());
			m.setDate(mu.getDate());
			m.setSerialno(mu.getSerialno());
			m.setStatus(mu.getStatus());
			m.setIPAdress(mu.getIPAdress());
			m.setPHno(mu.getPHno());
			m.setServer_connected(mu.getServer_connected());
			
			repo.save(m);
			/*if(pl!=m.getLocation()) {
				ma.setModified_field("location");
				marepo.save(ma);
			}
			else {
				
			}
			if(ptype==m.getType()) {
				
			}
			else {
				ma.setModified_field(","+"Type");
				marepo.save(ma);
			}
			*/
			
		}
		else{

			throw new RuntimeException("mobile not found with :"+id);

			}

		return "mobile updated successfully";
	}
	public String updateserver(int id,Inputrequest<server> request){
		server s=srepo.findById(id).get();
		if(s!=null){
			//request.setTimezone(Calendar.getInstance().getTimeZone().getDisplayName());
			
			
			server se=request.getServer();
			s.setModifiedby(request.getLoggedInUser());
			s.setLocation(se.getLocation());
			s.setType(se.getType());
			s.setManufacture(se.getManufacture());
			s.setOs(se.getOs());
			s.setDate(se.getDate());
			s.setSerialno(se.getSerialno());
			s.setStatus(se.getStatus());
			s.setIpadress(se.getIpadress());
			s.setCurrent_client(se.getCurrent_client());
			
			srepo.save(s);
			
		}
		else{

			throw new RuntimeException("server not found with :"+id);

			}
		
		return "server updated successfully";
	}

	
	public String updateotherdevices(int id,Inputrequest<otherdevices> request){
		otherdevices o=odrepo.findById(id).get();
		if(o!=null){

			
			otherdevices ot=request.getOtherdevices();
			o.setModifiedby(request.getLoggedInUser());
			o.setLocation(ot.getLocation());
			o.setType(ot.getType());
			o.setManufacture(ot.getManufacture());
			o.setOs(ot.getOs());
			o.setDate(ot.getDate());
			o.setSerialno(ot.getSerialno());
			o.setStatus(ot.getStatus());
			o.setClient(ot.getClient());
			o.setDeviceid(ot.getDeviceid());
			odrepo.save(o);
			
		}
		else{

			throw new RuntimeException("otherdevices not found with :"+id);

			}
		
		return "otherdevices updated successfully";
	}
	
	
	
	
	
	
	
	
	
	
	
	public List<mobile> demogetmobile() {
		
		return	repo.findAll();
		}
public List<server> demogetserver() {
		
		return	srepo.findAll();
		}
public List<otherdevices> demogetotherdevices() {
	
	return	odrepo.findAll();
	}

public List<mobile_audit> demogetauditlogs(int id) {
	mobile m=repo.findById(id).get();
	String a=m.getCreateby();
	String b=m.getModifiedby();
	Date c=m.getCreatedata();
	Date d=m.getLastmodifiedDate();
	List<mobile_audit> list = new ArrayList<mobile_audit>();
	mobile_audit mobile_audit =new mobile_audit();
	mobile_audit.setCreated_by(a);
	mobile_audit.setModified_by(b);
	mobile_audit.setCreateddate(c);
	mobile_audit.setLastmodified_date(d);
	list.add(mobile_audit);
	
	return list;
}
public List<mobile_audit> demogetserverlogs(int id) {
	server s=srepo.findById(id).get();
	String a=s.getCreateby();
	String b=s.getModifiedby();
	Date c=s.getCreatedata();
	Date d=s.getLastmodifiedDate();
	List<mobile_audit> list = new ArrayList<mobile_audit>();
	mobile_audit mobile_audit =new mobile_audit();
	mobile_audit.setCreated_by(a);
	mobile_audit.setModified_by(b);
	mobile_audit.setCreateddate(c);
	mobile_audit.setLastmodified_date(d);
	list.add(mobile_audit);
	return list;
}
public List<mobile_audit> demogetotherdeviceslogs(int id) {
	otherdevices o=odrepo.findById(id).get();
	String a=o.getCreateby();
	String b=o.getModifiedby();
	Date c=o.getCreatedata();
	Date d=o.getLastmodifiedDate();
	List<mobile_audit> list = new ArrayList<mobile_audit>();
	mobile_audit mobile_audit =new mobile_audit();
	mobile_audit.setCreated_by(a);
	mobile_audit.setModified_by(b);
	mobile_audit.setCreateddate(c);
	mobile_audit.setLastmodified_date(d);
	list.add(mobile_audit);
	return list;
	
	
}
public List<count> demogetreports() {
	int a=repo.getmobileCount();
	int b=srepo.getserverCount();
	int c=odrepo.getotherdevicesCount();
	int d=repo.getmobilecounttype();
	int type_total=repo.get_types_sum();
	int inactive_type_total=repo.get_inactive_sum();
	int damaged_type_total=repo.get_damaged_sum();
	
	int active_type_total_server=srepo.get_types_sum_server();
	int inactive_type_total_server=srepo.get_inactive_sum_server();
	int damaged_type_total_server=srepo.get_damaged_sum_server();
	
	int active_type_total_otherdevices=odrepo.get_types_sum_otherdevice();
	int inactive_type_total_otherdevices=odrepo.get_inactive_sum_otherdevices();
	int damaged_type_total_otherdevices=odrepo.get_damaged_sum_otherdevices();
	
	
	
	List<count> list = new ArrayList<count>();
	count count=new count();
	count.setTotal_no_mobile_devices(a);
	count.setTotal_no_server_devices(b);
	count.setTotal_no_otherdevices(c);
	count.setTotal_no_of_devices(a+b+c);
	count.setTotal_no_types(d);
	count.setActivestatus(type_total);
	count.setInactivestatus(inactive_type_total);
	count.setDamagedstatus(damaged_type_total);
	
	count.setServeractivestatus(active_type_total_server);
	count.setServerinactivestatus(inactive_type_total_server);
	count.setServerdamagedstatus(damaged_type_total_server);
	
	count.setOtherdevicesactivestatus(active_type_total_otherdevices);
	count.setOtherdevicesinactivestatus(inactive_type_total_otherdevices);
	count.setOtherdevicesdamagedstatus(damaged_type_total_otherdevices);
	
	
	list.add(count);
	
	
	return list;
}
public List<Integer> get_id(){
	List<Integer> list = repo.get_id();
	
	return list;
	
}
public List<Integer> get_server_id() {
	// TODO Auto-generated method stub
	List<Integer> list = srepo.get_server_id();
	return list;
}
public List<Integer> get_otherdevices_id() {
	// TODO Auto-generated method stub
	List<Integer> list = odrepo.get_otherdevices_id();
	
	return list;
}
public List<users> demogetusers() {
	// TODO Auto-generated method stub
	return urepo.findAll();
}



	
}
