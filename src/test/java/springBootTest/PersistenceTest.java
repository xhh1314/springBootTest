package springBootTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import springBootTest.dao.UserDao;
import springBootTest.domain.User;


@RunWith(SpringRunner.class)  
@SpringBootTest(webEnvironment=WebEnvironment.MOCK)
public class PersistenceTest {
	
	@Autowired
	private UserDao userDao;
	
	@Test
	public void insertTest(){
		User user=new User();
		user.setName("lihao");
		user.setEmail("9033@qq.com");
		user.setPassword("dddd");
		userDao.insertUser(user);
		
	}
	

}
