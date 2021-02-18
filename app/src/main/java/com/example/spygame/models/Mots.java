package com.example.spygame.models;

public class Mots {
    private String mot1;
    private String mot2;

    public Mots() {

    }

    public String getMot1() {
        return mot1;
    }

    public void setMot1(String mot1) {
        this.mot1 = mot1;
    }

    public String getMot2() {
        return mot2;
    }

    public void setMot2(String mot2) {
        this.mot2 = mot2;
    }

    public Mots(String mot1, String mot2){
        this.mot1 = mot1;
        this.mot2 = mot2;

    }

}
