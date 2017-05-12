package com.humanbooster.moncv.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.humanbooster.moncv.Object.Experiences;
import com.humanbooster.moncv.R;

import java.util.ArrayList;

/**
 * Created by hb-asus on 14/04/2017.
 */

public class ExperiencesAdapter extends RecyclerView.Adapter<ExperiencesAdapter.ViewHolder> {

    private ArrayList<Experiences> mList;

    public ExperiencesAdapter(ArrayList<Experiences> list){
        mList=list;
    }

    @Override
    public int getItemCount(){
        return mList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mExperienceDate;
        public TextView mExperienceTitre;
        public TextView mDescCourte;
        public TextView mDescLongue;

        public ViewHolder(View itemView) {
            super(itemView);
            mExperienceDate = (TextView) itemView.findViewById(R.id.dateExperience);
            mExperienceTitre = (TextView) itemView.findViewById(R.id.titreExperience);
            mDescCourte = (TextView) itemView.findViewById(R.id.descCourteExperience);
            mDescLongue = (TextView) itemView.findViewById(R.id.descLongueExperience);
        }

    }

    @Override
    public ExperiencesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.experience_confectionery, parent, false);
        ExperiencesAdapter.ViewHolder vh = new ExperiencesAdapter.ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ExperiencesAdapter.ViewHolder holder, int position) {
        Experiences object = mList.get(position);
        holder.mExperienceDate.setText(object.getDate());
        holder.mExperienceTitre.setText(object.getTitre());
        holder.mDescCourte.setText(object.getDescCourte());
        holder.mDescLongue.setText(object.getDescLongue());
    }
}
