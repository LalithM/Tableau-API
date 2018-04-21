package com.lalith.tableau.models;

public class DataSourceType {
	protected SiteType site;
	protected ProjectType project;
	protected UserType owner;
	protected TagListType tags;
	protected String id;
	protected String name;
	protected String description;
	protected String type;

	public SiteType getSite() {
		return site;
	}

	public void setSite(SiteType site) {
		this.site = site;
	}

	public ProjectType getProject() {
		return project;
	}

	public void setProject(ProjectType project) {
		this.project = project;
	}

	public UserType getOwner() {
		return owner;
	}

	public void setOwner(UserType owner) {
		this.owner = owner;
	}

	public TagListType getTags() {
		return tags;
	}

	public void setTags(TagListType tags) {
		this.tags = tags;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
