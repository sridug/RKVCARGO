package com.rkv.springboot.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.rkv.springboot.model.Metadata;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransportResponse {
	private Metadata metadata;
	private Object lorryDetail;

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	public Object getLorryDetail() {
		return lorryDetail;
	}

	public void setLorryDetail(Object lorryDetail) {
		this.lorryDetail = lorryDetail;
	}

}