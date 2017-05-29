package org.itglance.docsea.rest;

import org.itglance.docsea.domain.Users;
import org.itglance.docsea.repository.UserRepository;
import org.itglance.docsea.service.dto.UsersDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by bishal on 5/26/17.
 */
//@CrossOrigin
@RestController
public class UserController {
    private UserRepository userRepository;


    public UserController(UserRepository userRepository) {
        this.userRepository=userRepository;
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginOperation() {
        System.out.println("Response fro login");
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/signup")
    public ResponseEntity<?> signupOperation(@RequestBody UsersDTO usersDTO) {
        System.out.println(usersDTO);

        Users users = new Users();
        users.setName(usersDTO.getName());
        users.setPassword(usersDTO.getPassword());
        users.setEnabled(true);
        users.setRole(usersDTO.getRole());
        System.out.println(users);
        userRepository.save(users);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/testing")
    public ResponseEntity<?> testing(){
        System.out.println("TEsting for USer role");
        return new ResponseEntity<Object>("User has role USer",HttpStatus.OK);
    }

}
