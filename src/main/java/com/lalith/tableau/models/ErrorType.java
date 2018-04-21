package com.lalith.tableau.models;

import java.math.BigInteger;

public class ErrorType {

	protected String summary;
	protected String detail;
	protected BigInteger code;

	public String getSummary() {
		return summary;
	}

	public void setSummary(String value) {
		this.summary = value;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String value) {
		this.detail = value;
	}

	public BigInteger getCode() {
		return code;
	}

	public void setCode(BigInteger value) {
		this.code = value;
	}

}
