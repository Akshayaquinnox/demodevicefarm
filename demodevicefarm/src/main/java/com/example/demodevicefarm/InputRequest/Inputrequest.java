package com.example.demodevicefarm.InputRequest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class Inputrequest<T> {

@JsonProperty(value="userId",required=true)
private String loggedInUser;
private String timezone;
private T mobile;
private T server;
private T otherdevices;



public String getLoggedInUser() {
	return loggedInUser;
}
public void setLoggedInUser(String loggedInUser) {
	this.loggedInUser = loggedInUser;
}
public String getTimezone() {
	return timezone;
}
public void setTimezone(String timezone) {
	this.timezone = timezone;
}
public T getMobile() {
	return mobile;
}
public void setMobile(T mobile) {
	this.mobile = mobile;
}
public T getServer() {
	return server;
}
public void setServer(T server) {
	this.server = server;
}
public T getOtherdevices() {
	return otherdevices;
}
public void setOtherdevices(T otherdevices) {
	this.otherdevices = otherdevices;
}

}
