package com.example.demodevicefarm.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demodevicefarm.InputRequest.Inputrequest;
import com.example.demodevicefarm.domain.count;
import com.example.demodevicefarm.domain.mobile;
import com.example.demodevicefarm.domain.mobile_audit;
import com.example.demodevicefarm.domain.otherdevices;
import com.example.demodevicefarm.domain.server;
import com.example.demodevicefarm.domain.users;
import com.example.demodevicefarm.service.service;
@CrossOrigin
@RestController
public class controller {
@Autowired
private service s;



@GetMapping("/demogetusers")
public List<users> getusers() {
	
return s.demogetusers();

}

@GetMapping("/demogetreports")
public List<count> getreports() {
	return s.demogetreports();
}
@GetMapping("/demogetauditlogs/{id}")
public List<mobile_audit> getauditlogs(@PathVariable int id) {
	return s.demogetauditlogs(id);
}
@GetMapping("/demogetserverlogs/{id}")
public List<mobile_audit> getserverlogs(@PathVariable int id) {
	return s.demogetserverlogs(id);
}
@GetMapping("/demogetotherdeviceslogs/{id}")
public List<mobile_audit> getotherdeviceslogs(@PathVariable int id) {
	return s.demogetotherdeviceslogs(id);
}

@GetMapping("/demogetmobileid")
public List<Integer> get_id() {
	
return s.get_id();

}
@GetMapping("/demogetserverid")
public List<Integer> get_server_id() {
	
return s.get_server_id();

}
@GetMapping("/demogetotherdevicesid")
public List<Integer> get_otherdevices_id() {
	
return s.get_otherdevices_id();

}


@GetMapping("/demogetmobile")
public List<mobile> getmobile() {
	
return s.demogetmobile();

}

@GetMapping("/demogetserver")
public List<server> getserver() {
	
return s.demogetserver();

}
@GetMapping("/demogetotherdevices")
public List<otherdevices> getotherdevices() {
	
return s.demogetotherdevices();

}
@PostMapping("/demoaddmobile")
public String savemobile(@RequestBody Inputrequest<mobile> request) {
	
	return s.savemobile(request);
	
}
@PostMapping("/demoaddserver")
public String saveserver(@RequestBody Inputrequest<server> request) {
	
	return s.saveserver(request);
	
}
@PostMapping("/demoaddotherdevices")
public String saveotherdevices(@RequestBody Inputrequest<otherdevices> request) {
	
	return s.saveotherdevices(request);
	
}













@PutMapping("/demoupdatemobile/{id}")
public String updatemobile(@PathVariable int id,@RequestBody Inputrequest<mobile> request )
{

return s.updatemobile(id,request);


}

@PutMapping("/demoupdateserver/{id}")
public String updateserver(@PathVariable int id,@RequestBody Inputrequest<server> request)
{

return s.updateserver(id,request);


}
@PutMapping("/demoupdateotherdevices/{id}")
public String updateotherdevices(@PathVariable int id,@RequestBody Inputrequest<otherdevices> request)
{

return s.updateotherdevices(id,request);


}


















}
