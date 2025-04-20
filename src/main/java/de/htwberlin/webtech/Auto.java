package de.htwberlin.webtech;

public class Auto {
    private String name;
    private String affiliation;
    private int Baujahr;

    public Auto(String name, String affiliation, int Baujahr){
        this.name = name;
        this.affiliation = affiliation;
        this.Baujahr = Baujahr;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }

    public String getAffiliation(){
        return affiliation;
    }

    public void setAffiliation(){
        this.affiliation = affiliation;
    }

    public int getBaujahr(){
        return Baujahr;
    }

    public void setBaujahr(){
        this.Baujahr = Baujahr;
    }

}
