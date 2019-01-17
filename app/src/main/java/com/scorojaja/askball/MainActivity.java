package com.scorojaja.askball;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends Activity {



    final  int ballArray[] = new int[]{
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void askQuestion (View v) {
        ImageView ballDisplay = findViewById(R.id.image_eightBall);
        Random randomNumber  = new Random();
        int number = randomNumber.nextInt(5);

        ballDisplay.setImageResource(ballArray[number]);
    }
}
