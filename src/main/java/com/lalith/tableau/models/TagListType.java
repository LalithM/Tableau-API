package com.lalith.tableau.models;

import java.util.ArrayList;
import java.util.List;

public class TagListType {

	protected List<TagType> tag;

	public List<TagType> getTag() {
		if (tag == null) {
			tag = new ArrayList<TagType>();
		}
		return this.tag;
	}

}
