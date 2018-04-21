package com.lalith.tableau.models;

import java.util.ArrayList;
import java.util.List;

public class GroupListType {

	protected List<GroupType> group;

	public List<GroupType> getGroup() {
		if (group == null) {
			group = new ArrayList<GroupType>();
		}
		return this.group;
	}

}
