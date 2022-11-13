package com.example.firstProjekt;


import java.util.HashMap;

public class Frau extends Mensch {
    private String lippenstiftMarke;
    public Boolean hatExtension;

    private String lieblingsAutoMarke;

    private Boolean magMannMitBart;

    private HashMap<String, Integer> staedteLiebe = new HashMap<String, Integer>();

    // [attack1: 10, attack2: 30]

    public Frau(String lippenStiftMarke, boolean hatExtension, String autoMarke, boolean manMitBart) {
        this.alter = 14;
        this.lippenstiftMarke = lippenStiftMarke;
        this.hatExtension = hatExtension;
        this.lieblingsAutoMarke = autoMarke;
        this.magMannMitBart = manMitBart;
    }

    public Frau(String lippenstiftMarke, boolean hatExtension, String autoMarke){
        this.lippenstiftMarke = lippenstiftMarke;
        this.hatExtension = hatExtension;
        this.lieblingsAutoMarke = autoMarke;
    }

    public void putSteadteLiebeWert(String key, Integer value){
        staedteLiebe.put(key, value);
    }

    public int getSteadteLiebeWert(String key){
        return staedteLiebe.get(key);
    }

    public String getLippenstiftMarke() {
        return lippenstiftMarke;
    }

    public Boolean magMann(Mann man){
        if(this.lieblingsAutoMarke == man.getAutoMarke() && this.magMannMitBart == man.getHatBart()){
            return true;
        }
        else{
        return false;
    }
    }

}
