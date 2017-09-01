package springBootTest.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;
import springBootTest.domain.User;
@Repository
public class UserDao {
	@PersistenceContext
	private EntityManager  em;
	public void insertUser(User user){
		Assert.notNull(user.getName(),"用户名不能为空！");
		Assert.notNull(user.getEmail(),"邮箱不能为空！");
		em.persist(user);
	}

}
