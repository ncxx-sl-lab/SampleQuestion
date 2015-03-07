package com.example.andro.sample_question;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;

public class ThirdActivity extends ActionBarActivity {

    // 回答数
    private String[] questionList;

    // 回答点数
    private int firstAnswerScore;
    private int secondAnswerScore;
    private int thirdAnswerScore;
    private int forthAnswerScore;
    private int fifthAnswerScore;
    private int sixthAnswerScore;
    private int secondDayTotalScore;

    private String answered;
    private String unanswered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        // 回答チェック用の変数を初期化
        questionList = new String[6];
        answered = "回答";
        unanswered = "未回答";
    }

    public void onRadioButtonFirstClicked(View view) {
        // ラジオボタンが選択されたか？
        boolean checked = ((RadioButton) view).isChecked();
        // 初期化
        firstAnswerScore = 0;

        // 回答チェック
        if (checked){
            questionList[0] = answered;
        } else {
            questionList[0] = unanswered;
        }

        // どのラジオボタン？
        switch(view.getId()) {
            case R.id.id_radio_first_left:
                if (checked)
                    firstAnswerScore = 10;
                break;
            case R.id.id_radio_first_center:
                if (checked)
                    firstAnswerScore = 5;
                break;
            case R.id.id_radio_first_right:
                if (checked)
                    firstAnswerScore = 0;
                break;
        }
    }

    public void onRadioButtonSecondClicked(View view) {
        // ラジオボタンが選択されたか？
        boolean checked = ((RadioButton) view).isChecked();
        // 初期化
        secondAnswerScore = 0;

        // 回答チェック
        if (checked){
            questionList[1] = answered;
        } else {
            questionList[1] = unanswered;
        }

        // どのラジオボタン？
        switch(view.getId()) {
            case R.id.id_radio_second_left:
                if (checked)
                    secondAnswerScore = 10;
                break;
            case R.id.id_radio_second_right:
                if (checked)
                    secondAnswerScore = 0;
                break;
        }
    }

    public void onRadioButtonThirdClicked(View view) {
        // ラジオボタンが選択されたか？
        boolean checked = ((RadioButton) view).isChecked();
        // 初期化
        thirdAnswerScore = 0;

        // 回答チェック
        if (checked){
            questionList[2] = answered;
        } else {
            questionList[2] = unanswered;
        }

        // どのラジオボタン？
        switch(view.getId()) {
            case R.id.id_radio_third_left:
                if (checked)
                    thirdAnswerScore = 10;
                break;
            case R.id.id_radio_third_center:
                if (checked)
                    thirdAnswerScore = 5;
                break;
            case R.id.id_radio_third_right:
                if (checked)
                    thirdAnswerScore = 0;
                break;
        }
    }

    public void onRadioButtonForthClicked(View view) {
        // ラジオボタンが選択されたか？
        boolean checked = ((RadioButton) view).isChecked();
        // 初期化
        forthAnswerScore = 0;

        // 回答チェック
        if (checked){
            questionList[3] = answered;
        } else {
            questionList[3] = unanswered;
        }

        // どのラジオボタン？
        switch(view.getId()) {
            case R.id.id_radio_forth_left:
                if (checked)
                    forthAnswerScore = 10;
                break;
            case R.id.id_radio_forth_center:
                if (checked)
                    forthAnswerScore = 5;
                break;
            case R.id.id_radio_forth_right:
                if (checked)
                    forthAnswerScore = 0;
                break;
        }
    }

    public void onRadioButtonFifthClicked(View view) {
        // ラジオボタンが選択されたか？
        boolean checked = ((RadioButton) view).isChecked();
        // 初期化
        fifthAnswerScore = 0;

        // 回答チェック
        if (checked){
            questionList[4] = answered;
        } else {
            questionList[4] = unanswered;
        }

        // どのラジオボタン？
        switch(view.getId()) {
            case R.id.id_radio_fifth_left:
                if (checked)
                    fifthAnswerScore = 30;
                break;
            case R.id.id_radio_fifth_right:
                if (checked)
                    fifthAnswerScore = 0;
                break;
        }
    }

    public void onRadioButtonSixthClicked(View view) {
        // ラジオボタンが選択されたか？
        boolean checked = ((RadioButton) view).isChecked();
        // 初期化
        sixthAnswerScore = 0;

        // 回答チェック
        if (checked){
            questionList[5] = answered;
        } else {
            questionList[5] = unanswered;
        }

        // どのラジオボタン？
        switch(view.getId()) {
            case R.id.id_radio_sixth_left:
                if (checked)
                    sixthAnswerScore = 30;
                break;
            case R.id.id_radio_sixth_right:
                if (checked)
                    sixthAnswerScore = 0;
                break;
        }
    }

    public void onBtnSecondDayDone(View view) {
        // 回答数の確認
        int secondDayAnsweredCount = 0;
        for (String sQuestionList : questionList) {
            if (answered.equals(sQuestionList)) {
                secondDayAnsweredCount++;
            }
        }

        // 2日目の得点の合計
        secondDayTotalScore = firstAnswerScore + secondAnswerScore + thirdAnswerScore + forthAnswerScore +
                fifthAnswerScore + sixthAnswerScore;

        // 得点の保存
        saveScore();

        Intent thirdToMain = new Intent(this, MainActivity.class);
        thirdToMain.putExtra("SECOND_DAY_ANSWER", secondDayAnsweredCount);
        startActivity(thirdToMain);
    }

    // データの保存
    public void saveScore() {
        SharedPreferences sp = getSharedPreferences("SECOND_DAY",MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putInt("SECOND_DAY_SCORE", secondDayTotalScore);
        editor.apply();

//        gugugigg
    }
}