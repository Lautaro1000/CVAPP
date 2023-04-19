package com.example.moncvapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class CompetenceBaseAdapter extends BaseAdapter {
    private ArrayList<Competence> competences;
    private Context context;

    public CompetenceBaseAdapter(ArrayList<Competence> competences, Context context) {
        this.competences = competences;
        this.context = context;
    }

    @Override
    public int getCount() {
        return competences.size();
    }

    @Override
    public Object getItem(int position) {
        return competences.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.item_competence, parent, false);
        }
        TextView textViewLangage = convertView.findViewById(R.id.textViewLangage);
        textViewLangage.setText(competences.get(position).getLangage());
        RatingBar ratingBar = convertView.findViewById(R.id.ratingBar);
        ratingBar.setRating(competences.get(position).getNiveau());
        return convertView;
    }
}
