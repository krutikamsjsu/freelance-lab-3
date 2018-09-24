package com.service;

import com.entity.User;
import com.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }

    public void addUser(User user){
    	List<User> list = userRepository.findByEmail_idAndPassword(user.getEmail_id(), user.getPassword()); 	
        if (list.size() == 0 ) {           
        	userRepository.save(user);
        }
    }

    public List<User> login(String email,String password){
        return userRepository.findByEmail_idAndPassword(email,password);
    }
    
    public User getUser(String email){
        return userRepository.findByEmail_id(email);
    }
    
    public User updateUser(User user){
        return userRepository.save(user);
    }
}