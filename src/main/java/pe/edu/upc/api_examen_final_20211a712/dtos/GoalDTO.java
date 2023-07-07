package pe.edu.upc.api_examen_final_20211a712.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import pe.edu.upc.api_examen_final_20211a712.entities.Campaing;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class GoalDTO {

    private int jmpsid;
    private String jmpsname;
    private int jmpsperformance;
    private Campaing jmpscampaing;

    public int getJmpsid() {
        return jmpsid;
    }

    public void setJmpsid(int jmpsid) {
        this.jmpsid = jmpsid;
    }

    public String getJmpsname() {
        return jmpsname;
    }

    public void setJmpsname(String jmpsname) {
        this.jmpsname = jmpsname;
    }

    public int getJmpsperformance() {
        return jmpsperformance;
    }

    public void setJmpsperformance(int jmpsperformance) {
        this.jmpsperformance = jmpsperformance;
    }

    public Campaing getJmpscampaing() {
        return jmpscampaing;
    }

    public void setJmpscampaing(Campaing jmpscampaing) {
        this.jmpscampaing = jmpscampaing;
    }
}
