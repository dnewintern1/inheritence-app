package com.example.inhertence;

import static android.icu.text.Normalizer.NO;

import androidx.annotation.NonNull;

public class vehicle {

    private int noOfTires;
    private int speed;
    private int howBig;
    private boolean hasBreakingSys;

    private int ridespeed;

    public vehicle( int noOfTires, int speed , int howBig, boolean hasBreakingSys) {
        this.noOfTires = noOfTires;
        this.speed = speed;
        this.howBig= howBig;
        this.hasBreakingSys= hasBreakingSys;
    }

    public void ride(){
        int result = noOfTires * speed;
     ridespeed = result;
    }


    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHowBig() {
        return howBig;
    }

    public void setHowBig(int howBig) {
        this.howBig = howBig;
    }

    public boolean getHasBreakingSys() {
        return hasBreakingSys;
    }


    public int getRidespeed() {
        return ridespeed;
    }

    public void setRidespeed(int ridespeed) {
        this.ridespeed = ridespeed;
    }

    @NonNull
    @Override
    public String toString() {
        return String.format(" %s : %d %s : %d %s : %d %s : %b  %s : %d " ,
                "number of tires" , getNoOfTires(), "speed",  getSpeed() , "how big", getHowBig(), " has breaknig sys", getHasBreakingSys() , "my ride speed", getRidespeed());

    }
}
