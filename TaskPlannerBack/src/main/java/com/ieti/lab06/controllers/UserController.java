package com.ieti.lab06.controllers;


import com.ieti.lab06.pojos.User;
import com.ieti.lab06.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/all")
    public ResponseEntity<?> getAll(){
        try{
            return new ResponseEntity<>(userService.getAll(), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("No users on database", HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> userId(@PathVariable("id")String id){
        try{
            return new ResponseEntity<>(userService.getById(id), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("No user with this id", HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<User> createUser(@RequestBody User newUser) throws Exception {
        User user = userService.create(newUser);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<User> updateUser(@RequestBody User newUser) {
        User user = userService.update(newUser);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{userId}")
    public ResponseEntity<?> deleteUserById(@PathVariable String userId) {
        userService.remove(userId);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
