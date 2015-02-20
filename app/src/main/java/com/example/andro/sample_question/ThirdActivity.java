package com.example.andro.sample_question;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioGroup;

public class ThirdActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        final RadioGroup rgFirst = (RadioGroup)findViewById(R.id.id_RadioGroup_first);
        rgFirst.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int id = rgFirst.getCheckedRadioButtonId();
                android.util.Log.i("", String.valueOf(id));
            }
        });

        final RadioGroup rgSecond = (RadioGroup)findViewById(R.id.id_RadioGroup_second);
        rgSecond.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int id = rgSecond.getCheckedRadioButtonId();
                android.util.Log.i("", String.valueOf(id));
            }
        });

        final RadioGroup rgThird = (RadioGroup)findViewById(R.id.id_RadioGroup_third);
        rgThird.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int id = rgThird.getCheckedRadioButtonId();
                android.util.Log.i("", String.valueOf(id));
            }
        });

        final RadioGroup rgForth = (RadioGroup)findViewById(R.id.id_RadioGroup_forth);
        rgForth.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int id = rgForth.getCheckedRadioButtonId();
                android.util.Log.i("", String.valueOf(id));
            }
        });

        final RadioGroup rgFifth = (RadioGroup)findViewById(R.id.id_RadioGroup_fifth);
        rgFifth.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int id = rgFifth.getCheckedRadioButtonId();
                android.util.Log.i("", String.valueOf(id));
            }
        });

        final RadioGroup rgSixth = (RadioGroup)findViewById(R.id.id_RadioGroup_sixth);
        rgSixth.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int id = rgSixth.getCheckedRadioButtonId();
                android.util.Log.i("", String.valueOf(id));
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
    }
}

