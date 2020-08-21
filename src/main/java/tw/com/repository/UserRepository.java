package tw.com.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tw.com.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	List<User> findByEmail(String email);

	void deleteByEmail(String email);

	List<User> findByName(String name);
}
