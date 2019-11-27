package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvtraicay;
    ArrayList<traicay> arraytraicay;
    traicayadapter adapter;
    Button btnadd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvtraicay = (ListView) findViewById(R.id.listview);
        btnadd = (Button) findViewById(R.id.btn_add);
        arraytraicay = new ArrayList<traicay>();
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chuyen();

            }

        });
        adapter = new traicayadapter(this, R.layout.dong_trai_cay, arraytraicay);
        lvtraicay.setAdapter(adapter);
//        addtraicay();
//        adapter.notifyDataSetChanged();

    }


    public void chuyen() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

    public void addtraicay()
    {
        Intent intent1 = getIntent();
        Bundle bundle = intent1.getExtras();
        int hinh1 = 0;
        if (bundle != null) {
            String tentraicay = bundle.getString("key_ten", "");
            String motatraicay = bundle.getString("key_mota", "");
            String hinhtraicay = bundle.getString("key_hinh", "");
            if (Integer.parseInt(hinhtraicay) == 1) hinh1 = R.drawable.man;
            else if (Integer.parseInt(hinhtraicay) == 2) hinh1 = R.drawable.cherri;
            else hinh1 = R.drawable.tao;
            arraytraicay.add(new traicay(tentraicay, motatraicay, hinh1));
            adapter.notifyDataSetChanged();
        }


    }

}
