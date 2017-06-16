package com.study.collapsingactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    Toolbar toolbar;

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    toolbar = (Toolbar) findViewById(R.id.toolbar);

    if (getSupportActionBar()!=null){
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.menu1:
                startActivity(new Intent(MainActivity.this, MainActivity.class));
                break;
            case R.id.menu2:
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
