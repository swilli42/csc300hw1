package com.example.samwilliams.csc300hw1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PlayerRecordsAddNewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_records_add_new);
    }

    public void onAddNewPlayerPressed(View v)
    {
        EditText nameET = (EditText)this.findViewById(R.id.nameET);
        EditText ageET = (EditText)this.findViewById(R.id.ageET);
        EditText jerseyNumberET = (EditText)this.findViewById(R.id.jeseryNumberET);
        EditText heightInFeetET = (EditText)this.findViewById(R.id.heightInFeetEt);
        EditText heightInInchesET = (EditText)this.findViewById(R.id.heightInInchesEt);
        EditText newPlayerET = (EditText)this.findViewById(R.id.newPlayerET);

        PlayerRecord pr = new PlayerRecord(nameET.getText().toString(),Integer.parseInt(ageET.getText().toString()),
            Integer.parseInt(jerseyNumberET.getText().toString()), Integer.parseInt(heightInFeetET.getText().toString()),
                Integer.parseInt(heightInInchesET.getText().toString()));
        pr.display();
    }
}
