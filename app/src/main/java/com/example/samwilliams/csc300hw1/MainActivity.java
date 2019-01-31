package com.example.samwilliams.csc300hw1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onAddPlayerPressed(View v)
    {
        Intent i = new Intent(this, PlayerRecordsAddNewActivity.class);
        this.startActivity(i);
    }
}
