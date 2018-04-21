package com.lalith.tableau.models;

import java.util.ArrayList;
import java.util.List;

public class ProjectListType {

	protected List<ProjectType> project;

	public List<ProjectType> getProject() {
		if (project == null) {
			project = new ArrayList<ProjectType>();
		}
		return this.project;
	}

}
