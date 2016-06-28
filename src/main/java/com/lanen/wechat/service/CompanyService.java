package com.lanen.wechat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanen.wechat.mapping.CompanyMapper;
import com.lanen.wechat.pojo.Company;

@Service
public class CompanyService {

	@Autowired
	private CompanyMapper companyMapper;
	
	public Company getCompanyInfo(){
		Company c=companyMapper.getCompanyInfo().get(0);
		return c;
		
	}
}
