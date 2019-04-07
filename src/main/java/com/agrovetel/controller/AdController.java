package com.agrovetel.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.agrovetel.domain.Ad;
import com.agrovetel.service.AdService;

@Controller
public class AdController {
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private AdService adService;
	
	@GetMapping("/ads")
	public List<Ad> displayAllAds() {
		List<Ad> allAds = adService.findAll();
		//List<Ad> allAdsByCategory = adService.findAllByCategory((long) 1);
		//List<Ad> allAdsByUser = adService.findAllByUser((long)1);
		//log.info("" + allAdsByUser.get(0).getTitle());
		//log.info("" + allAds.size());
		//log.info("" + allAdsByCategory.get(0).getTitle());
		return allAds;
	}

}
