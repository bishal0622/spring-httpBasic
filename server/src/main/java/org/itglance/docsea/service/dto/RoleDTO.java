package org.itglance.docsea.service.dto;

/**
 * Created by bishal on 5/28/17.
 */
public class RoleDTO {
    private Long id;
    private String name;
    private String role;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "RoleDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
