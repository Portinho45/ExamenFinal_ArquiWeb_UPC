package pe.edu.upc.api_examen_final_20211a712.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.api_examen_final_20211a712.entities.Campaing;

import java.util.List;

@Repository
public interface CampaingRepository extends JpaRepository<Campaing, Integer> {

    @Query(value = "SELECT c.jmpsname AS nombre_campaña, c.jmpsdate_start AS dia_inicio, c.jmpschanel_marketing AS canal_marketing, g.jmpsperformance, g.jmpsname\n" +
            "FROM campaigns c\n" +
            "JOIN goals g ON c.jmpsid = g.jmpscampaing;", nativeQuery = true)
    List<String[]> obtenerGoalCampaing();
}
