package com.example.inhertence;

import androidx.annotation.NonNull;

public class Car extends  vehicle {

    public  Car(int noOfTires, int speed , int howBig, boolean hasBreakingSys){

        super(noOfTires, speed, howBig, hasBreakingSys );

    }

    @NonNull
    @Override
    public String toString() {
        return String.format("%s : %d %s : %d  %s : %d %s : %b", "no. of tires in car" , getNoOfTires(), "speed pf the cat", getSpeed(),
                "how big is the car", getHowBig(), " is there breaking system", getHasBreakingSys());
    }
}
