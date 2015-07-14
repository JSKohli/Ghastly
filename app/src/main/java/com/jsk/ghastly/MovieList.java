package com.jsk.ghastly;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;
import android.widget.Toast;


public class MovieList extends ActionBarActivity {

    ListView listView;

    public void showDescription(int pos) {

        switch (pos) {
            case 0:
                Intent intent1 = new Intent(this, item1.class);
                startActivity(intent1);
                break;
            case 1:
                Intent intent2 = new Intent(this, item2.class);
                startActivity(intent2);
                break;
            case 2:
                Intent intent3 = new Intent(this, item3.class);
                startActivity(intent3);
                break;
            case 3:
                Intent intent4 = new Intent(this, item4.class);
                startActivity(intent4);
                break;
            case 4:
                Intent intent5 = new Intent(this, item5.class);
                startActivity(intent5);
                break;
            case 5:
                Intent intent6 = new Intent(this, item6.class);
                startActivity(intent6);
                break;
            case 6:
                Intent intent7 = new Intent(this, item7.class);
                startActivity(intent7);
                break;
            case 7:
                Intent intent8 = new Intent(this, item8.class);
                startActivity(intent8);
                break;


        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_list);

        listView = (ListView) findViewById(R.id.horrormovielist);

        String[] movies = new String[]{
                "The Last Exorcism",
                "Sinister",
                "Dead Silence",
                "Oculus",
                "The Blair Witch Project",
                "The Babadook",
                "The Conjuring",
                "Insidious (Chapter 1)"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, movies);
        /*For Green Text
        {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView text = (TextView) view.findViewById(android.R.id.text1);
                text.setTextColor(Color.GREEN);
                return view;
            }
        };*/

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                int itemPosition = position;
                String itemValue = (String) listView.getItemAtPosition(position);

                showDescription(position);
            }
        });

    }



/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_movie_list, menu);
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
