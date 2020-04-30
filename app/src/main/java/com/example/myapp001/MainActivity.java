package com.example.myapp001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClickButton(View v)
    {
        //インテントの作成
        Intent intent = new Intent(this, SecondActivity.class);

        //データをセット
        EditText editText = (EditText)this.findViewById(R.id.editText);
        intent.putExtra("sendText",editText.getText().toString());

        //遷移先の画面を起動
        startActivity(intent);
    }
}
