package com.example.andro.sample_question;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class SecondActivity extends ActionBarActivity {

    // 質問１の回答点数
    private int firstAnswerScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void onRadioButtonFirstClicked(View view) {
        // ラジオボタンが選択されたか？
        boolean checked = ((RadioButton) view).isChecked();

        // 初期化
        firstAnswerScore = 0;

        // どのラジオボタン？
        switch(view.getId()) {
            case R.id.id_radio_first_left:
                if (checked)

                    firstAnswerScore = 3;

                    android.util.Log.i("", "first_left");
                    break;
            case R.id.id_radio_first_center:
                if (checked)

                    firstAnswerScore = 1;

                    android.util.Log.i("", "first_center");
                    break;
            case R.id.id_radio_first_right:
                if (checked)

                    firstAnswerScore = -1;

                    android.util.Log.i("", "first_right");
                    break;
        }

        android.util.Log.i("", String.valueOf(firstAnswerScore));
    }

}

