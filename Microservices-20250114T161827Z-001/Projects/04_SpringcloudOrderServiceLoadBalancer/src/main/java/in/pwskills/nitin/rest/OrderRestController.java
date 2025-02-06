package in.pwskills.nitin.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.pwskills.nitin.consumer.CartConsumer;

@RestController
@RequestMapping("/v1/api/order")
public class OrderRestController {

	@Autowired
	private CartConsumer consumer;
	
	/*
	 * METHOD  : GET
	 * PATH    : /place
	 * OUTPUT  : R.E<String>
	 * URL     : /v1/api/order/place
	 * 
	 */
	@GetMapping("/place")
	private ResponseEntity<String> placeorder(){
		String cartResponse = consumer.getCartService();
		return ResponseEntity.ok("OREDE PLACED WITH =>"+cartResponse);
	}
}
