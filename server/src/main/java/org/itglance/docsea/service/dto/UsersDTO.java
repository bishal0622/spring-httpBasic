package org.itglance.docsea.service.dto;

import org.itglance.docsea.domain.Role;
import org.itglance.docsea.domain.Users;

public class UsersDTO {

    private Long id;
    private String name;
    private String password;
    private Role role;
    private Boolean enabled;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public UsersDTO(){}

    public UsersDTO(Users users){
        this(users.getId(),users.getName(),users.getPassword(),users.getRole(),users.getEnabled());
    }

    public UsersDTO(Long id, String name, String password,Role role,Boolean enabled) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.role = role;
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return "UsersDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", enabled=" + enabled +
                '}';
    }
}
