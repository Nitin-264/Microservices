package in.pwskills.nitin.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.pwskills.nitin.bean.StockApi;

public class JsonUtil {

	public static String convertObjectToJson(StockApi stock) {
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writeValueAsString(stock);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
