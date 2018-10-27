package com.mycardsolutions.webservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class SoapRepository {

	private static final Logger logger = LoggerFactory.getLogger(SoapRepository.class);
	
	public void createOrUpdateCustomer(String customerNo) {
		logger.info("Input Params: " + customerNo);
		logger.info("Calling third party SOAP request here...");
	}
}
