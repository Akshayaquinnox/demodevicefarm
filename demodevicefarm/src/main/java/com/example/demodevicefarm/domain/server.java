package com.example.demodevicefarm.domain;

import java.util.Date;



import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
public class server {


	@Id
	@GeneratedValue
	private int ClientDeviceID;
	private String name;
	private String type;
	private String manufacture;
	private String make;
	private String model;
	private String os;
	private String date;
	private String serialno;
	private String location;
	private String status;
	private String ipadress;
	private String  current_client;
	
	
	@CreatedDate
	private Date createdata;
@LastModifiedDate
	private Date LastmodifiedDate;
@CreatedBy
	private String createby;
@LastModifiedBy
	private String modifiedby;
public int getClientDeviceID() {
	return ClientDeviceID;
}
public void setClientDeviceID(int clientDeviceID) {
	ClientDeviceID = clientDeviceID;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getManufacture() {
	return manufacture;
}
public void setManufacture(String manufacture) {
	this.manufacture = manufacture;
}
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getOs() {
	return os;
}
public void setOs(String os) {
	this.os = os;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getSerialno() {
	return serialno;
}
public void setSerialno(String serialno) {
	this.serialno = serialno;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getIpadress() {
	return ipadress;
}
public void setIpadress(String ipadress) {
	this.ipadress = ipadress;
}
public Date getCreatedata() {
	return createdata;
}
public void setCreatedata(Date createdata) {
	this.createdata = createdata;
}
public Date getLastmodifiedDate() {
	return LastmodifiedDate;
}
public void setLastmodifiedDate(Date lastmodifiedDate) {
	LastmodifiedDate = lastmodifiedDate;
}
public String getCreateby() {
	return createby;
}
public void setCreateby(String createby) {
	this.createby = createby;
}
public String getModifiedby() {
	return modifiedby;
}
public void setModifiedby(String modifiedby) {
	this.modifiedby = modifiedby;
}
public String getCurrent_client() {
	return current_client;
}
public void setCurrent_client(String current_client) {
	this.current_client = current_client;
}

	
	
	
	
}
