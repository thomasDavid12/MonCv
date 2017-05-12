package com.humanbooster.moncv.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.humanbooster.moncv.Object.Competences;
import com.humanbooster.moncv.R;

import java.util.ArrayList;

/**
 * Created by hb-asus on 06/04/2017.
 */

public class CompetencesAdapter extends RecyclerView.Adapter<CompetencesAdapter.ViewHolder> {

    private ArrayList<Competences> mList;

    public CompetencesAdapter(ArrayList<Competences> list) {
        mList = list;
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mCompetenceName;
        public RatingBar mRatingBar;

        public ViewHolder(View itemView) {
            super(itemView);
            mCompetenceName = (TextView) itemView.findViewById(R.id.competence_name);
            mRatingBar = (RatingBar) itemView.findViewById(R.id.ratingBar);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.competences_confectionery, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Competences object = mList.get(position);
        holder.mCompetenceName.setText(object.getCompetence());
        holder.mRatingBar.setRating(object.getNbStar());
    }

}
