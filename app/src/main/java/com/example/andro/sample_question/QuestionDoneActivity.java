package com.example.andro.sample_question;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.widget.TextView;

public class QuestionDoneActivity extends ActionBarActivity {

    private int firstDayScore;
    private int secondDayScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_done);

        // 保存データの読み込み
        loadScore();

        // 得点の表示
        TextView firstDayScoreText = (TextView) findViewById(R.id.id_first_day_score_text);
        TextView secondDayScoreText = (TextView) findViewById(R.id.id_second_day_score_text);
        firstDayScoreText.setText("１日目： " + firstDayScore + " / 100点");
        secondDayScoreText.setText("２日目： " + secondDayScore + " / 100点");
    }

    // 保存データの読み込み
    public void loadScore() {
        SharedPreferences spFirst = getSharedPreferences("FIRST_DAY", MODE_PRIVATE);
        SharedPreferences spSecond = getSharedPreferences("SECOND_DAY", MODE_PRIVATE);
        firstDayScore = spFirst.getInt("FIRST_DAY_SCORE", 0);
        secondDayScore = spSecond.getInt("SECOND_DAY_SCORE", 0);
    }

    // 戻るボタンを検知
    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        if (event.getKeyCode() == KeyEvent.KEYCODE_BACK){
            // 保存データの削除
            SharedPreferences spFirst = getSharedPreferences("FIRST_DAY", MODE_PRIVATE);
            SharedPreferences spSecond = getSharedPreferences("SECOND_DAY", MODE_PRIVATE);
            SharedPreferences.Editor editorFirst = spFirst.edit();
            SharedPreferences.Editor editorSecond = spSecond.edit();
            editorFirst.remove("FIRST_DAY_SCORE").apply();
            editorSecond.remove("SECOND_DAY_SCORE").apply();
        }
        return  super.dispatchKeyEvent(event);
    }
}

