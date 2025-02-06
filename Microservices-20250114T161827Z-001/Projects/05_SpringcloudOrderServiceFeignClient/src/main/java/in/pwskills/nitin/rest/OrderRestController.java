package in.pwskills.nitin.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.pwskills.nitin.consumer.ICartConsumer;
import in.pwskills.nitin.response.Cart;

@RestController
@RequestMapping("/v1/api/order")
public class OrderRestController {

	@Value("${server.port}")
	private String portNo;
	

	@Autowired
	private ICartConsumer consumer;
	
	/*
	 * METHOD  : GET
	 * PATH    : /place
	 * OUTPUT  : R.E<String>
	 * URL     : /v1/api/order/place
	 * 
	 */
	@GetMapping("/place")
	public ResponseEntity<String> placeorder(){
		String body = consumer.getCartService().getBody();
		
		return ResponseEntity.ok("ORDER PLACED=>"+body);
	}
	
	/*
	 * METHOD  : GET
	 * PATH    : /fetch
	 * OUTPUT  : R.E<String>
	 * URL     : /v1/api/order/fetch
	 * 
	 */
	@GetMapping("/fetch/{id}")
	public ResponseEntity<String> fetchOrderWithCart(@PathVariable Integer id){
		
		String cob = consumer.getCartById(id).getBody();
		return ResponseEntity.ok("Server port no. of order is"+portNo+"Oredr with cart data::"+cob);
	}
	

	/*
	 * METHOD  : POST
	 * PATH    : /addToCart
	 * OUTPUT  : R.E<String>
	 * URL     : /v1/api/order/addToCart
	 * 
	 */
	@PostMapping("/addToCart")
	public ResponseEntity<String> addToCart(@RequestBody Cart cart){
		
		String cartResponse = null;
		cartResponse = consumer.addToCart(cart).getBody();
		
		return ResponseEntity.ok("ORDER WITH::"+cartResponse);
	}
}
