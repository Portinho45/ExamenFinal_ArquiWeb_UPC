package pe.edu.upc.api_examen_final_20211a712.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.api_examen_final_20211a712.dtos.CampaingDTO;
import pe.edu.upc.api_examen_final_20211a712.dtos.CampaingGoalDTO;
import pe.edu.upc.api_examen_final_20211a712.entities.Campaing;
import pe.edu.upc.api_examen_final_20211a712.services.ICampaingService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/campaigns")
public class CampaingController {

    @Autowired
    private ICampaingService jmpscS;

    @PostMapping
    @PreAuthorize("hasAuthority('ESPECIALISTA')")
    public void insert(@RequestBody CampaingDTO jmpsdto) {
        ModelMapper jmpsm = new ModelMapper();
        Campaing jmpsc = jmpsm.map(jmpsdto, Campaing.class);
        jmpscS.insert(jmpsc);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('GERENTE')")
    public List<CampaingDTO> list() {
        return jmpscS.list().stream().map(x -> {
            ModelMapper jmpsm = new ModelMapper();
            return jmpsm.map(x, CampaingDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public CampaingDTO listId(@PathVariable("id") Integer jmpsid) {
        ModelMapper jmpsm = new ModelMapper();
        CampaingDTO jmpsdto = jmpsm.map(jmpscS.listId(jmpsid), CampaingDTO.class);
        return jmpsdto;
    }

    @GetMapping("/")
    @PreAuthorize("hasAuthority('GERENTE')")
    public List<CampaingGoalDTO> obtenerGoalCampaing() {
        List<CampaingGoalDTO> CampaingGoalDTO = jmpscS.reporte01();
        return CampaingGoalDTO;
    }
}
