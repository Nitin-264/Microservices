package in.pwskills.nitin.rest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/v1/api/C")
public class RestControllerC {

	private static final Logger log = LoggerFactory.getLogger(RestControllerC.class);


	@GetMapping("/showC")
	public String ShowMsgC() {
		log.info("we are at service");
		return "From C";
	}
}
