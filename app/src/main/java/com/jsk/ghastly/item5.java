package com.jsk.ghastly;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class item5 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item5);

        TextView description = (TextView) findViewById(R.id.item5Description);
        description.setText("Found video footage tells the tale of three film " +
                "students (Heather Donahue, Joshua Leonard, Michael C. Williams) " +
                "who've traveled to a small town to collect documentary footage " +
                "about the Blair Witch, a legendary local murderer. Over the course " +
                "of several days, the students interview townspeople and gather clues " +
                "to support the tale's veracity. But the project takes a frightening " +
                "turn when the students lose their way in the woods and " +
                "begin hearing horrific noises");
    }
/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_item5, menu);
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
    }*/
}
