package com.lalith.tableau.common;

import org.springframework.stereotype.Component;

import com.lalith.tableau.models.CapabilityType;
import com.lalith.tableau.models.GranteeCapabilitiesType;
import com.lalith.tableau.models.GroupType;
import com.lalith.tableau.models.PermissionsType;
import com.lalith.tableau.models.ProjectType;
import com.lalith.tableau.models.SiteType;
import com.lalith.tableau.models.TableauCredentialsType;
import com.lalith.tableau.models.TsRequest;
import com.lalith.tableau.models.TsResponse;
import com.lalith.tableau.models.UserType;
import com.lalith.tableau.models.WorkbookType;

@Component
public class ObjectFactory {

	public ObjectFactory() {
	}

	public GranteeCapabilitiesType createGranteeCapabilitiesType() {
		return new GranteeCapabilitiesType();
	}

	public SiteType createSiteType() {
		return new SiteType();
	}

	public TsResponse createTsResponse() {
		return new TsResponse();
	}

	public TableauCredentialsType createTableauCredentialsType() {
		return new TableauCredentialsType();
	}

	public GroupType createGroupType() {
		return new GroupType();
	}

	public PermissionsType createPermissionsType() {
		return new PermissionsType();
	}

	public ProjectType createProjectType() {
		return new ProjectType();
	}

	public WorkbookType createWorkbookType() {
		return new WorkbookType();
	}

	public TsRequest createTsRequest() {
		return new TsRequest();
	}

	public CapabilityType createCapabilityType() {
		return new CapabilityType();
	}

	public GranteeCapabilitiesType.Capabilities createGranteeCapabilitiesTypeCapabilities() {
		return new GranteeCapabilitiesType.Capabilities();
	}

	public UserType createUserType() {
		return new UserType();
	}

}
