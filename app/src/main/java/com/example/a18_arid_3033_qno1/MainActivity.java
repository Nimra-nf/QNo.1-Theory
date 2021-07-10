package com.example.a18_arid_3033_qno1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText Day;
    EditText Month;
    EditText Year;
    Button Calculate;
    FragmentManager manager;
    public class DemoFragment extends Fragment {
        public void doSomething(String param) {
            TextView age;

            age = (TextView) findViewById(R.id.Age);
            SettingsActivity st = new SettingsActivity();

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DemoFragment fragmentDemo = (DemoFragment)
                getSupportFragmentManager().findFragmentById(R.id.my_fragment);
        fragmentDemo.doSomething("some param");
        manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        Day = (EditText) findViewById(R.id.day);
        Month = (EditText) findViewById(R.id.month);
        Year = (EditText) findViewById(R.id.year);
        Calculate = (Button) findViewById(R.id.calc);

        Calculate.setOnClickListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
// Handle item selection
        switch (item.getItemId()) {
            case R.id.item1:
             //   showAbout();
                return true;
            case R.id.item2:
              //  showHelp(1);
                return true;
            case R.id.item3:
                gotosettings();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void gotosettings(){
            Intent in = new Intent(this, SettingsActivity.class);
            startActivity(in);
    }
    public void fragfun()
    {
       // SomeFragment f=(SomeFragment)
        manager.findFragmentById(R.id.my_fragment);
    }

        @RequiresApi(api = Build.VERSION_CODES.O)
        @Override
            public void onClick(View v) {
            LocalDate today = LocalDate.now();
            int y = Integer.parseInt(Year.getText().toString());
            int m = Integer.parseInt(Month.getText().toString());
            int d = Integer.parseInt(Year.getText().toString());
            LocalDate birthday = LocalDate.of(y, m, d);
            Period p = Period.between(birthday, today);


        }
}