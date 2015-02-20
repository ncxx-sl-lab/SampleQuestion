package com.example.andro.sample_question;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;

public class ThirdActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

    }

    public void onRadioButtonFirstClicked(View view) {
        // ラジオボタンが選択されたか？
        boolean checked = ((RadioButton) view).isChecked();

        // どのラジオボタン？
        switch(view.getId()) {
            case R.id.id_radio_first_left:
                if (checked)
                    android.util.Log.i("", "left");
                break;
            case R.id.id_radio_first_center:
                if (checked)
                    android.util.Log.i("", "center");
                break;
            case R.id.id_radio_first_right:
                if (checked)
                    android.util.Log.i("", "right");
                break;
        }
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

