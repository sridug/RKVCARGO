package com.rkv.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rkv.springboot.model.LorryInfo;
import com.rkv.springboot.repositories.LorryRepository;

import org.springframework.transaction.annotation.Transactional;


@Service("lorryService")
@Transactional
public class LorryServiceImpl implements LorryService {
	
	@Autowired
	private LorryRepository lorryRepository;

	@Override
	public void saveLorry(LorryInfo lorryInfo) {
		lorryRepository.save(lorryInfo);

	}

	@Override
	public List<LorryInfo> findAllAvailableLorries() {
		return lorryRepository.findAll();
	}

}
