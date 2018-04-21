package com.lalith.tableau.service;

import java.io.IOException;
import java.util.List;

import com.lalith.tableau.models.DataSourceType;
import com.lalith.tableau.models.ProjectType;
import com.lalith.tableau.models.SiteType;
import com.lalith.tableau.models.TableauCredentialsType;
import com.lalith.tableau.models.UserType;
import com.lalith.tableau.models.ViewType;
import com.lalith.tableau.models.WorkbookType;

public interface TableauService {

	TableauCredentialsType signIn(String username, String password, String contentUrl) throws IOException;

	List<SiteType> getSites(TableauCredentialsType credential) throws IOException;
	
	WorkbookType getWorkbookData(TableauCredentialsType credential, String workbookId ) throws IOException;
	
	UserType getUser(TableauCredentialsType credential) throws IOException;
	
	List<ViewType> getViews(TableauCredentialsType credential,String workbookId) throws IOException;
	
	List<ViewType> getWorkBookViews(TableauCredentialsType credential,String workbookId) throws IOException;
	
	List<WorkbookType> getWorkbooks(TableauCredentialsType credential) throws IOException;
	
	List<WorkbookType> getUserWorkbooks(TableauCredentialsType credential) throws IOException;
	
	List<DataSourceType> getDataSources(TableauCredentialsType credential) throws IOException;
	
	List<ProjectType> getProjects(TableauCredentialsType credential) throws IOException;
	
	
	
	

}
