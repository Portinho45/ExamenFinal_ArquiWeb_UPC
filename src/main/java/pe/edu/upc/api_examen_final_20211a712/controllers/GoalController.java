package pe.edu.upc.api_examen_final_20211a712.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.api_examen_final_20211a712.dtos.GoalDTO;
import pe.edu.upc.api_examen_final_20211a712.entities.Goal;
import pe.edu.upc.api_examen_final_20211a712.services.IGoalService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/goals")
public class GoalController {
    @Autowired

    private IGoalService jmpsgS;

    @PostMapping
    @PreAuthorize("hasAuthority('GERENTE')")
    public void insert(@RequestBody GoalDTO jmpsdto) {
        ModelMapper m = new ModelMapper();
        Goal jmpsg = m.map(jmpsdto, Goal.class);
        jmpsgS.insert(jmpsg);
    }

    @GetMapping
    public List<GoalDTO> list() {
        return jmpsgS.list().stream().map(x -> {
            ModelMapper jmpsm = new ModelMapper();
            return jmpsm.map(x, GoalDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public GoalDTO listId(@PathVariable("id") Integer jmpsid) {
        ModelMapper jmpsm = new ModelMapper();
        GoalDTO jmpsdto = jmpsm.map(jmpsgS.listId(jmpsid), GoalDTO.class);
        return jmpsdto;
    }
}
