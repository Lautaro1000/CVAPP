package com.example.moncvapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ProjetBaseAdapter extends BaseAdapter {
    private ArrayList<Projet> projets;
    private Context context;

    public ProjetBaseAdapter(ArrayList<Projet> projets, Context context) {
        this.projets = projets;
        this.context = context;
    }

    @Override
    public int getCount() {
        return projets.size();
    }

    @Override
    public Object getItem(int position) {
        return projets.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.item_projet, parent, false);
        }
        TextView textNomProjet= convertView.findViewById(R.id.textNomProjet);
        textNomProjet.setText(projets.get(position).getNom());
        TextView textViewDescriptionProjet= convertView.findViewById(R.id.textViewDescriptionProjet);
        textViewDescriptionProjet.setText(projets.get(position).getDescription());
        //TextView textViewGit = convertView.findViewById(R.id.textViewGit);
        //textViewGit.setText(projets.get(position).getGit());

        return convertView;
    }
}
