package in.pwskills.nitin.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pwskills.nitin.bean.StockApi;

public interface IStockRepositry extends JpaRepository<StockApi, Integer> {

}
