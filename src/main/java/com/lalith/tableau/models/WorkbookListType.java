package com.lalith.tableau.models;

import java.util.ArrayList;
import java.util.List;

public class WorkbookListType {

	protected List<WorkbookType> workbook;

	public List<WorkbookType> getWorkbook() {
		if (workbook == null) {
			workbook = new ArrayList<WorkbookType>();
		}
		return this.workbook;
	}

}
