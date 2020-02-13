package com.example.soccer_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //using private and setters and getters, since that is what i have been taught is "best practice"
    private int scoreA=0;
    public int getScoreA() { return scoreA; }
    public void setScoreA(int scoreA) { this.scoreA = scoreA; }

    private int scoreB=0;
    public int getScoreB() { return scoreB; }
    public void setScoreB(int scoreB) { this.scoreB = scoreB; }

    private int foulA=0;
    public int getFoulA() { return foulA; }
    public void setFoulA(int foulA) { this.foulA = foulA; }

    private int foulB=0;
    public int getFoulB() { return foulB; }
    public void setFoulB(int foulB) { this.foulB = foulB; }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); }
        // how the score is show, it it implemented in the goal and foul methods, so it changes when clicked
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score)); }
    public void displayFoulTeamA (int foul) {
        TextView foulView = (TextView) findViewById(R.id.team_a_foul);
        foulView.setText(String.valueOf(foul)); }

    public void displayForTeamB( int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score)); }
        public void displayFoulTeamB( int foul) {
        TextView foulView = (TextView) findViewById(R.id.team_b_fouls);
        foulView.setText(String.valueOf(foul)); }

        //the method for setting and getting the score and foul
    public void goalTeamA (View view) {setScoreA(getScoreA()+1);displayForTeamA(scoreA); }
    public void foulTeamA (View view) {setFoulA(getFoulA()+1); displayFoulTeamA(foulA);}

    public void goalTeamB (View view) { setScoreB(getScoreB()+1); displayForTeamB(scoreB);}
    public void foulTeamB (View view) {setFoulB(getFoulB()+1); displayFoulTeamB(foulB);}

        //resets all the values and shows the reset values
    public void reset (View view) { setFoulB(0); setFoulA(0); setScoreB(0); setScoreA(0);
    displayFoulTeamB(getFoulB()); displayForTeamB(getScoreB()); displayFoulTeamA(getFoulA()); displayForTeamA(getScoreA()); }

}
