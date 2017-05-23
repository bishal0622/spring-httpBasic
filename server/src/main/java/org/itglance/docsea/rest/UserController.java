package org.itglance.docsea.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bishal on 5/21/17.
 */


@CrossOrigin
@RestController
public class UserController {

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
}
