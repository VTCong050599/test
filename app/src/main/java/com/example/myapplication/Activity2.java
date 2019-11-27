package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    EditText edtten,edtmota;
    EditText edthinh;
    Button btnadd2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        
        btnadd2 = (Button) findViewById(R.id.btn_add2);
        edtten = (EditText) findViewById(R.id.edtten);
        edtmota = (EditText) findViewById(R.id.edtmota);
        edthinh = (EditText) findViewById(R.id.edthinh);

        /*
        * Contact contact = new Contact(nameAdd,phoneAdd,emailAdd);
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("addback",contact);
                    Intent resultIntent = new Intent();
                    resultIntent.putExtra("add",bundle);
                    setResult(Activity.RESULT_OK, resultIntent);
                    finish();
        * */

        btnadd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               ChuyenactivitySearch();
            }
        });

        
        
    }

    public void ChuyenactivitySearch(){
        Intent intent = new Intent();
        String ten,mota,hinh;
        ten=edtten.getText().toString();
        mota = edtmota.getText().toString();
        hinh = edthinh.getText().toString();
        Bundle bd = new Bundle();
        bd.putString("key_ten",ten);
        bd.putString("key_mota",mota);
        bd.putString("key_hinh",hinh);
        intent.putExtras(bd);
        setResult(RESULT_OK, intent);
        finish();
//        startActivity(intent);
    }
}
