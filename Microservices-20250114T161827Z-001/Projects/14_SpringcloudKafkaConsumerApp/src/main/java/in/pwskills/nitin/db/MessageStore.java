package in.pwskills.nitin.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.pwskills.nitin.bean.StockApi;
import in.pwskills.nitin.converter.JsonUtil;
import in.pwskills.nitin.repositry.IStockRepositry;

@Component
public class MessageStore {

	@Autowired
	private IStockRepositry repo;
	
	public void add(String msg) {
		//JSon to object
		StockApi stock = JsonUtil.convertJsonToObject(msg);
		repo.save(stock);
	}
	
	public List<StockApi> getAll(){
		return repo.findAll();
	}
}
