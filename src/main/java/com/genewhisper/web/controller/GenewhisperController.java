package com.genewhisper.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.genewhisper.service.GenewhisperService;
import com.genewhisper.web.controller.model.CustomerProfileVO;

/**
 * 
 * @author Genewhisper
 *
 */
@Controller
@Scope("singleton")
public class GenewhisperController {
	
	public GenewhisperController(){
		System.out.println("_)#)#)GenewhisperController");
	}
	
	@Autowired
	private GenewhisperService genewhisperService;
	
	@GetMapping("/customer-profiles")
	public String loadPage(Model model) {
		List<CustomerProfileVO> customerProfileVOsList=genewhisperService.findCustomerProfiles();
		model.addAttribute("customerProfileVOsList", customerProfileVOsList);
		return "/customer/customer-profiles";
	}
}
