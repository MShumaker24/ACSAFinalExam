package com.example.android.acsafinalexam;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int gearNumber = 0;
    int ballNumber = 0;
    int totalScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //displays the total score for the team
    public void displayScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.totalTextView);
        scoreView.setText(String.valueOf(score));
    }

    //displays the total number of gears scored
    public void displayGearNumber(int number) {
        TextView scoreView = (TextView) findViewById(R.id.gearScore);
        scoreView.setText(String.valueOf(number));
    }

    //displays the total number of balls scored
    public void displayBallNumber(int number) {
        TextView scoreView = (TextView) findViewById(R.id.ballScore);
        scoreView.setText(String.valueOf(number));
    }

    //changes the color of the robot name text depending on the alliance color
    public void allianceCheckRed(View view) {
        CheckBox redCheckbox = findViewById(R.id.redCheckBox);
        TextView robotName = findViewById(R.id.nameTextView);
        if (redCheckbox.isChecked()) {
            robotName.setTextColor(Color.RED);
        } else {
            robotName.setTextColor(Color.BLACK);
        }
    }

    public void allianceCheckBlue(View view) {
        CheckBox blueCheckbox = findViewById(R.id.blueCheckbox);
        TextView robotName = findViewById(R.id.nameTextView);
        if (blueCheckbox.isChecked()) {
            robotName.setTextColor(Color.BLUE);
        } else {
            robotName.setTextColor(Color.BLACK);
        }
    }

    //increases the number of gears and changes the score
    public void gearScoreUp(View view) {
        totalScore = totalScore + 15;
        gearNumber = gearNumber + 1;
        displayScore(totalScore);
        displayGearNumber(gearNumber);
    }

    //decreases the number of gears and changes the score
    public void gearScoreDown(View view) {
        totalScore = totalScore - 15;
        gearNumber = gearNumber - 1;
        displayScore(totalScore);
        displayGearNumber(gearNumber);
    }

    //decreases the number of balls and changes the score
    public void ballScoreDown(View view) {
        totalScore = (ballNumber - 1)/3;
        ballNumber = ballNumber - 1;
        displayScore(totalScore);
        displayBallNumber(ballNumber);
    }

    //increases the number of balls and changes the score
    public void ballScoreUp(View view) {
        totalScore = (ballNumber + 1)/3;
        ballNumber = ballNumber + 1;
        displayScore(totalScore);
        displayBallNumber(ballNumber);
    }

    //adds 30 points to the score if the robot has climbed
    public void hasClimbed(View view) {
        CheckBox climbCheckbox = findViewById(R.id.climbCheckBox);
        if (climbCheckbox.isChecked()) {
            totalScore = totalScore + 30;
            displayScore(totalScore);
        }
        else {
            totalScore = totalScore - 30;
            displayScore(totalScore);
        }
    }
}