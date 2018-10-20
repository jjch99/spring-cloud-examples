package org.example.spring.cloud.consumer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcController {

	private static final Log logger = LogFactory.getLog(DcController.class);

	@Autowired
	private DcProvider dcProvider;

	@GetMapping("/dc")
	public String dc() {
		String ret = dcProvider.dc() + "[consumer-feign]";
		logger.info(ret);
		return ret;
	}

}
