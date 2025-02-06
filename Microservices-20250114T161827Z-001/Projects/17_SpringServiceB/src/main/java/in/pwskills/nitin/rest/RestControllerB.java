package in.pwskills.nitin.rest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/v1/api/B")
public class RestControllerB {

	private static final Logger log = LoggerFactory.getLogger(RestControllerB.class);

	@Autowired
	private RestTemplate rt;
	
	@GetMapping("/showB")
	public String ShowMsgB() {
		log.info("we are at service");
		String resp = rt.getForEntity("http://localhost:8083/v1/api/C/showC", String.class).getBody();
		return "From B"+resp;
	}
}
