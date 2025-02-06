package in.pwskills.nitin.rest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/v1/api/A")
public class RestControllerA {

	private static final Logger log = LoggerFactory.getLogger(RestControllerA.class);

	@Autowired
	private RestTemplate rt;
	
	@GetMapping("/showA")
	public String ShowMsgA() {
		log.info("we are at service");
		String resp = rt.getForEntity("http://localhost:8082/v1/api/B/showB", String.class).getBody();
		return "From A"+resp;
	}
}
