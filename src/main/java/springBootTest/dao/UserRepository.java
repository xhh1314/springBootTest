package springBootTest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import springBootTest.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
