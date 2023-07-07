package pe.edu.upc.api_examen_final_20211a712.servicesimplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.api_examen_final_20211a712.entities.Users;
import pe.edu.upc.api_examen_final_20211a712.repositories.UserRepository;
import pe.edu.upc.api_examen_final_20211a712.services.IUserService;


@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserRepository uR;

	@Override
	public Integer insert(Users user) {
		int rpta = uR.buscarUsername(user.getUsername());
		if (rpta == 0) {
			uR.save(user);
		}
		return rpta;
	}

	@Override
	public List<Users> list() {
		return uR.findAll();
	}
}
