package org.itglance.docsea.service.dto;

import org.itglance.docsea.domain.User;


/**
 * Created by bishal on 5/23/17.
 */
public class UserDTO {
    private Long id;
    private String name;
    private String password;
    private Integer userType;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public Integer getUserType() {
        return userType;
    }

    public UserDTO() {
    }

    public UserDTO(Long id, String name, String password, Integer userType) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.userType = userType;
    }

    public UserDTO(User user){
        this(user.getId(),user.getName(),user.getPassword(),user.getUserType());
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", userType=" + userType +
                '}';
    }
}
