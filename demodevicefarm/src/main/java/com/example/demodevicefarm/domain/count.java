package com.example.demodevicefarm.domain;

public class count {
private int total_no_mobile_devices;
private int total_no_server_devices;
private int total_no_otherdevices;
private int total_no_of_devices;
private int total_no_types;
private int activestatus;
private int inactivestatus;
private int damagedstatus;

private int serveractivestatus;
private int serverinactivestatus;
private int serverdamagedstatus;

private int otherdevicesactivestatus;
private int otherdevicesinactivestatus;
private int otherdevicesdamagedstatus;


public int getDamagedstatus() {
	return damagedstatus;
}


public void setDamagedstatus(int damaged_type_total) {
	this.damagedstatus = damaged_type_total;
	
}


public int getInactivestatus() {
	return inactivestatus;
}


public void setInactivestatus(int inactive_type_total) {
	this.inactivestatus = inactive_type_total;
	
}

public int getActivestatus() {
	return activestatus;
}

public void setActivestatus(int type_total) {

	this.activestatus = type_total;
	
}
public int getTotal_no_mobile_devices() {
	return total_no_mobile_devices;
}
public void setTotal_no_mobile_devices(int total_no_mobile_devices) {
	this.total_no_mobile_devices = total_no_mobile_devices;
}

public int getTotal_no_server_devices() {
	return total_no_server_devices;
}
public void setTotal_no_server_devices(int total_no_server_devices) {
	this.total_no_server_devices = total_no_server_devices;
}
public int getTotal_no_otherdevices() {
	return total_no_otherdevices;
}
public void setTotal_no_otherdevices(int total_no_otherdevices) {
	this.total_no_otherdevices = total_no_otherdevices;
}

public int getTotal_no_of_devices() {
	return total_no_of_devices;
}
public void setTotal_no_of_devices(int total_no_of_devices) {
	this.total_no_of_devices = total_no_of_devices;
}
public int getTotal_no_types() {
	return total_no_types;
}
public void setTotal_no_types(int total_no_types) {
	this.total_no_types = total_no_types;
}


public int getServeractivestatus() {
	return serveractivestatus;
}


public void setServeractivestatus(int serveractivestatus) {
	this.serveractivestatus = serveractivestatus;
}


public int getServerinactivestatus() {
	return serverinactivestatus;
}


public void setServerinactivestatus(int serverinactivestatus) {
	this.serverinactivestatus = serverinactivestatus;
}


public int getServerdamagedstatus() {
	return serverdamagedstatus;
}


public void setServerdamagedstatus(int serverdamagedstatus) {
	this.serverdamagedstatus = serverdamagedstatus;
}


public int getOtherdevicesactivestatus() {
	return otherdevicesactivestatus;
}


public void setOtherdevicesactivestatus(int otherdevicesactivestatus) {
	this.otherdevicesactivestatus = otherdevicesactivestatus;
}


public int getOtherdevicesinactivestatus() {
	return otherdevicesinactivestatus;
}


public void setOtherdevicesinactivestatus(int otherdevicesinactivestatus) {
	this.otherdevicesinactivestatus = otherdevicesinactivestatus;
}


public int getOtherdevicesdamagedstatus() {
	return otherdevicesdamagedstatus;
}


public void setOtherdevicesdamagedstatus(int otherdevicesdamagedstatus) {
	this.otherdevicesdamagedstatus = otherdevicesdamagedstatus;
}







}


