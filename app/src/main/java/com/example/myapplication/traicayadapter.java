package com.example.myapplication;


import android.app.Activity;
import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.LayoutInflater;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class traicayadapter extends ArrayAdapter<traicay> {
    Context context ;
    ArrayList<traicay> traicayArrayList;
    int id;

    public traicayadapter(Context context, int id, ArrayList<traicay> traicayArrayList) {
        super(context,id,traicayArrayList);
        this.context = context;
        this.traicayArrayList = traicayArrayList;
        this.id = id;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Viewholder viewholder;
        if(view==null) {
            viewholder = new Viewholder();
            view = LayoutInflater.from(context).inflate(R.layout.dong_trai_cay,viewGroup,false);

            //ánh xạ view
            viewholder.txtten = (TextView) view.findViewById(R.id.txtviewten);
            viewholder.txtmota = (TextView) view.findViewById(R.id.txtmota);
            viewholder.imghinh = (ImageView) view.findViewById(R.id.viewhinh);
            view.setTag(viewholder);
        }
        else{
            viewholder = (Viewholder) view.getTag();
        }
        //gán giá trị
        traicay traicay = traicayArrayList.get(i);
        viewholder.txtten.setText(traicay.getTen());
        viewholder.txtmota.setText(traicay.getMota());
        viewholder.imghinh.setImageResource(traicay.getHinh());

        return view;
    }
    public class  Viewholder{
        TextView txtten;
        TextView txtmota;
        ImageView imghinh;
    }
}
