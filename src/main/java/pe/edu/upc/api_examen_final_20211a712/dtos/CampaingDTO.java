package pe.edu.upc.api_examen_final_20211a712.dtos;

import javax.persistence.Column;
import java.time.LocalDate;

public class CampaingDTO {

    private int jmpsid;
    private String jmpsname;
    private LocalDate jmpsdateStart;
    private String jmpschanelMarketing;

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
