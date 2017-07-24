package ServiceTest;
import java.util.List;

import org.fkit.domain.Good;
import org.fkit.service.GoodService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import BaseTest.BaseJunitTest;

public class GoodServiceTest extends BaseJunitTest{
	@Autowired
    private GoodService goodService;

	@Test
	public void testList(){
		List<Good> good_list=goodService.getAll();
		System.out.println(good_list);
	}
	@Test
	public void testAdd(){
		Good good=new Good();
		good.setCount(10);
		good.setImage("image1");
		good.setName("name");
		good.setParent_category_sn("2");
		goodService.add(good);
		System.out.println(good);
		
	}
	@Test
	public void testSelect(){
		int id=1;
		Good good=goodService.selectGood(id);
		System.out.println(good);
	}
}
