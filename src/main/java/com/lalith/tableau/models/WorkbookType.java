package com.lalith.tableau.models;

public class WorkbookType {

	protected SiteType site;
	protected ProjectType project;
	protected UserType owner;
	protected TagListType tags;
	protected ViewListType views;
	protected String id;
	protected String name;
	protected String description;
	protected String contentUrl;

	public SiteType getSite() {
		return site;
	}

	public void setSite(SiteType value) {
		this.site = value;
	}

	public ProjectType getProject() {
		return project;
	}

	public void setProject(ProjectType value) {
		this.project = value;
	}

	public UserType getOwner() {
		return owner;
	}

	public void setOwner(UserType value) {
		this.owner = value;
	}

	public TagListType getTags() {
		return tags;
	}

	public void setTags(TagListType value) {
		this.tags = value;
	}

	public ViewListType getViews() {
		return views;
	}

	public void setViews(ViewListType value) {
		this.views = value;
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

	public String getContentUrl() {
		return contentUrl;
	}

	public void setContentUrl(String value) {
		this.contentUrl = value;
	}

}
