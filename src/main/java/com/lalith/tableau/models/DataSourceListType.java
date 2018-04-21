package com.lalith.tableau.models;

import java.util.ArrayList;
import java.util.List;

public class DataSourceListType {

	protected List<DataSourceType> dataSource;

	public List<DataSourceType> getDataSource() {
		if (dataSource == null) {
			dataSource = new ArrayList<DataSourceType>();
		}
		return this.dataSource;
	}

}
