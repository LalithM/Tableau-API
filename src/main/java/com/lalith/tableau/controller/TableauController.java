package com.lalith.tableau.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lalith.tableau.models.DataSourceType;
import com.lalith.tableau.models.ProjectType;
import com.lalith.tableau.models.SiteType;
import com.lalith.tableau.models.TableauCredentialsType;
import com.lalith.tableau.models.UserType;
import com.lalith.tableau.models.ViewType;
import com.lalith.tableau.models.WorkbookType;
import com.lalith.tableau.service.TableauService;

@RestController
@RequestMapping("/tableau")
public class TableauController {

	@Autowired
	TableauService tableauService;
	
	@Value("${tableau.username}")
	private String userName;
	
	@Value("${tableau.password}")
	private String password;
	
	@Value("${tableau.contenturl}")
	private String contentUrl;
	

	@GetMapping("/sites")
	public ResponseEntity<List<SiteType>> getSites() throws IOException {
		TableauCredentialsType credential = tableauService.signIn(userName, password, contentUrl);
		return ResponseEntity.ok(tableauService.getSites(credential));
	}

	@GetMapping("/workbook/{workbookId}")
	public ResponseEntity<WorkbookType> getWoorkBook(@PathVariable String workbookId) throws IOException {
		TableauCredentialsType credential = tableauService.signIn(userName, password, contentUrl);
		return ResponseEntity.ok(tableauService.getWorkbookData(credential, workbookId));

	}

	@GetMapping("/user")
	public ResponseEntity<UserType> getUser() throws IOException {
		TableauCredentialsType credential = tableauService.signIn(userName, password, contentUrl);
		return ResponseEntity.ok(tableauService.getUser(credential));
	}

	@GetMapping("/workbooks/{workbookId}/views")
	public ResponseEntity<List<ViewType>> getWorkBookViews(@PathVariable String workbookId) throws IOException {
		TableauCredentialsType credential = tableauService.signIn(userName, password, contentUrl);
		return ResponseEntity.ok(tableauService.getWorkBookViews(credential, workbookId));
	}

	@GetMapping("/workbooks")
	public ResponseEntity<List<WorkbookType>> getWorkbooks() throws IOException {
		TableauCredentialsType credential = tableauService.signIn(userName, password, contentUrl);
		return ResponseEntity.ok(tableauService.getWorkbooks(credential));
	}
	
	@GetMapping("/datasources")
	public ResponseEntity<List<DataSourceType>> getDataSources() throws IOException{
		TableauCredentialsType credential = tableauService.signIn(userName, password, contentUrl);
		return ResponseEntity.ok(tableauService.getDataSources(credential));
	}
	
	@GetMapping("/projects")
	public ResponseEntity<List<ProjectType>> getProjectss() throws IOException{
		TableauCredentialsType credential = tableauService.signIn(userName, password, contentUrl);
		return ResponseEntity.ok(tableauService.getProjects(credential));
	}
	
	

}
