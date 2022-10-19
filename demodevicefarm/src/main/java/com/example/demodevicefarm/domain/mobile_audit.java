package com.example.demodevicefarm.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
public class mobile_audit {
	
	@Id
	@GeneratedValue
	private int mobile_audit_clientdevice_id;
	
private String modified_by;
private String modified_field;
private String created_by;
private Date Lastmodified_date;
private Date Createddate;



public int getClients_device_id() {
	return mobile_audit_clientdevice_id;
}
public void setClient_device_id(int mobile_audit_clientdevice_id) {
	this.mobile_audit_clientdevice_id = mobile_audit_clientdevice_id;
}
public String getModified_by() {
	return modified_by;
}
public void setModified_by(String modified_by) {
	this.modified_by = modified_by;
}
public String getModified_field() {
	return modified_field;
}
public void setModified_field(String modified_field) {
	this.modified_field = modified_field;
}
public int getMobile_audit_clientdevice_id() {
	return mobile_audit_clientdevice_id;
}
public void setMobile_audit_clientdevice_id(int mobile_audit_clientdevice_id) {
	this.mobile_audit_clientdevice_id = mobile_audit_clientdevice_id;
}
public String getCreated_by() {
	return created_by;
}
public void setCreated_by(String created_by) {
	this.created_by = created_by;
}
public Date getLastmodified_date() {
	return Lastmodified_date;
}
public void setLastmodified_date(Date lastmodified_date) {
	Lastmodified_date = lastmodified_date;
}
public Date getCreateddate() {
	return Createddate;
}
public void setCreateddate(Date createddate) {
	Createddate = createddate;
}


}
