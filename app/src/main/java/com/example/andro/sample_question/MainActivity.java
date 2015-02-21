package com.example.andro.sample_question;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.util.Log.i("", "メイン画面のonCreate");

        // 回答数の表示
        TextView firstDayQuestionText = (TextView) findViewById(R.id.id_first_day_question_text);
        TextView secondDayQuestionText = (TextView) findViewById(R.id.id_second_day_question_text);

        // intentから値を受け取る
        Intent intent = getIntent();
        firstDayQuestionText.setText(intent.getIntExtra("FIRST_DAY_ANSWER", 0) + " / " + 5);
        secondDayQuestionText.setText(intent.getIntExtra("SECOND_DAY_ANSWER", 0) + " / " + 6);
    }

    public void onBtnFirstDay(View view) {
        // Intentで１日目のアンケート画面へ
        Intent mainToFirst = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(mainToFirst);
    }

    public void onBtnSecondDay(View view) {
        // Intentで２日目のアンケート画面へ
        Intent mainToSecond = new Intent(MainActivity.this, ThirdActivity.class);
        startActivity(mainToSecond);
    }

    public void onBtnQuestionDone(View view) {
        // Intentでアンケート完了画面へ
        Intent mainToQuestionDone = new Intent(MainActivity.this, QuestionDoneActivity.class);
        startActivity(mainToQuestionDone);

        // トースト作成と表示のメソッドを呼び出す
        showToast();
    }

    // トーストの作成と表示
    private void showToast () {
        Toast.makeText(this, R.string.text_question_done, Toast.LENGTH_SHORT).show();
    }

    public void onRadioButtonFirstClicked(View view) {
    }
}
