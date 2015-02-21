# SampleQuestionの改善・改良版

こちらのブランチは、サンプルアプリの改善・改良版となっています。    
資料の改善・改良点にトライした後、自分のソースと比較してみてください。

## 改善・改良点

1. 質問に対して回答が一つだけしか選択できないようにチェックボックスをラジオボタンに変更してください。
  * **ヒント：** RadioButton, RadioGroup  

2. メイン画面の「n日目」ボタンの下にテキストビューを追加して、質問に何問回答したか表示してください。  
  * **ヒント:** intent.putExtra(), intent.getIntExtra()  

3. アンケートの回答を点数化してください。例えば「良い」は10点,「普通」は5点,「悪い」は0点のように。  
  * **ヒント：** android:onClick, isCecked(), getId()  

4. アンケート画面に「ｎ日目のアンケート終了」のボタンを設置して、点数化したデータを保存してください。  
  * **ヒント：** SharedPreferences, SharedPreferences.Editr  

5. 保存したデータを完了画面にテキストビューで表示してください。  
  * **ヒント：** SharedPreferences.getInt()  

6. 完了画面から端末の戻るボタンでメイン画面に戻る時に保存したデータを削除してください。  
  * **ヒント：** KeyEvent.KEYCODE_BACK, Editr.remove()


## 1. メイン画面_改善・改良版  
<img src="http://keepingblog.net/github_images/sample_question/メイン画面_改良版.png" width="250" height="400">

## 2. アンケート画面の１日目 と ２日目_改善・改良版  
<img src="http://keepingblog.net/github_images/sample_question/アンケート画面の1日目_改良版.png" width="250" height="400">
<img src="http://keepingblog.net/github_images/sample_question/アンケート画面の2日目_改良版.png" width="250" height="400">

## 3. アンケート完了画面_改善・改良版  
<img src="http://keepingblog.net/github_images/sample_question/アンケート完了画面_改良版.png" width="250" height="400">
