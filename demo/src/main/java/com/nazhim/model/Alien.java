package com.nazhim.model;

public class Alien {

    private int aid;
    private String aName;

    public Alien(int aid, String aName) {
        this.aid = aid;
        this.aName = aName;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aName='" + aName + '\'' +
                '}';
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

}
