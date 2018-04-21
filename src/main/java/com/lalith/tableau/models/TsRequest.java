package com.lalith.tableau.models;

public class TsRequest {

	protected TableauCredentialsType credentials;
	protected GroupType group;
	protected PermissionsType permissions;
	protected WorkbookType workbook;
	protected UserType user;

	public TableauCredentialsType getCredentials() {
		return credentials;
	}

	public void setCredentials(TableauCredentialsType value) {
		this.credentials = value;
	}

	public GroupType getGroup() {
		return group;
	}

	public void setGroup(GroupType value) {
		this.group = value;
	}

	public PermissionsType getPermissions() {
		return permissions;
	}

	public void setPermissions(PermissionsType value) {
		this.permissions = value;
	}

	public WorkbookType getWorkbook() {
		return workbook;
	}

	public void setWorkbook(WorkbookType value) {
		this.workbook = value;
	}

	public UserType getUser() {
		return user;
	}

	public void setUser(UserType user) {
		this.user = user;
	}

}
