package com.postback.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/postback")
public class MainController {
	@GetMapping("adwork")
	public String testPostback(
			@RequestParam("campaign_name") String campaign_name,
			@RequestParam("leadID") String leadID,
			@RequestParam("test") String test
	) {
		String data = new StringBuilder(campaign_name).append(" || ")
				.append(leadID).append(" || ")
				.append(test).append(" || ")
				.toString();
		System.out.println(data);
		return data;
	}
}
