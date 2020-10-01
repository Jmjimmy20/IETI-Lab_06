package com.ieti.lab06.service;

import com.ieti.lab06.pojos.User;
import com.ieti.lab06.service.UserService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements  UserService{

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User getById(String userId) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public User create(User user) throws Exception {
        return null;
    }

    @Override
    public void remove(String userId) {

    }
}
