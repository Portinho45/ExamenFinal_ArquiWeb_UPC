package pe.edu.upc.api_examen_final_20211a712.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.api_examen_final_20211a712.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}