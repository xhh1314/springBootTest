package springBootTest.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBootTest.dao.UserDao;
import springBootTest.dao.UserRepository;
import springBootTest.domain.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private UserRepository userRepository;
	@Transactional
	public void insert(){
		User user1=new User();
		user1.setName("lihao");
		user1.setEmail("9033@qq.com");
		user1.setPassword("dddd");
		//userRepository.save(user1);
		userDao.insertUser(user1);
		User user2=new User();
		user2.setName("lihao2");
		user2.setEmail("9033@qq.com2");
		user2.setPassword("dddd2");
		//int i=1/0;
		userDao.insertUser(user2);
		//userRepository.save(user2);
	}
	

}
