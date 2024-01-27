package com.perico.apiOracle.Controllers;

import org.springframework.web.bind.annotation.RestController;

import com.perico.apiOracle.classes.User;
import com.perico.apiOracle.classes.UserLoginPetition;
import com.perico.apiOracle.classes.UserPetition;
import com.perico.apiOracle.classes.UserRenamePetition;
import com.perico.apiOracle.repositories.UserRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController

public class MainController {

    private final UserRepository userRepository;

    public MainController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    // post register
    @PostMapping("/register")
    public  String Register(@RequestBody UserPetition userPetition) {
        User user = User.builder()
            .name(userPetition.getName())
            .email(userPetition.getEmail())
            .password(userPetition.getPassword())
            .build();

        userRepository.save(user);

        return "User created";
    }
    

    @PostMapping("/login")
    public String postMethodName(@RequestBody  UserLoginPetition userLoginPetition) {
        User user = userRepository.findByEmailAndPassword(userLoginPetition.getEmail(), userLoginPetition.getPassword());
        return user.toString();
        
    }

    @PostMapping("/rename")
    public String postMethodName(@RequestBody  UserRenamePetition userRenamePetition) {

        User user = userRepository.findById(userRenamePetition.getId()).get();
        user.setName(userRenamePetition.getName());
        userRepository.save(user);
        return "User renamed";

        
    }
    
    
    
}
