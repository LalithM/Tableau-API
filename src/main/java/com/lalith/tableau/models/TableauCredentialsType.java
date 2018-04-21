
package com.lalith.tableau.models;

public class TableauCredentialsType {
	protected SiteType site;
	protected UserType user;
	protected String name;
	protected String password;
	protected String token;

	public SiteType getSite() {
		return site;
	}

	public void setSite(SiteType value) {
		this.site = value;
	}

	public UserType getUser() {
		return user;
	}

	public void setUser(UserType value) {
		this.user = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String value) {
		this.name = value;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String value) {
		this.password = value;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String value) {
		this.token = value;
	}

}
