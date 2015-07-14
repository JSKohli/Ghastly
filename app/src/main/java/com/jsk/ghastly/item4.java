package com.jsk.ghastly;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class item4 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item4);

        TextView description = (TextView) findViewById(R.id.item4Description);
        description.setText("Haunted by the violent demise of their parents 10 " +
                "years earlier, adult siblings Kaylie (Karen Gillan) and Tim " +
                "(Brenton Thwaites) are now struggling to rebuild their " +
                "relationship. Kaylie suspects that their antique mirror, " +
                "known as the Lasser Glass, is behind the tragedy. The seemingly " +
                "harmless reflections contain a malevolent, supernatural force " +
                "that infects the mind of anyone who gazes into it. As Kaylie gets " +
                "closer to the truth, the siblings become caught in the mirror's evil spell.");
    }

/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_item4, menu);
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
