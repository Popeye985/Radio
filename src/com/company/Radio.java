package com.company;

public class Radio {
    private String nieuwsBericht;
    private int volume;
    public void setNieuwsBericht (String nieuwsBericht){
        this.nieuwsBericht = nieuwsBericht;
    }
    public void verhoogVolume(){
        volume++;

    }
    public void verlaagVolume(){
        volume--;
    }
    public int getVolume(){
        return volume;


    }
    public String speelNieuwsBericht(){
        if (volume == 0) return "";
        if (volume < 5) return nieuwsBericht.toLowerCase();
        return nieuwsBericht.toUpperCase();
    }
}
