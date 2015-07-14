package com.jsk.ghastly;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class item3 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item3);

        TextView description = (TextView) findViewById(R.id.item3Description);
        description.setText("After his wife meets a grisly end, Jamie Ashen " +
                "(Ryan Kwanten) returns to their creepy hometown of Ravens Fair " +
                "to unravel the mystery of her murder. Once there, he discovers the " +
                "legend of Mary Shaw (Joan Heney), a murdered ventriloquist whose " +
                "eerie presence still looms over the town. As he desperately digs " +
                "for answers, Jamie encounters the curse that took his wife's life " +
                "and threatens his own.");
    }

    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_item3, menu);
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
