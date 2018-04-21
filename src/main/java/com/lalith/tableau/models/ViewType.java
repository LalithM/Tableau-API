package com.lalith.tableau.models;

import java.math.BigInteger;

public class ViewType {

	protected ViewType.Usage usage;
	protected String id;
	protected String name;
	protected String contentUrl;

	public ViewType.Usage getUsage() {
		return usage;
	}

	public void setUsage(ViewType.Usage value) {
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

	public static class Usage {
		protected BigInteger totalViewCount;

		public BigInteger getTotalViewCount() {
			return totalViewCount;
		}

		public void setTotalViewCount(BigInteger value) {
			this.totalViewCount = value;
		}

	}

}
