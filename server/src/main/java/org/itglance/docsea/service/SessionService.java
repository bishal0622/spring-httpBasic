package org.itglance.docsea.service;

import org.apache.tomcat.util.codec.binary.Base64;
import org.itglance.docsea.domain.Session;
import org.itglance.docsea.domain.User;
import org.itglance.docsea.repository.SessionRepository;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by bishal on 5/24/17.
 */
@Service
public class SessionService {

    private SessionRepository sessionRepository;

    public SessionService(SessionRepository sessionRepository) {
    }

    private static Map<String, Session> sessions = new ConcurrentHashMap<>();

    public Session checkSession(String auth){
        //Base64 token decode
        byte[] valueDecoded= Base64.decodeBase64(auth);
        System.out.println("Decoded value is " + new String(valueDecoded));

        String loginCredential = new String(valueDecoded);

        String[] separation = loginCredential.split("-");

        String token = separation[0];

        if(sessions.containsKey(token)){
          return sessions.get(token);
        }else {
            return null;
        }
    }

    public Session createSession(User user){
        System.out.println("create session bhitra");
        System.out.println(user.toString());
        String token = UUID.randomUUID().toString();
        Session session = new Session();
        session.setToken(token);
        session.setUserId(user.getId().toString());
        session.setUsertype(user.getUserType());

        sessions.put(token,session);
        sessionRepository.save(session);
        return session;
    }


    public void removeSession(){
            sessions.clear();
    }
}
