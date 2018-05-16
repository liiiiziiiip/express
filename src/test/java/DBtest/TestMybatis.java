package DBtest;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.buyer.model.User;
import com.buyer.service.UserServiceI;

@RunWith(SpringJUnit4ClassRunner.class) // = extends SpringJUnit4ClassRunner
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class TestMybatis {

	private static final Logger logger = Logger.getLogger(TestMybatis.class);

	private UserServiceI muserService;

	public UserServiceI getMuserService() {
		return muserService;
	}

	@Autowired
	public void setMuserService(UserServiceI muserService) {
		this.muserService = muserService;
	}
	
	@Test
	public void test1() {
		
		List<User> list = muserService.getAll();
		logger.info(JSON.toJSONStringWithDateFormat(list, "yyyy-MM-dd HH:mm:ss"));
	}
	
	//@Test
	public void test2() {
	
		User muser = new User();
		muser.setId("0");
		muser.setName("aaaa");
		muser.setName("12");
		muser.setPw("m");
		int i = muserService.Insert(muser);
		logger.info(JSON.toJSONStringWithDateFormat("add "+i, "yyyy-MM-dd HH:mm:ss"));
	}
	
//	//@Test
//	public void test3() {
//		
//		User muser = new User();
//		muser.setId(0);
//		muser.setName("bbbb");
//		muser.setName(12);
//		muser.setPw("f");
//		int i = muserService.Update(muser);
//		logger.info(JSON.toJSONStringWithDateFormat("update " +i, "yyyy-MM-dd HH:mm:ss"));
//	}
	
//	//@Test
//	public void test4() {
//		
//		User muser = new User();
//		muser.setId(0);
//		muser.setName("bbbb");
//		muser.setName(134);
//		muser.setPw("m");
//		int i = muserService.DeletById(0);
//		logger.info(JSON.toJSONStringWithDateFormat("delete "+i, "yyyy-MM-dd HH:mm:ss"));
//	}
	
}
