package com.example.firstProjekt;

//<>

import java.util.List;

public class Mann extends Mensch{
    private Boolean hatBart;
    private String autoMarke;
    private List<String> lippenStiftMarkenVorlieben;


    public Mann(Boolean hatBart, String autoMarke, List<String> vorlieben, int alter){
        this.alter = alter;
        this.hatBart = hatBart;
        this.autoMarke = autoMarke;
        this.lippenStiftMarkenVorlieben = vorlieben;
    }

    public Boolean getHatBart() {
        return hatBart;
    }

    public String getAutoMarke() {
        return autoMarke;
    }

    public List<String> getLippenStiftMarkenVorlieben() {
        return lippenStiftMarkenVorlieben;
    }

    public Boolean magFrau(Frau woman){
        if (this.lippenStiftMarkenVorlieben.contains(woman.getLippenstiftMarke())){
            return true;
        }
        else{
            return false;
        }
    }

}
