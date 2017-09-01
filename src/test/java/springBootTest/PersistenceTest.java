package springBootTest;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import springBootTest.dao.UserDao;
import springBootTest.dao.UserRepository;
import springBootTest.domain.User;
import springBootTest.service.UserService;


@RunWith(SpringRunner.class)  
@SpringBootTest(webEnvironment=WebEnvironment.DEFINED_PORT)
public class PersistenceTest {
	
	@Autowired
	private UserService userService;
	
	@Test
	public void insertTest(){
		
		userService.insert();
	}
	

}
