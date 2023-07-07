package pe.edu.upc.api_examen_final_20211a712.services;

import pe.edu.upc.api_examen_final_20211a712.entities.Goal;

import java.util.List;

public interface IGoalService {

    public void insert(Goal jmpsgoal);

    List<Goal> list();
    public Goal listId(int jmpsIdGoal);
}
