package in.pwskills.nitin.consumer;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class CartConsumer {

	@Autowired
	private DiscoveryClient client;
	
	//write a logic to consume to other service
	public String getService() {
		
	    //GET THE DETAILS BASED ON SERVICE NAME
		List<ServiceInstance> list = client.getInstances("CART-SERVICE");
		
		//GET THE DETAILS OF 0th INDEX
		ServiceInstance instance = list.get(0);
		
		//BASED ON THE INSTANCE GET THE URI
		URI uri = instance.getUri();
		
		//TAKE THE HELP OF URI AND CREATE URL
		String url = uri+"/v1/api/cart/show";
		
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> responseentity= rt.getForEntity(url, String.class);
		
		return responseentity.getBody();
		
	}
	
}
