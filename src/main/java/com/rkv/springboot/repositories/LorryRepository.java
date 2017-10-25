package com.rkv.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rkv.springboot.model.LorryInfo;

public interface LorryRepository extends JpaRepository<LorryInfo, Long> {

}
