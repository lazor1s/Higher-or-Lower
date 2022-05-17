package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int value = randomNumber();
    public void onClick(View view){
        EditText guess = (EditText) findViewById(R.id.editTextNumber);
        ImageView number = (ImageView)findViewById(R.id.imageViewNumber);
        //int guessValue = Integer.parseInt(String.valueOf(guess));
        String guess1 = guess.getText().toString();
        int guessValue = Integer.parseInt(guess1);
        if(guessValue > value){
            Toast.makeText(getApplicationContext(), "To High!",Toast.LENGTH_LONG ).show();
        }else if(guessValue < value){
            Toast.makeText(getApplicationContext(), "To Low",Toast.LENGTH_LONG ).show();
        } else {
            Toast.makeText(getApplicationContext(), "Nice Job!",Toast.LENGTH_LONG ).show();
            if(value == 1){
                number.setImageResource(R.drawable.one);
            }else if(value == 2) {
                number.setImageResource(R.drawable.two);
            } else if(value == 3) {
                number.setImageResource(R.drawable.three);
            }else if(value == 4) {
                number.setImageResource(R.drawable.four);
            }else if(value == 5) {
                number.setImageResource(R.drawable.five);
            }
          value =  randomNumber();
        }

//        if(value > guessValue){
//            Toast.makeText(getApplicationContext(),"Lower",Toast.LENGTH_SHORT).show();
//        }else if(value < guessValue){
//            Toast.makeText(getApplicationContext(),"higher",Toast.LENGTH_SHORT).show();
//        } else {
//            Toast.makeText(getApplicationContext(),"Correct!",Toast.LENGTH_SHORT).show();
//        }

      //  Toast.makeText(getApplicationContext(), "make your guess",Toast.LENGTH_LONG ).show();


    }

    public int randomNumber(){
        int total = new Random().nextInt(5);
        if(total == 0){
            total = total +1;
        }
        return total;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}