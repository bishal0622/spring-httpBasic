package org.itglance.docsea.rest;

import org.itglance.docsea.domain.User;
import org.itglance.docsea.repository.UserRepository;
import org.itglance.docsea.service.UserService;
import org.itglance.docsea.service.dto.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by bishal on 5/21/17.
 */


@CrossOrigin
@RestController
public class UserController {

    private UserService userService;
    private UserRepository userRepository;
//
    public UserController(UserService userService,UserRepository userRepository){}

    @PostMapping("/api")
    public ResponseEntity<?> abc(){
        System.out.println("logged in");
        return new ResponseEntity<>("response ayo re",HttpStatus.OK);
    }

    @GetMapping("/login")
    public ResponseEntity<?> cde(){
        System.out.println("chalyo re chalyo");
        return new ResponseEntity<>("next link",HttpStatus.OK);
    }

    @PostMapping("/signUps")
    public ResponseEntity<?> RegisterUser(@RequestBody UserDTO userDTO){
        System.out.println("signup controller");
        User user = new User();
        user.setName(userDTO.getName());
        user.setPassword(userDTO.getPassword());
        user.setUserType(userDTO.getUserType());
        userRepository.save(user);
        return new ResponseEntity<>("kei ayoo hola hai",HttpStatus.OK);
    }
}
