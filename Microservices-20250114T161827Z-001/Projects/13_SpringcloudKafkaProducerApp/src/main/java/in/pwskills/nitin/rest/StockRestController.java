package in.pwskills.nitin.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.pwskills.nitin.bean.StockApi;
import in.pwskills.nitin.converter.JsonUtil;
import in.pwskills.nitin.producer.ProducerService;

@RestController
@RequestMapping("/v1/api/stock")
public class StockRestController {

	@Autowired
	private ProducerService service;
	
	/***
	 * METHOD : GET
	 * INPUT  : code,cost(@RequestParam)
	 * OUTPUT : String
	 * path   : /send
	 */
	@GetMapping("/send")
	public String WriteDataInTopic(@RequestParam String code,@RequestParam Double cost){
		
		//create an object of stock api and set data
		StockApi stock = new StockApi();
		stock.setStkCode(code);
		stock.setStkCost(cost);
		
		//convert the object in json string format
		String message = JsonUtil.convertObjectToJson(stock);
		if (message!=null) {
			
			service.sendMSG(message);
			return "Succes";
			
		} else {
            return "Failure";
		}
		
	}
}
