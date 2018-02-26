package com.genewhisper.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genewhisper.dao.GenewhisperDao;
import com.genewhisper.dao.entity.CustomerProfileEntity;
import com.genewhisper.service.GenewhisperService;
import com.genewhisper.web.controller.model.CustomerProfileVO;

@Service("GenewhisperServiceImpl")
public class GenewhisperServiceImpl implements GenewhisperService {
	
	@Autowired
	private GenewhisperDao genewhisperDao;
	
	@Override
	public List<CustomerProfileVO> findCustomerProfiles() {
		List<CustomerProfileEntity> customerProfileEntityList=genewhisperDao.findCustomerProfiles();
		List<CustomerProfileVO> customerProfileVOsList=new ArrayList<CustomerProfileVO>();
		for(CustomerProfileEntity entity: customerProfileEntityList){
			CustomerProfileVO customerProfileVO=new CustomerProfileVO();
			BeanUtils.copyProperties(entity, customerProfileVO);
			customerProfileVOsList.add(customerProfileVO);
		}
		return customerProfileVOsList;
	}
}
