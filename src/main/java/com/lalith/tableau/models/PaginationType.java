package com.lalith.tableau.models;

import java.math.BigInteger;

public class PaginationType {

	protected BigInteger pageNumber;
	protected BigInteger pageSize;
	protected BigInteger totalAvailable;

	public BigInteger getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(BigInteger value) {
		this.pageNumber = value;
	}

	public BigInteger getPageSize() {
		return pageSize;
	}

	public void setPageSize(BigInteger value) {
		this.pageSize = value;
	}

	public BigInteger getTotalAvailable() {
		return totalAvailable;
	}

	public void setTotalAvailable(BigInteger value) {
		this.totalAvailable = value;
	}

}
