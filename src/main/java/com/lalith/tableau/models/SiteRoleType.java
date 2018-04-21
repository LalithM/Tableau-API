package com.lalith.tableau.models;

public enum SiteRoleType {

	GUEST("Guest"), 
	INTERACTOR("Interactor"),
	PUBLISHER("Publisher"), 
	SITE_ADMINISTRATOR("SiteAdministrator"),
	UNLICENSED("Unlicensed"),
	UNLICENSED_WITH_PUBLISH("UnlicensedWithPublish"),
	VIEWER("Viewer"), 
	VIEWER_WITH_PUBLISH("ViewerWithPublish"),
	SERVER_ADMINISTRATOR("ServerAdministrator");
	
	private final String value;

	SiteRoleType(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static SiteRoleType fromValue(String v) {
		for (SiteRoleType c : SiteRoleType.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
