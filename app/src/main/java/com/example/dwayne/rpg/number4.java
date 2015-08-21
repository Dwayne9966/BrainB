package com.example.dwayne.rpg;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class number4 extends Activity {
int redaudioId;
    private MediaPlayer mp;
    SoundPool mySound;
   Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number4);
        mySound = new SoundPool(10, AudioManager.STREAM_MUSIC,0);
        redaudioId = mySound.load(this, R.raw.four, 1);
        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        mp = MediaPlayer.create(this, R.raw.four);
        mp.start();
        Toast toast = Toast.makeText(this,"Click here",Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();

    }
    public void toword4(View view) {
        Intent intent = new Intent(getApplicationContext(),ex1.class);
        startActivity(intent);
    }

    public void sultz(View view) {
        mySound.play(redaudioId, 1, 1, 1, 0, 1);
    }
}
