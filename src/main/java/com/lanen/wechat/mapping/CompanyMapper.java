package com.lanen.wechat.mapping;

import java.util.List;

import com.lanen.wechat.pojo.Company;

public interface CompanyMapper {
	
	/*
	 * 公司介绍
	 */
	List<Company> getCompanyInfo();
	
}
