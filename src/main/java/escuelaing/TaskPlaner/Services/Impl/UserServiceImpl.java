package escuelaing.TaskPlaner.Services.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import escuelaing.TaskPlaner.Entities.User;
import escuelaing.TaskPlaner.Services.UserService;

@Service
public class UserServiceImpl implements UserService{


        List<User> users = new ArrayList<User>();

        
        public  UserServiceImpl(){
                users.add(new User("1","diego","diego@mail.com","123456"));
                users.add(new User("2","david","david@mail.com","123456"));
                users.add(new User("3","carol","carol@mail.com","123456"));
        }

        
        @Override
        public List<User> getAll() {
                return users;
        }

        @Override
        public User getById(String userId) {
                User user = null;
                for(User i: users){
                        if(i.getId().equals(userId)){
                                user=i;
                                break;
                        }
                }
                return user;
        }

        @Override
        public User create(User user) {
                users.add(user);
                return user;
        }

        @Override
        public User update(User user) {
                User userT;
                userT=user;
                users.removeIf(i -> (user.getId().equals(i.getId())));
                users.add(userT);
                return null;
        }

        @Override
        public void remove(String userId) {
                users.removeIf(i -> (userId.equals(i.getId())));
                
        }

        

}

