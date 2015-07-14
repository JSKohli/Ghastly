package com.jsk.ghastly;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class item2 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item2);

        TextView description = (TextView) findViewById(R.id.item2Description);

        description.setText("True-crime writer Ellison Oswald (Ethan Hawke) is " +
                "in a slump; he hasn't had a best seller in more than 10 years " +
                "and is becoming increasingly desperate for a hit. So, when he " +
                "discovers the existence of a snuff film showing the deaths of a " +
                "family, he vows to solve the mystery. He moves his own family into " +
                "the victims' home and gets to work. However, when old film footage " +
                "and other clues hint at the presence of a supernatural force, Ellison " +
                "learns that living in the house may be fatal.");
    }

    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_item2, menu);
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
