package com.urucas.horbar;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bar horbar1 = (Bar) findViewById(R.id.horbar1);
        horbar1.setTotal(350);
        horbar1.updateBar(236, 114, String.valueOf(236), String.valueOf(114));

        Bar horbar2 = (Bar) findViewById(R.id.horbar2);
        horbar2.setTotal(350);
        horbar2.updateBar(114, 236, "32%", "68%");

        Bar horbar3 = (Bar) findViewById(R.id.horbar3);
        horbar3.setTotal(350);
        horbar3.updateBar(150, 200, "In favor", "Against");

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
