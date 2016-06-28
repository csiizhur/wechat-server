package com.lanen.wechat.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanen.wechat.mapping.HonorMapper;
import com.lanen.wechat.pojo.Honor;

@Service
public class HonorService {

	@Autowired
	private HonorMapper honorMapper;
	
	public List<Honor> listHonor(){
		List<Honor> list=honorMapper.listHonor();
		return list;
		
	}
}
