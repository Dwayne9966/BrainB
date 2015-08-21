package com.example.dwayne.rpg;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class smile extends Activity {
Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smile);


    }
    public void tonumbertwo(View view) {
        Intent intent = new Intent(getApplicationContext(),number2.class);
        startActivity(intent);
    }
}
