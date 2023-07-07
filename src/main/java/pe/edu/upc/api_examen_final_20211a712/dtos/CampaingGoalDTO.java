package pe.edu.upc.api_examen_final_20211a712.dtos;

import java.time.LocalDate;

public class CampaingGoalDTO {

    private String jmpsnameCampaing;
    private LocalDate jmpsdateStartCampaing;
    private String jmpschanelMarketingCampaing;
    private int jmpsperformanceGoal;

    private String jmpsname;

    public CampaingGoalDTO(){

    }

    public CampaingGoalDTO(String jmpsnameCampaing, LocalDate jmpsdateStartCampaing, String jmpschanelMarketingCampaing, int jmpsperformanceGoal, String jmpsname) {
        this.jmpsnameCampaing = jmpsnameCampaing;
        this.jmpsdateStartCampaing = jmpsdateStartCampaing;
        this.jmpschanelMarketingCampaing = jmpschanelMarketingCampaing;
        this.jmpsperformanceGoal = jmpsperformanceGoal;
        this.jmpsname = jmpsname;
    }

    public String getJmpsnameCampaing() {
        return jmpsnameCampaing;
    }

    public void setJmpsnameCampaing(String jmpsnameCampaing) {
        this.jmpsnameCampaing = jmpsnameCampaing;
    }

    public LocalDate getJmpsdateStartCampaing() {
        return jmpsdateStartCampaing;
    }

    public void setJmpsdateStartCampaing(LocalDate jmpsdateStartCampaing) {
        this.jmpsdateStartCampaing = jmpsdateStartCampaing;
    }

    public String getJmpschanelMarketingCampaing() {
        return jmpschanelMarketingCampaing;
    }

    public void setJmpschanelMarketingCampaing(String jmpschanelMarketingCampaing) {
        this.jmpschanelMarketingCampaing = jmpschanelMarketingCampaing;
    }

    public int getJmpsperformanceGoal() {
        return jmpsperformanceGoal;
    }

    public void setJmpsperformanceGoal(int jmpsperformanceGoal) {
        this.jmpsperformanceGoal = jmpsperformanceGoal;
    }

    public String getJmpsname() {
        return jmpsname;
    }

    public void setJmpsname(String jmpsname) {
        this.jmpsname = jmpsname;
    }
}
