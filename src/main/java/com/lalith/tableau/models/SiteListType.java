package com.lalith.tableau.models;

import java.util.ArrayList;
import java.util.List;

public class SiteListType {

	protected List<SiteType> site;

	public List<SiteType> getSite() {
		if (site == null) {
			site = new ArrayList<SiteType>();
		}
		return this.site;
	}

}
