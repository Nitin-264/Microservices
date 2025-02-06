package in.pwskills.nitin.consumer;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CartConsumer {

	@Autowired
	private LoadBalancerClient client;
	
	//Write a logic to consume the other service
	public String getCartService() {
		
		//ASK CLIENT TO GET THE INSTANCE WITH LOW LOAD FACTOR USING INSTANCE NAME
		ServiceInstance instance = client.choose("CART-SERVICE");
		
		// Get uri using instance
		URI uri = instance.getUri();
		
		//Taking the help of Uri create url
		String url = uri + "/v1/api/cart/show";
		
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> body =  rt.getForEntity(url, String.class);
		
		return body.getBody();
	}
}
