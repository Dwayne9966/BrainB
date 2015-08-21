package com.example.dwayne.rpg;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class frown extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frown);
        Toast.makeText(getApplicationContext(), "Click back to Return", Toast.LENGTH_SHORT).show();
    }
}
