package com.genewhisper.service;

import java.util.List;

import com.genewhisper.web.controller.model.CustomerProfileVO;

public interface GenewhisperService {

	public List<CustomerProfileVO> findCustomerProfiles();

}
