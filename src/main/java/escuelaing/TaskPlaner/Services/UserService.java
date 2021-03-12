package escuelaing.TaskPlaner.Services;

import java.util.List;
import org.springframework.stereotype.Service;
import escuelaing.TaskPlaner.Entities.User;

@Service
public interface UserService{     
        
        List<User> getAll();

        User getById(String userId);
        
        User create(User user);
    
        User update(User user);
        
        void remove(String userId);

}
