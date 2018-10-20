package org.example.spring.cloud.consumer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DcController {

	private final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private LoadBalancerClient loadBalancerClient;

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/dc")
	public String dc() {
		ServiceInstance instance = loadBalancerClient.choose("SERVICE-PROVIDER");
		String url = instance.getUri() + "/dc";
		logger.info(url);
		return restTemplate.getForObject(url, String.class) + "[consumer]";
	}

}
