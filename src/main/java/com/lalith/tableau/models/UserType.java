package com.lalith.tableau.models;

import javax.xml.datatype.XMLGregorianCalendar;

public class UserType {

	protected String id;
	protected String name;
	protected String fullName;
	protected String email;
	protected String password;
	protected SiteRoleType siteRole;
	protected XMLGregorianCalendar lastLogin;
	protected String externalAuthUserId;

	public String getId() {
		return id;
	}

	public void setId(String value) {
		this.id = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String value) {
		this.name = value;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String value) {
		this.fullName = value;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String value) {
		this.email = value;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String value) {
		this.password = value;
	}

	public SiteRoleType getSiteRole() {
		return siteRole;
	}

	public void setSiteRole(SiteRoleType value) {
		this.siteRole = value;
	}

	public XMLGregorianCalendar getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(XMLGregorianCalendar value) {
		this.lastLogin = value;
	}

	public String getExternalAuthUserId() {
		return externalAuthUserId;
	}

	public void setExternalAuthUserId(String value) {
		this.externalAuthUserId = value;
	}

}
