package pe.edu.upc.api_examen_final_20211a712.services;

import pe.edu.upc.api_examen_final_20211a712.entities.Role;

import java.util.List;



public interface IRoleService {
	public void insert(Role role);

	List<Role> list();

}
