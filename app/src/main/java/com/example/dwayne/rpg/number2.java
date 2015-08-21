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

public class number2 extends Activity {
SoundPool mySounds;
    int daft;
    Toast toast;
    private MediaPlayer np;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number2);
        mySounds = new SoundPool(10, AudioManager.STREAM_MUSIC,0);
        daft = mySounds.load(this,R.raw.two,1);
        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        np = MediaPlayer.create(this,R.raw.two);
        np.start();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_number2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void twogo(View view) {
        Intent intent = new Intent(getApplicationContext(),show_me_one.class);
        startActivity(intent);
    }  /**
     Top part of the source is the Button and to which activity it will be carried out to.
     [The bottom part is the Sound part of the volume icon]
     **/
    public void twosound(View view) {
        mySounds.play(daft,1,1,1,0,1);
    }
}
