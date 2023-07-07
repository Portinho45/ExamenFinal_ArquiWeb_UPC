package pe.edu.upc.api_examen_final_20211a712.servicesimplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.api_examen_final_20211a712.entities.Role;
import pe.edu.upc.api_examen_final_20211a712.repositories.RoleRepository;
import pe.edu.upc.api_examen_final_20211a712.services.IRoleService;


@Service
public class RoleServiceImpl implements IRoleService {
	@Autowired
	private RoleRepository rR;

	@Override
	public void insert(Role role) {
		rR.save(role);
	}

	@Override
	public List<Role> list() {
		return rR.findAll();
	}
}
