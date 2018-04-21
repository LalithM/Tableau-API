package com.lalith.tableau.models;

import java.math.BigInteger;

public class FileUploadType {

	protected String uploadSessionId;
	protected BigInteger fileSize;

	public String getUploadSessionId() {
		return uploadSessionId;
	}

	public void setUploadSessionId(String value) {
		this.uploadSessionId = value;
	}

	public BigInteger getFileSize() {
		return fileSize;
	}

	public void setFileSize(BigInteger value) {
		this.fileSize = value;
	}

}
