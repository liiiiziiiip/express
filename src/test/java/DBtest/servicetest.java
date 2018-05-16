package DBtest;
import java.util.Date;
import java.util.List;







import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.buyer.model.Order;
import com.buyer.model.TimeFormat;
import com.buyer.model.TransportBill;
import com.buyer.service.EmpServiceI;
import com.buyer.service.SearchServiceI;
import com.buyer.service.TransServiceI;
import com.buyer.service.UserServiceI;

@RunWith(SpringJUnit4ClassRunner.class) // = extends SpringJUnit4ClassRunner
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class servicetest {

	private static final Logger logger = Logger.getLogger(TestMybatis.class);

	private SearchServiceI searchService;
	private EmpServiceI empservice;
	private TransServiceI ts;
	private UserServiceI ui;
	
	public void setUi(UserServiceI ui) {
		this.ui = ui;
	}
	
	@Autowired
	public void setTs(TransServiceI ts) {
		this.ts = ts;
	}
	
	@Autowired
	public void setEmpservice(EmpServiceI empservice) {
		this.empservice = empservice;
	}

	@Autowired
	public void setSearchService(SearchServiceI searchService) {
		this.searchService = searchService;
	}
	
	@Test
	public void test1() {
		String id = "1";
		TransportBill list = ts.searchById(id);
		System.out.println(list);
		logger.info(JSON.toJSONStringWithDateFormat(list, "yyyy-MM-dd HH:mm:ss"));
	}
	
	@Test
	public void test5() {
		
		List<TransportBill> list = searchService.getAll();
		System.out.println(list);
		logger.info(JSON.toJSONStringWithDateFormat(list, "yyyy-MM-dd HH:mm:ss"));
	}
	
	
	@Test
	public void test6() {
		
		List<TransportBill> list = ts.getAll();
		System.out.println(list);
		logger.info(JSON.toJSONStringWithDateFormat(list, "yyyy-MM-dd HH:mm:ss"));
	}
	
	@Test
	public void test7() {
		List<TransportBill> tb = ts.searchByRPhone("123");
		logger.info(JSON.toJSONStringWithDateFormat(tb, "yyyy-MM-dd HH:mm:ss"));
	}
	
	@Test
	public void test8() {
		TimeFormat tf = new TimeFormat();
		String time = tf.getTime();
		logger.info(JSON.toJSONStringWithDateFormat(time, "yyyy-MM-dd HH:mm:ss"));
	}
	
	@Test
	public void searchNewOrder() {
		List<Order> order = ts.searchNewOrder();
		logger.info(JSON.toJSONStringWithDateFormat(order, "yyyy-MM-dd HH:mm:ss"));
	}
	
	@Test
	public void userKind() {
		String userKind = ui.userKind("123");
		logger.info(JSON.toJSONStringWithDateFormat(userKind, "yyyy-MM-dd HH:mm:ss"));
	}
	//@Test
//	public void test2() {
//	
//		User muser = new User();
//		muser.setId(0);
//		muser.setName("aaaa");
//		muser.setAge(12);
//		muser.setSex("m");
//		int i = searchService.Insert(muser);
//		logger.info(JSON.toJSONStringWithDateFormat("add "+i, "yyyy-MM-dd HH:mm:ss"));
//	}
//	
//	//@Test
//	public void test3() {
//		
//		User muser = new User();
//		muser.setId(0);
//		muser.setName("bbbb");
//		muser.setAge(12);
//		muser.setSex("f");
//		int i = muserService.Update(muser);
//		logger.info(JSON.toJSONStringWithDateFormat("update " +i, "yyyy-MM-dd HH:mm:ss"));
//	}
//	
//	//@Test
//	public void test4() {
//		
//		User muser = new User();
//		muser.setId(0);
//		muser.setName("bbbb");
//		muser.setAge(134);
//		muser.setSex("m");
//		int i = muserService.DeletById(0);
//		logger.info(JSON.toJSONStringWithDateFormat("delete "+i, "yyyy-MM-dd HH:mm:ss"));
//	}

	
}
