package com.example.register_login.player;

public class Player {

    private String pName;
    private String pClass;
    private String pGender;

    private int pHealth;
    private int pDamage;
    private int pDefense;

    public Player(String pName, String pClass, String pGender) {
        this.pName = pName;
        this.pClass = pClass;
        this.pGender = pGender;
        this.pHealth = 1;
        this.pDamage = 1;
        this.pDefense = 1;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpClass() {
        return pClass;
    }

    public void setpClass(String pClass) {
        this.pClass = pClass;
    }

    public String getpGender() {
        return pGender;
    }

    public void setpGender(String pGender) {
        this.pGender = pGender;
    }

    public int getpHealth() {
        return pHealth;
    }

    public void setpHealth(int pHealth) {
        this.pHealth = pHealth;
    }

    public int getpDamage() {
        return pDamage;
    }

    public void setpDamage(int pDamage) {
        this.pDamage = pDamage;
    }

    public int getpDefense() {
        return pDefense;
    }

    public void setpDefense(int pDefense) {
        this.pDefense = pDefense;
    }

    @Override
    public String toString() {
        return "Player{" +
                "pName='" + pName + '\'' +
                ", pClass='" + pClass + '\'' +
                ", pGender='" + pGender + '\'' +
                ", pHealth=" + pHealth +
                ", pDamage=" + pDamage +
                ", pDefense=" + pDefense +
                '}';
    }
}
