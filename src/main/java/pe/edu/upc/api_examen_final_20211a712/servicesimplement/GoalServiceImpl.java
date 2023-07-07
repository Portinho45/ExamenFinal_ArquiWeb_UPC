package pe.edu.upc.api_examen_final_20211a712.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.api_examen_final_20211a712.entities.Goal;
import pe.edu.upc.api_examen_final_20211a712.repositories.GoalRepository;
import pe.edu.upc.api_examen_final_20211a712.services.IGoalService;

import java.util.List;

@Service
public class GoalServiceImpl implements IGoalService {

    @Autowired
    private GoalRepository jmpsgR;

    @Override
    public void insert(Goal jmpsgoal) {
        jmpsgR.save(jmpsgoal);
    }

    @Override
    public List<Goal> list() {
        return jmpsgR.findAll();
    }

    @Override
    public Goal listId(int jmpsIdGoal) {
        return jmpsgR.findById(jmpsIdGoal).orElse(new Goal());
    }
}
