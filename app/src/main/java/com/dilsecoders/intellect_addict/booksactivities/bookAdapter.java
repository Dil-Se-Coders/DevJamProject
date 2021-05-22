package com.dilsecoders.intellect_addict.booksactivities;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.dilsecoders.intellect_addict.R;

import java.util.ArrayList;

public class bookAdapter extends ArrayAdapter<books> {

    private Context mContext;
    private int resources;


    public bookAdapter(@NonNull Context context, int resource, @NonNull ArrayList<books> objects) {
        super(context, resource, objects);
        this.mContext= context;
        this.resources=resource;

    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){

        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        convertView = layoutInflater.inflate(resources, parent, false);

        ImageView imageView = convertView.findViewById(R.id.images);
        TextView textView = convertView.findViewById(R.id.textView1);
        imageView.setImageResource(getItem(position).getImage());
        textView.setText(getItem(position).getName());
        return convertView;

    }
}

//public class bookAdapter {
//}
