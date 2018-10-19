package org.example.spring.cloud;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("SERVICE-PROVIDER")
public interface DcProvider {

	@GetMapping("/dc")
	String dc();

}
