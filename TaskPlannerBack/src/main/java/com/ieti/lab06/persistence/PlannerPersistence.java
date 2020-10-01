package com.ieti.lab06.persistence;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ieti.lab06.pojos.User;


public class PlannerPersistence {

    private List<User> usersArray = new ArrayList<User>();

    public PlannerPersistence(){
        User usr1 = new User("1","jm@mail.com","Jm","Jimmy");
        User usr2 = new User("2","An@mail.com","An","Ana");
        User usr3 = new User("3","Cr@mail.com","Cr","Caro");
        User usr4 = new User("4","Kt@mail.com","Kt","Katrin");
        User usr5 = new User("5","js@mail.com","Js","Jessi");
        usersArray = Arrays.asList(usr1,usr2,usr3,usr4,usr5);
    }

    public List<User> getAllUsers(){
        return usersArray;
    }

    public User getUserById(String userId) {
        for (User usr : usersArray) {
            if (usr.getId().equals(userId)) {
                return usr;
            }
        }
        return null;
    }

    public User createUser(User user) throws Exception {
        for (User usr : usersArray) {
            if( usr.getId().equals(user.getId())){
                throw new Exception("Id User already exist !");
            }else{
                usersArray.add(user);
            }
        }
        return user;
    }

    public User updateUser(User user) {
        for (User usr : usersArray) {
            if( usr.getId().equals(user.getId())){
                usr.setEmail(user.getEmail());
                usr.setName(user.getName());
            }
        }
        return user;
    }

    public void removeUser(String userId) {
        for (User usr : usersArray) {
            if( usr.getId().equals(userId)){
                usersArray.remove(usr);
            }
        }
    }
    

}
