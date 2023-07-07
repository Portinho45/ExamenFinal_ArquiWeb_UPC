package pe.edu.upc.api_examen_final_20211a712.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "campaigns")
public class Campaing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int jmpsid;
    @Column(name = "jmpsname", length = 60, nullable = false)
    private String jmpsname;
    @Column(name = "jmpsdateStart", length = 60, nullable = false)
    private LocalDate jmpsdateStart;
    @Column(name = "jmpschanelMarketing", length = 60, nullable = false)
    private String jmpschanelMarketing;

    public Campaing(){

    }

    public Campaing(int jmpsid, String jmpsname, LocalDate jmpsdateStart, String jmpschanelMarketing) {
        this.jmpsid = jmpsid;
        this.jmpsname = jmpsname;
        this.jmpsdateStart = jmpsdateStart;
        this.jmpschanelMarketing = jmpschanelMarketing;
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

    public LocalDate getJmpsdateStart() {
        return jmpsdateStart;
    }

    public void setJmpsdateStart(LocalDate jmpsdateStart) {
        this.jmpsdateStart = jmpsdateStart;
    }

    public String getJmpschanelMarketing() {
        return jmpschanelMarketing;
    }

    public void setJmpschanelMarketing(String jmpschanelMarketing) {
        this.jmpschanelMarketing = jmpschanelMarketing;
    }
}
