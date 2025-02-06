package in.pwskills.nitin.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class FetchLatestDataFromProps {

	@Scheduled(cron = "10 * * * * *")
	public void fetch() {
		HttpHeaders headres = new HttpHeaders();
		headres.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<String> entity = new HttpEntity<String>("{}",headres);
		
		RestTemplate rt = new RestTemplate();
		String output = rt.postForEntity("http://localhost:9990/actuator/refresh", 
				                          entity,
				                          String.class)
				                           .getBody();
		
		System.out.println(output);
	}
}
