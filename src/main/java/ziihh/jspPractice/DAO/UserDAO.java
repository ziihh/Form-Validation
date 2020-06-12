package ziihh.jspPractice.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ziihh.jspPractice.Entity.User;

@Repository
public interface UserDAO extends JpaRepository<User, Integer> {

}
