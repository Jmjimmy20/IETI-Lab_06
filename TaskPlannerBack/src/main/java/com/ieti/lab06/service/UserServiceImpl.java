package com.ieti.lab06.service;

import com.ieti.lab06.persistence.PlannerPersistence;
import com.ieti.lab06.pojos.User;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements  UserService{


    private PlannerPersistence persistence = new PlannerPersistence();

    @Override
    public List<User> getAll() {
        return persistence.getAllUsers();
    }

    @Override
    public User getById(String userId) {
        return persistence.getUserById(userId);
    }

    @Override
    public User update(User user) {;
        return persistence.updateUser(user);
    }

    @Override
    public User create(User user) throws Exception {
        return persistence.createUser(user);
    }

    @Override
    public void remove(String userId) {
        persistence.removeUser(userId);
    }
}
