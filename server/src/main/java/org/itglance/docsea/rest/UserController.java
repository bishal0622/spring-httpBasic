package org.itglance.docsea.rest;

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
//
    public UserController(UserService userService){}

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
        userService.save(userDTO);
        return new ResponseEntity<>("kei ayoo hola hai",HttpStatus.OK);
    }
}
