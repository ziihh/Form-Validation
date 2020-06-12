package ziihh.jspPractice.Service;
import ziihh.jspPractice.DAO.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ziihh.jspPractice.Entity.User;

import javax.validation.ConstraintViolationException;
import java.util.List;

@Service
public class IndexService {

    @Autowired
    UserDAO userDAO;


    public boolean insertUser(User user) {
       User temp = userDAO.save(user);

       if(temp == null) {
           return false;
       }

       return true;
    }

    public List<User> showAllUsers(){
        return userDAO.findAll();
    }
}
