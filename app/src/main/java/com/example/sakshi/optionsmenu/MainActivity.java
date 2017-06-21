package com.example.sakshi.optionsmenu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mtextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtextview=(TextView)findViewById(R.id.text);
        getSupportActionBar();          //supporting action bar
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {     //method for creating options menu
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);             //inflating menu from menu file in menu directory

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {       //method for item selection in options menu
         int id = item.getItemId();
        if(id==R.id.red){
            mtextview.setTextColor(Color.RED);          //setting text color to red
            return true;
        }
        if(id==R.id.green){
            mtextview.setTextColor(Color.GREEN);        //setting text color to green
            return true;
        }
        if(id==R.id.blue){
            mtextview.setTextColor(Color.BLUE);     //setting text color to blue
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
