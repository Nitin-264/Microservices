package in.pwskills.nitin.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.pwskills.nitin.bean.StockApi;

public class JsonUtil {

	public static StockApi convertJsonToObject(String msg) {
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.readValue(msg, StockApi.class);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
