package com.genewhisper.dao;

import java.util.List;

import com.genewhisper.dao.entity.CustomerProfileEntity;

public interface GenewhisperDao {

	public List<CustomerProfileEntity> findCustomerProfiles();

}
