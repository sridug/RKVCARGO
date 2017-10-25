package com.rkv.springboot.model;

import com.rkv.springboot.model.Outcome;

public class Metadata {
	private String serviceReferenceId;
	private Outcome outcome;
	private int limit;
	private int offset;
	private int total;

	public String getServiceReferenceId() {
		return serviceReferenceId;
	}

	public void setServiceReferenceId(String serviceReferenceId) {
		this.serviceReferenceId = serviceReferenceId;
	}

	public Outcome getOutcome() {
		return outcome;
	}

	public void setOutcome(Outcome outcome) {
		this.outcome = outcome;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

}

