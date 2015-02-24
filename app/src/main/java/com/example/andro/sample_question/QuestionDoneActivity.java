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

        // 可変的な文字列をstrings.xmlから利用する方法と、Javaで変数と文字列を組み合わせて書く方法、敢えて二つ書きました。
        // 前者の方が保守性が高いため、推奨されている書き方です。
        int maxScore = getResources().getInteger(R.integer.default_max_score);
        firstDayScoreText.setText(getString(R.string.str_day_score_text ,1 ,firstDayScore, maxScore));
        secondDayScoreText.setText("2日目： " + secondDayScore + " / 100点");
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

