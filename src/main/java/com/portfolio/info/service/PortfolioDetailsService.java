package com.portfolio.info.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PortfolioDetailsService {
	
	
	@RequestMapping(value="/positions/{userId}", method=RequestMethod.GET)
	public String getPortfolioDetails(@PathVariable String userId) {
		return "Portfolio up 1%";
	}

}
