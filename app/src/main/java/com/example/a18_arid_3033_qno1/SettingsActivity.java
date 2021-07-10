package com.example.a18_arid_3033_qno1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {

    Spinner spin;
    Spinner spin2;
    Button save;
    String[] ageunit;
    String[] Colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settingspage);
        Intent in = getIntent();

        spin = (Spinner) findViewById(R.id.unit);
        spin2 = (Spinner) findViewById(R.id.color);
        save = (Button) findViewById(R.id.save);

        ageunit = getResources().getStringArray(R.array.ageunits);
        Colors = getResources().getStringArray(R.array.colors);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, ageunit);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, Colors);

        spin.setAdapter(adapter);
        spin2.setAdapter(adapter2);





    }

    public void action()
    {
        spin.setOnItemClickListener(spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id)
            {
                int selectedunit = spin.getSelectedItemPosition();
                }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });

        spin2.setOnItemClickListener(spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id)
            {
                int selectedcolor = spin2.getSelectedItemPosition();
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }
        });
    }
}