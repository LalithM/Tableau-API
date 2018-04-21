package com.lalith.tableau.models;

import java.math.BigInteger;

public class SiteType {

	protected SiteType.Usage usage;
	protected String id;
	protected String name;
	protected String contentUrl;
	protected String adminMode;
	protected BigInteger userQuota;
	protected BigInteger storageQuota;
	protected Boolean disableSubscriptions;
	protected String state;

	public SiteType.Usage getUsage() {
		return usage;
	}

	public void setUsage(SiteType.Usage value) {
		this.usage = value;
	}

	public String getId() {
		return id;
	}

	public void setId(String value) {
		this.id = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String value) {
		this.name = value;
	}

	public String getContentUrl() {
		return contentUrl;
	}

	public void setContentUrl(String value) {
		this.contentUrl = value;
	}

	public String getAdminMode() {
		return adminMode;
	}

	public void setAdminMode(String value) {
		this.adminMode = value;
	}

	public BigInteger getUserQuota() {
		return userQuota;
	}

	public void setUserQuota(BigInteger value) {
		this.userQuota = value;
	}

	public BigInteger getStorageQuota() {
		return storageQuota;
	}

	public void setStorageQuota(BigInteger value) {
		this.storageQuota = value;
	}

	public Boolean isDisableSubscriptions() {
		return disableSubscriptions;
	}

	public void setDisableSubscriptions(Boolean value) {
		this.disableSubscriptions = value;
	}

	public String getState() {
		return state;
	}

	public void setState(String value) {
		this.state = value;
	}

	public static class Usage {

		protected BigInteger numUsers;
		protected BigInteger storage;

		public BigInteger getNumUsers() {
			return numUsers;
		}

		public void setNumUsers(BigInteger value) {
			this.numUsers = value;
		}

		public BigInteger getStorage() {
			return storage;
		}

		public void setStorage(BigInteger value) {
			this.storage = value;
		}

	}

}
