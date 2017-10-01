package com.example.ar_pc.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private String[] val;
    private EditText nama, email, jk, nim, ps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        val = new String[5];
        nama = (EditText) findViewById(R.id.editText);
        email = (EditText) findViewById(R.id.editText2);
        jk = (EditText) findViewById(R.id.editText3);
        nim = (EditText) findViewById(R.id.editText4);
        ps = (EditText) findViewById(R.id.editText5);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, hasilActivity.class);
        val[0]=nama.getText().toString();
        val[1]=email.getText().toString();
        val[2]=jk.getText().toString();
        val[3]=nim.getText().toString();
        val[4]=ps.getText().toString();
        intent.putExtra("lists", val);
        startActivity(intent);
    }
}
