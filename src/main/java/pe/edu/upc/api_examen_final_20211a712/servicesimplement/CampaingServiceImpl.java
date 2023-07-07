package pe.edu.upc.api_examen_final_20211a712.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.api_examen_final_20211a712.dtos.CampaingGoalDTO;
import pe.edu.upc.api_examen_final_20211a712.entities.Campaing;
import pe.edu.upc.api_examen_final_20211a712.repositories.CampaingRepository;
import pe.edu.upc.api_examen_final_20211a712.services.ICampaingService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class CampaingServiceImpl implements ICampaingService {

    @Autowired
    private CampaingRepository jmpscR;

    @Override
    public void insert(Campaing jmpscampaing) {
        jmpscR.save(jmpscampaing);
    }

    @Override
    public List<Campaing> list() {
        return jmpscR.findAll();
    }

    @Override
    public Campaing listId(int jmpsIdCampaing) {
        return jmpscR.findById(jmpsIdCampaing).orElse(new Campaing());
    }

    @Override
    public List<CampaingGoalDTO> reporte01() {
        List<String[]> obtenerGoalCampaing = jmpscR.obtenerGoalCampaing();
        List<CampaingGoalDTO> CampaingGoalDTOs = new ArrayList<>();

        for (String[] data : obtenerGoalCampaing) {
            CampaingGoalDTO dto = new CampaingGoalDTO();
            dto.setJmpsnameCampaing(data[0]);
            dto.setJmpsdateStartCampaing(LocalDate.parse(data[1]));
            dto.setJmpschanelMarketingCampaing(data[2]);
            dto.setJmpsperformanceGoal(Integer.parseInt(data[3]));
            dto.setJmpsname(data[4]);
            CampaingGoalDTOs.add(dto);
        }

        return CampaingGoalDTOs;
    }
}
