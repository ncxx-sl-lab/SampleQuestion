package com.example.andro.sample_question;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
