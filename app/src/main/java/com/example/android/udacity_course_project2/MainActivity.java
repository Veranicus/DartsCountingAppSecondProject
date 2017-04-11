package com.example.android.udacity_course_project2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

/*
   Global declaration of both scores for shooter 1 and shooter 2
   */
public class MainActivity extends AppCompatActivity {
    int scoreofShooter1 = 0;
    int scoreofShooter2 = 0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
   adds one to score of a shooter 1
   */

    public void addOneForShooter1(View view) {
        scoreofShooter1 = scoreofShooter1 + 1;
        displayForShooter1(scoreofShooter1);
    }

    /*
   adds two to score of a shooter 1
   */

    public void addTwoForShooter1(View view) {
        scoreofShooter1 = scoreofShooter1 + 2;
        displayForShooter1(scoreofShooter1);
    }

    /*
   adds three to score of a shooter 1
   */

    public void addThreeForShooter1(View view) {
        scoreofShooter1 = scoreofShooter1 + 3;
        displayForShooter1(scoreofShooter1);
    }

    /*
    adds four to score of a shooter 1
    */
    public void addFourForShooter1(View view) {
        scoreofShooter1 = scoreofShooter1 + 4;
        displayForShooter1(scoreofShooter1);
    }

    /*
   adds one to score of a shooter 2
   */

    public void addOneForShooter2(View view) {
        scoreofShooter2 = scoreofShooter2 + 1;
        displayForShooter2(scoreofShooter2);
    }

    /*
   adds two to score of a shooter 2
   */

    public void addTwoForShooter2(View view) {
        scoreofShooter2 = scoreofShooter2 + 2;
        displayForShooter2(scoreofShooter2);
    }

    /*
   adds three to score of a shooter 2
   */

    public void addThreeForShooter2(View view) {
        scoreofShooter2 = scoreofShooter2 + 3;
        displayForShooter2(scoreofShooter2);
    }

    /*
    adds four to score of a shooter 2
    */
    public void addFourForShooter2(View view) {
        scoreofShooter2 = scoreofShooter2 + 4;
        displayForShooter2(scoreofShooter2);
    }

    /*
        Resets the score of shooter 1
        */
    public void resetScoreOfShooter1(View view) {
        scoreofShooter1 = 0;
        displayForShooter1(scoreofShooter1);
    }

    /*
        resets the score of shooter 2
        */
    public void resetScoreOfShooter2(View view) {
        scoreofShooter2 = 0;
        displayForShooter2(scoreofShooter2);
    }
    /**
     * Displays the given score for Shooter 1.
     */
    public void displayForShooter1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.shooter_1_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Shooter 2.
     */
    public void displayForShooter2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.shooter_2_score);
        scoreView.setText(String.valueOf(score));
    }

}