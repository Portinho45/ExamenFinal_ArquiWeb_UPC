package pe.edu.upc.api_examen_final_20211a712.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "goals")
public class Goal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int jmpsid;
    @Column(name = "jmpsname", length = 60, nullable = false)
    private String jmpsname;
    @Column(name = "jmpsperformance", length = 60, nullable = false)
    private int jmpsperformance;
    @ManyToOne
    @JoinColumn(name = "jmpscampaing", nullable = false)
    @JsonIgnore
    private Campaing jmpscampaing;

    public Goal(){

    }

    public Goal(int jmpsid, String jmpsname, int jmpsperformance, Campaing jmpscampaing) {
        this.jmpsid = jmpsid;
        this.jmpsname = jmpsname;
        this.jmpsperformance = jmpsperformance;
        this.jmpscampaing = jmpscampaing;
    }

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
