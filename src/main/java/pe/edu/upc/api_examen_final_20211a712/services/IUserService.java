package pe.edu.upc.api_examen_final_20211a712.services;

import java.util.List;

import pe.edu.upc.api_examen_final_20211a712.entities.Users;


public interface IUserService {
	public Integer insert(Users user);

	List<Users> list();

}
