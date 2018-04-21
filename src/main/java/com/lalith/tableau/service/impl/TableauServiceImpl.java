package com.lalith.tableau.service.impl;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.lalith.tableau.common.CommonUtility;
import com.lalith.tableau.common.CommonUtility.RestAPI;
import com.lalith.tableau.exception.UserException;
import com.lalith.tableau.models.DataSourceType;
import com.lalith.tableau.models.ProjectType;
import com.lalith.tableau.models.SiteType;
import com.lalith.tableau.models.TableauCredentialsType;
import com.lalith.tableau.models.TsResponse;
import com.lalith.tableau.models.UserType;
import com.lalith.tableau.models.ViewType;
import com.lalith.tableau.models.WorkbookType;
import com.lalith.tableau.service.TableauService;

@Service
public class TableauServiceImpl implements TableauService {

	@Autowired
	CommonUtility util;

	@Override
	public TableauCredentialsType signIn(String username, String password, String contentUrl) throws IOException {

		TableauCredentialsType signIn = util.invokeSignIn(username, password, contentUrl);
		if(Objects.isNull(signIn)){
			throw new UserException("User Not found with given Credentials");
		}
		return signIn;
	}

	@Override
	public List<SiteType> getSites(TableauCredentialsType credential) throws IOException {
		String url = RestAPI.QUERY_SITES.getUrl();
		TsResponse response = util.query(credential, url);
		if (Objects.isNull(response.getSites())) {
        	throw new IOException("Work Book Details are not Available ");
        }
		return response.getSites().getSite();
	}

	@Override
	public WorkbookType getWorkbookData(TableauCredentialsType credential, String workbookId) throws IOException {
		String url = RestAPI.GET_WORKBOOK.getUrl(credential.getSite().getId(),workbookId);
		TsResponse response = util.query(credential, url);
		if (Objects.isNull(response.getWorkbook())) {
        	throw new IOException("Work Book Details are not Available ");
        }
		return response.getWorkbook();
	}

	@Override
	public UserType getUser(TableauCredentialsType credential) throws IOException {
		String url = RestAPI.QUERY_USERS_ON_SITE.getUrl(credential.getSite().getId(),credential.getUser().getId());
		TsResponse response = util.query(credential, url);
		if (Objects.isNull(response.getUser())) {
        	throw new IOException("User Details are not Available ");
        }
		return response.getUser();
	}

	@Override
	public List<ViewType> getWorkBookViews(TableauCredentialsType credential, String workbookId) throws IOException {
		String url = RestAPI.QUERY_VIEWS.getUrl(credential.getSite().getId(),workbookId);
		TsResponse response = util.query(credential, url);
		if (CollectionUtils.isEmpty(response.getViews().getView())) {
        	throw new IOException("Views are not Available for this workbook");
        }
		return response.getViews().getView();
	}

	@Override
	public List<WorkbookType> getWorkbooks(TableauCredentialsType credential) throws IOException {
		String url = RestAPI.QUERY_WORKBOOKS.getUrl(credential.getSite().getId());
		TsResponse response = util.query(credential, url);
		if (CollectionUtils.isEmpty(response.getWorkbooks().getWorkbook())) {
        	throw new IOException("Work Books are not Available for site");
        }
		return response.getWorkbooks().getWorkbook();
	}

	@Override
	public List<DataSourceType> getDataSources(TableauCredentialsType credential) throws IOException {
		String url = RestAPI.QUERY_DATASOURCES.getUrl(credential.getSite().getId());
		TsResponse response = util.query(credential, url);
		if (CollectionUtils.isEmpty(response.getDataSources().getDataSource())) {
        	throw new IOException("Data Sources are not Available");
        }
		return response.getDataSources().getDataSource();
	}

	@Override
	public List<ViewType> getViews(TableauCredentialsType credential, String workbookId) throws IOException {
		String url = RestAPI.QUERY_VIEWS_ON_SITE.getUrl(credential.getSite().getId());
		TsResponse response = util.query(credential, url);
		if (CollectionUtils.isEmpty(response.getViews().getView())) {
        	throw new IOException("Views are not Available for site");
        }
		return response.getViews().getView();
	}

	@Override
	public List<WorkbookType> getUserWorkbooks(TableauCredentialsType credential) throws IOException {
		String url = RestAPI.QUERY_WORKBOOKS_USER.getUrl(credential.getSite().getId(),credential.getUser().getId());
		TsResponse response = util.query(credential, url);
		if (CollectionUtils.isEmpty(response.getWorkbooks().getWorkbook())) {
        	throw new IOException("Work Books are not Available for user");
        }
		return response.getWorkbooks().getWorkbook();
	}

	@Override
	public List<ProjectType> getProjects(TableauCredentialsType credential) throws IOException {
		String url = RestAPI.QUERY_PROJECTS.getUrl(credential.getSite().getId());
		TsResponse response = util.query(credential, url);
		if (CollectionUtils.isEmpty(response.getProjects().getProject())) {
        	throw new IOException("Projects are not Available for user");
        }
		return response.getProjects().getProject();
	}

}
