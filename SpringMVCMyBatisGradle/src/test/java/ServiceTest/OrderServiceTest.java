package ServiceTest;



import java.util.List;

import org.fkit.domain.Order;
import org.fkit.service.OrderService;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import BaseTest.BaseJunitTest;


public class OrderServiceTest extends BaseJunitTest{
	 @Autowired
	    private OrderService orderService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testList() {
		List<Order> order_list = orderService.getAll();
	      System.out.println(order_list);
	}
	@Test
	public void testSelectOrder(){
		int id=1;
		Order order=orderService.selectOrder(id);
		System.out.println(order);			
	}
	@Test
	public void testUpdate(){
		String state="单元测试";
		int id=1;
		orderService.updateOrder(state, id);
		
		
	}
	
}
