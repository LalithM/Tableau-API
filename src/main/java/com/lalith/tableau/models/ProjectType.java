package com.lalith.tableau.models;


public class ProjectType {

	protected UserType owner;
	protected String id;
	protected String name;
	protected String description;

	public UserType getOwner() {
		return owner;
	}

	public void setOwner(UserType value) {
		this.owner = value;
	}

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String value) {
		this.description = value;
	}

}
