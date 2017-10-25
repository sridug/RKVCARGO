package com.rkv.springboot.service;

import java.util.List;

import com.rkv.springboot.model.LorryInfo;

public interface LorryService {
	
	void saveLorry(LorryInfo lorryInfo);
	
	List<LorryInfo> findAllAvailableLorries();
}
