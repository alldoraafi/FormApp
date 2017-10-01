package com.example.ar_pc.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TextView;

public class hasilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        Intent intent = getIntent();
        String[] val = intent.getStringArrayExtra("lists");
        GridView gridView = (GridView)findViewById(R.id.gridview);
        list[] lists = {
                new list("Nama", val[0]),
                new list("Email", val[1]),
                new list("Jenis Kelamin", val[2]),
                new list("NIM", val[3]),
                new list("Program Studi", val[4])
        };
        newAdapter newAdapter = new newAdapter(this, lists);
        gridView.setAdapter(newAdapter);
    }

    public class newAdapter extends BaseAdapter {
        private final Context mContext;
        private final list[] list;

        // 1
        public newAdapter(Context context, list[] lists) {
            this.mContext = context;
            this.list = lists;
        }
        @Override
        public int getCount() {
            return list.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            final list current = list[position];
            Log.d("1", current.getValue());
            if (convertView == null) {
                final LayoutInflater layoutInflater = LayoutInflater.from(mContext);
                convertView = layoutInflater.inflate(R.layout.cell, null);
            }
            TextView field = (TextView) convertView.findViewById(R.id.text1);
            field.setText(current.getField());
            TextView value = (TextView) convertView.findViewById(R.id.text2);
            value.setText(current.getValue());
            return convertView;
        }
    }
}
