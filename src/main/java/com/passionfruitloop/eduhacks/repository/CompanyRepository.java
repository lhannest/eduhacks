package com.passionfruitloop.eduhacks.repository;

import org.springframework.data.repository.CrudRepository;

import com.passionfruitloop.eduhacks.models.Company;

public interface CompanyRepository extends CrudRepository<Company, Long> {
	
}