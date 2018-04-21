
package com.lalith.tableau.models;

import java.util.ArrayList;
import java.util.List;

public class GranteeCapabilitiesType {

	protected GroupType group;
	protected UserType user;

	protected GranteeCapabilitiesType.Capabilities capabilities;

	public GroupType getGroup() {
		return group;
	}

	public void setGroup(GroupType value) {
		this.group = value;
	}

	public UserType getUser() {
		return user;
	}

	public void setUser(UserType value) {
		this.user = value;
	}

	public GranteeCapabilitiesType.Capabilities getCapabilities() {
		return capabilities;
	}

	public void setCapabilities(GranteeCapabilitiesType.Capabilities value) {
		this.capabilities = value;
	}

	public static class Capabilities {

		protected List<CapabilityType> capability;

		public List<CapabilityType> getCapability() {
			if (capability == null) {
				capability = new ArrayList<CapabilityType>();
			}
			return this.capability;
		}

	}

}
