package com.lalith.tableau.models;

import java.util.ArrayList;
import java.util.List;

public class PermissionsType {

	protected WorkbookType workbook;
	protected List<GranteeCapabilitiesType> granteeCapabilities;

	public WorkbookType getWorkbook() {
		return workbook;
	}

	public void setWorkbook(WorkbookType value) {
		this.workbook = value;
	}

	public List<GranteeCapabilitiesType> getGranteeCapabilities() {
		if (granteeCapabilities == null) {
			granteeCapabilities = new ArrayList<GranteeCapabilitiesType>();
		}
		return this.granteeCapabilities;
	}

}
