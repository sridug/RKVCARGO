package com.rkv.springboot.model;

import java.util.List;

import com.rkv.springboot.model.AdditionalDetails;

public class Outcome {
	private int status;
	private String type;
	private String message;
	private int code;
	private List<AdditionalDetails> additionalDetails;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public List<AdditionalDetails> getAdditionalDetails() {
		return additionalDetails;
	}

	public void setAdditionalDetails(List<AdditionalDetails> additionalDetails) {
		this.additionalDetails = additionalDetails;
	}

}
