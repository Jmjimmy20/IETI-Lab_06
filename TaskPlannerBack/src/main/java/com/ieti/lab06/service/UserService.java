package com.ieti.lab06.service;

import java.util.List;
import com.ieti.lab06.pojos.User;

public interface  UserService {

    List<User> getAll();
    User getById (String userId);
    User update(User user);
    User create(User user) throws Exception;
    void remove(String userId);

}
