package com.tumblr.fabfolio.brickbuster;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;


public class MainActivity extends Activity {

    private static final String START_NEW_GAME = "START_NEW_GAME";
    private boolean startNewGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_main);
    }

    public void resumeGame(View view) {
        startNewGame = false;
        Intent intent = new Intent (this, FullscreenActivity.class);
        intent.putExtra(START_NEW_GAME, startNewGame);
        startActivity(intent);
    }

    public void newGame(View view) {
        startNewGame = true;
        Intent intent = new Intent (this, FullscreenActivity.class);
        intent.putExtra(START_NEW_GAME, startNewGame);
        startActivity(intent);
    }

    public void showHighscore(View view) {
        Intent intent = new Intent (this, HighscoreActivity.class);
        startActivity(intent);
    }
}
