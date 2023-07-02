package com.example.inhertence;

import androidx.annotation.NonNull;

public class motorcycle extends  vehicle {

    public  motorcycle(int noOfTires, int speed , int howBig, boolean hasBreakingSys){

        super(noOfTires, speed, howBig, hasBreakingSys );

    }

    @NonNull
    @Override
    public String toString() {
        return String.format("%s : %d %s : %d  %s : %d %s : %b", "no. of tires in " , getNoOfTires(), "speed pf the ", getSpeed(),
                "how big is ", getHowBig(), " is there breaking system", getHasBreakingSys());
    }
}
