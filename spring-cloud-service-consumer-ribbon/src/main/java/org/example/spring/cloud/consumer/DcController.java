package org.example.spring.cloud.consumer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DcController {

	private static final Log logger = LogFactory.getLog(DcController.class);

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/dc")
	public String dc() {
		String url = "http://SERVICE-PROVIDER/dc";
		logger.info(url);
		return restTemplate.getForObject(url, String.class) + "[consumer-ribbon]";
	}

}
