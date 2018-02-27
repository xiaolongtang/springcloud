package dk.itu.user.service;

import dk.itu.user.entity.User;
import dk.itu.user.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepo userRepo;

    @Override
    public User getUserById(int id) {
        return userRepo.findOne(id);
    }
}
