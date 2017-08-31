package springBootTest.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import springBootTest.domain.User;
@Repository
public class UserDao {
	//@Autowired
	private SessionFactory sessionFactory;
	
	
	public void insertUser(User user){
		Assert.notNull(user.getName(),"用户名不能为空！");
		Assert.notNull(user.getEmail(),"邮箱不能为空！");
		Session session=sessionFactory.openSession();
		session.save(user);
		
	}

}
