package org.example.spring.cloud.eureka;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("EUREKA-PROVIDER")
public interface DcProvider {

	@GetMapping("/dc")
	String dc();

}
