package com.lalith.tableau.models;

import java.util.ArrayList;
import java.util.List;

public class UserListType {
	protected List<UserType> user;

	public List<UserType> getUser() {
		if (user == null) {
			user = new ArrayList<UserType>();
		}
		return this.user;
	}

}
