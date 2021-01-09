package com.promosite.promosite.service;

import com.promosite.promosite.model.User;
import com.promosite.promosite.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepo;

    @Override
    public User findByUsername(String username) throws Exception {
        Optional<User> userOptional = userRepo.findUserByUsername(username);

        if(userOptional.isPresent()){
            return userOptional.get();
        }
        else {
            throw new Exception("User not exists");
        }


    }

    @Override
    @Transactional
    public void register(User user) throws Exception {
        Optional<User> userOptional = userRepo.findUserByUsername(user.getUsername());

        if(userOptional.isPresent()){
            throw new Exception("User not exists");
        }

        if(user.getPassword().equals("")){
            throw new Exception("Password cannot be empty");
        }

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode(user.getPassword());
        user.setPassword(encodedPassword);

        userRepo.save(user);


    }

}
