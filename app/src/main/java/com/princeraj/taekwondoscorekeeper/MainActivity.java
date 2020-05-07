package com.princeraj.taekwondoscorekeeper;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int mScorePlayerA = 0;
    private int mScorePlayerB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Player A by 1.
     */
    public void addOneForPlayerA(View view) {
        mScorePlayerA = mScorePlayerA + 1;
        displayForPlayerA(mScorePlayerA);
    }

    /**
     * Increase the score for Player A by 2.
     */
    public void addTwoForPlayerA(View view) {
        mScorePlayerA = mScorePlayerA + 2;
        displayForPlayerA(mScorePlayerA);
    }

    /**
     * Increase the score for Player A by 3.
     */
    public void addThreeForPlayerA(View view) {
        mScorePlayerA = mScorePlayerA + 3;
        displayForPlayerA(mScorePlayerA);
    }

    /**
     * Increase the score for Player B by 1.
     */
    public void addOneForPlayerB(View view) {
        mScorePlayerB = mScorePlayerB + 1;
        displayForPlayerB(mScorePlayerB);
    }

    /**
     * Increase the score for Player B by 2.
     */
    public void addTwoForPlayerB(View view) {
        mScorePlayerB = mScorePlayerB + 2;
        displayForPlayerB(mScorePlayerB);
    }

    /**
     * Increase the score for Player B by 3.
     */
    public void addThreeForPlayerB(View view) {
        mScorePlayerB = mScorePlayerB + 3;
        displayForPlayerB(mScorePlayerB);
    }

    /**
     * Displays the given score for Player A.
     */
    public void displayForPlayerA(int score) {
        TextView scoreView = findViewById(R.id.player_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Player B.
     */
    public void displayForPlayerB(int score) {
        TextView scoreView = findViewById(R.id.player_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Reset the score for both Players back to 0.
     */
    public void resetScore(View view) {
        mScorePlayerA = 0;
        mScorePlayerB = 0;
        displayForPlayerA(mScorePlayerA);
        displayForPlayerB(mScorePlayerB);
    }
}
