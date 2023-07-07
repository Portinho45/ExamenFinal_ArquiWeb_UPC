package pe.edu.upc.api_examen_final_20211a712.dtos;

import pe.edu.upc.api_examen_final_20211a712.entities.Role;

import java.util.List;

public class UserDTO {
    private Long id;

    private String username;

    private String password;
    private Boolean enabled;

    private List<Role> roles;
}
