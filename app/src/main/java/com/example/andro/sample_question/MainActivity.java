package com.example.andro.sample_question;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.util.Log.i("", "メイン画面のonCreate");

        // ボタンの生成
        Button btnFirstDay = (Button)this.findViewById(R.id.id_btn_first_day);
        Button btnSecondDay = (Button)this.findViewById(R.id.id_btn_second_day);
        Button btnFinish = (Button)this.findViewById(R.id.id_btn_finish);

        // １日目ボタンの処理
        btnFirstDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intentで１日目のアンケート画面へ
                Intent mainToFirst = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(mainToFirst);
            }
        });

        // ２日目ボタンの処理
        btnSecondDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intentで１日目のアンケート画面へ
                Intent mainToSecond = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(mainToSecond);
            }
        });

        // アンケート完了ボタンの処理
        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intentでアンケート完了画面へ
                Intent mainToQuestionDone = new Intent(MainActivity.this, QuestionDoneActivity.class);
                startActivity(mainToQuestionDone);

                // トースト作成と表示のメソッドを呼び出す
                showToast();
            }
        });
    }

    // トーストの作成と表示
    private void showToast () {
        Toast.makeText(this, R.string.text_question_done, Toast.LENGTH_SHORT).show();
    }
}
