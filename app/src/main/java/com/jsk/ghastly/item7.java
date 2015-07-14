package com.jsk.ghastly;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class item7 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item7);

        TextView description = (TextView) findViewById(R.id.item7Description);
        description.setText("In 1970, paranormal investigators and demonologists " +
                "Lorraine (Vera Farmiga) and Ed (Patrick Wilson) Warren are summoned " +
                "to the home of Carolyn (Lili Taylor) and Roger (Ron Livingston) Perron. " +
                "The Perrons and their five daughters have recently moved into a " +
                "secluded farmhouse, where a supernatural presence has made itself known. " +
                "Though the manifestations are relatively benign at first, events soon " +
                "escalate in horrifying fashion, especially after the Warrens discover " +
                "the house's macabre history.");
    }
/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_item7, menu);
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
