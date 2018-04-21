package com.lalith.tableau.models;

import java.util.ArrayList;
import java.util.List;

public class ViewListType {

	protected List<ViewType> view;

	public List<ViewType> getView() {
		if (view == null) {
			view = new ArrayList<ViewType>();
		}
		return this.view;
	}

}
