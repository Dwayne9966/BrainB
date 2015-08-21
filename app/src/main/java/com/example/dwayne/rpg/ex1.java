package com.example.dwayne.rpg;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class ex1 extends Activity {
SoundPool mySound;
    int redaudioId;
    private MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex1);
        mySound = new SoundPool(10, AudioManager.STREAM_MUSIC,0);
        redaudioId = mySound.load(this, R.raw.show_me_one, 1);
        mp =MediaPlayer.create(this, R.raw.show_me_one);
        mp.start();


    }
    Toast toast;
    public void setToast(View v){
        Toast.makeText(getApplicationContext(),"Choose a number",Toast.LENGTH_LONG);toast.show();
    }
    public void rested(View view){
        Intent intent = new Intent(getApplicationContext(),smile.class);
        startActivity(intent);
    }
    public void wrongchoice(View view) {
        Intent intent = new Intent(getApplicationContext(), frown.class);
        startActivity(intent);
    }
    public void lunz(View view) {mySound.play(redaudioId,1 ,1 ,1,0,1);
    }
}
