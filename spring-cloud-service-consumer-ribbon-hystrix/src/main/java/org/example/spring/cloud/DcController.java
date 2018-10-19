package org.example.spring.cloud;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class DcController {

	private static final Log logger = LogFactory.getLog(DcController.class);

	@Autowired
	ConsumerService consumerService;

	@GetMapping("/dc")
	public String dc() {
		return consumerService.dc();
	}

	@Component
	class ConsumerService {

		@Autowired
		RestTemplate restTemplate;

		@HystrixCommand(fallbackMethod = "fallback")
		public String dc() {
			return restTemplate.getForObject("http://SERVICE-PROVIDER/dc", String.class);
		}

		public String fallback() {
			logger.info("fallback");
			return "fallback";
		}

	}

}
