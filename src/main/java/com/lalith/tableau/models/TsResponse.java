package com.lalith.tableau.models;

public class TsResponse {

	protected PaginationType pagination;
	protected GroupListType groups;
	protected ProjectListType projects;
	protected SiteListType sites;
	protected DataSourceListType dataSources;
	protected WorkbookListType workbooks;
	protected ViewListType views;
	protected UserListType users;
	protected TableauCredentialsType credentials;
	protected ErrorType error;
	protected FileUploadType fileUpload;
	protected GroupType group;
	protected PermissionsType permissions;
	protected WorkbookType workbook;
	protected ViewType view;
	protected UserType user;
	protected DataSourceType dataSource;
	

	public PaginationType getPagination() {
		return pagination;
	}

	public void setPagination(PaginationType value) {
		this.pagination = value;
	}

	public GroupListType getGroups() {
		return groups;
	}

	public void setGroups(GroupListType value) {
		this.groups = value;
	}

	public ProjectListType getProjects() {
		return projects;
	}

	public void setProjects(ProjectListType value) {
		this.projects = value;
	}

	public SiteListType getSites() {
		return sites;
	}

	public void setSites(SiteListType value) {
		this.sites = value;
	}

	public WorkbookListType getWorkbooks() {
		return workbooks;
	}

	public void setWorkbooks(WorkbookListType value) {
		this.workbooks = value;
	}

	public TableauCredentialsType getCredentials() {
		return credentials;
	}

	public void setCredentials(TableauCredentialsType value) {
		this.credentials = value;
	}

	public ErrorType getError() {
		return error;
	}

	public void setError(ErrorType value) {
		this.error = value;
	}

	public FileUploadType getFileUpload() {
		return fileUpload;
	}

	public void setFileUpload(FileUploadType value) {
		this.fileUpload = value;
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

	public ViewListType getViews() {
		return views;
	}

	public void setViews(ViewListType views) {
		this.views = views;
	}

	public ViewType getView() {
		return view;
	}

	public void setView(ViewType view) {
		this.view = view;
	}

	public UserListType getUsers() {
		return users;
	}

	public void setUsers(UserListType users) {
		this.users = users;
	}

	public UserType getUser() {
		return user;
	}

	public void setUser(UserType user) {
		this.user = user;
	}

	public DataSourceListType getDataSources() {
		return dataSources;
	}

	public void setDataSources(DataSourceListType dataSources) {
		this.dataSources = dataSources;
	}

	public DataSourceType getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSourceType dataSource) {
		this.dataSource = dataSource;
	}
	
	

}
