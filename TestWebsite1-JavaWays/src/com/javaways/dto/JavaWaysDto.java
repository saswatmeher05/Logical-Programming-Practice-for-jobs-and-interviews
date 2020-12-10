package com.javaways.dto;

import java.sql.Date;

public class JavaWaysDto {
	String cemail;
	String cpassword;
	String cphone;
	String cgender;
	Date cdob;
	String ccountry;
	String cname;



public JavaWaysDto(String cemail, String cpassword, String cphone, String cgender, Date cdob, String ccountry,
		String cname) {
	super();
	this.cemail = cemail;
	this.cpassword = cpassword;
	this.cphone = cphone;
	this.cgender = cgender;
	this.cdob = cdob;
	this.ccountry = ccountry;
	this.cname = cname;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getCemail() {
	return cemail;
}
public void setCemail(String cemail) {
	this.cemail = cemail;
}
public String getCpassword() {
	return cpassword;
}
public void setCpassword(String cpassword) {
	this.cpassword = cpassword;
}
public String getCphone() {
	return cphone;
}
public void setCphone(String cphone) {
	this.cphone = cphone;
}
public String getCgender() {
	return cgender;
}
public void setCgender(String cgender) {
	this.cgender = cgender;
}
public Date getCdob() {
	return cdob;
}
public void setCdob(Date cdob) {
	this.cdob = cdob;
}
public String getCcountry() {
	return ccountry;
}
public void setCcountry(String ccountry) {
	this.ccountry = ccountry;
}
}
