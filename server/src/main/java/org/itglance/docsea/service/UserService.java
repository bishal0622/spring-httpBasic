package org.itglance.docsea.service;
import org.itglance.docsea.domain.User;
import org.itglance.docsea.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * Created by bishal on 5/23/17.
 */
@Service
public class UserService {

    private UserRepository userRepository;

    private SessionService sessionService;

    public UserService(UserRepository userRepository,SessionService sessionService){}

    public void saveMethod(User user){

        sessionService.createSession(user);
    }

}
