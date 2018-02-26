package com.genewhisper.dao.impl;

import java.util.List;

import org.codehaus.jackson.map.deser.impl.BeanPropertyMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.genewhisper.dao.GenewhisperDao;
import com.genewhisper.dao.entity.CustomerProfileEntity;

@Repository("GenewhisperDaoImpl")
public class GenewhisperDaoImpl  implements GenewhisperDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<CustomerProfileEntity> findCustomerProfiles() {
		List<CustomerProfileEntity> customerProfileEntittList=jdbcTemplate.query("select fid,name,email,doe from customer_profiles_tbl", new BeanPropertyRowMapper(CustomerProfileEntity.class));
		return customerProfileEntittList;
	}

}
