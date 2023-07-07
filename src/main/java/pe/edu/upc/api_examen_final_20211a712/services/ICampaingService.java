package pe.edu.upc.api_examen_final_20211a712.services;

import pe.edu.upc.api_examen_final_20211a712.dtos.CampaingGoalDTO;
import pe.edu.upc.api_examen_final_20211a712.entities.Campaing;

import java.util.List;

public interface ICampaingService {

    public void insert(Campaing jmpscampaing);

    List<Campaing> list();
    public Campaing listId(int jmpsIdCampaing);

    public List<CampaingGoalDTO> reporte01();
}
