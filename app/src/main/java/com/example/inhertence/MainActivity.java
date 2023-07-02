package com.example.inhertence;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView myFirsttxt = findViewById(R.id.txtvehicle);
        TextView myCartxt = findViewById(R.id.txtcar);
        TextView mymotortxt = findViewById(R.id.txtmotorcycle);

        Button mybutton = findViewById(R.id.btnresult);


        vehicle myvehicle = new vehicle(6,41,30,true);

        myvehicle.ride();




        Car myCar = new Car(4,58,60,true);

        myCar.ride();



        motorcycle mymotor = new motorcycle(9,6,78,true);

        mymotor.ride();





                mybutton.setOnClickListener( new View.OnClickListener(){
                   @Override
                           public void onClick(View v) {

                       mybutton.setText(" button clicked");
                       myFirsttxt.setText(myvehicle.toString());
                       myCartxt.setText(myCar.toString());

                       mymotortxt.setText(mymotor.toString());


























                   }









                                                   }


        );



    }
}