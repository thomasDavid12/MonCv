package com.humanbooster.moncv.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.humanbooster.moncv.Object.Formations;
import com.humanbooster.moncv.R;

import java.util.ArrayList;

/**
 * Created by hb-asus on 24/04/2017.
 */

public class FormationsAdapter extends RecyclerView.Adapter<FormationsAdapter.ViewHolder> {

    private ArrayList<Formations> mList;

    public FormationsAdapter(ArrayList<Formations> list) {
        mList = list;
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mFormationsDate;
        public TextView mFormationsText;

        public ViewHolder(View itemView) {
            super(itemView);
            mFormationsDate = (TextView) itemView.findViewById(R.id.formationsDate);
            mFormationsText = (TextView) itemView.findViewById(R.id.formationsText);
        }
    }

    @Override
    public FormationsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.formations_confectionery, parent, false);
        FormationsAdapter.ViewHolder vh = new FormationsAdapter.ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(FormationsAdapter.ViewHolder holder, int position) {
        Formations object = mList.get(position);
        holder.mFormationsDate.setText(object.getDate());
        holder.mFormationsText.setText(object.getTitre());
    }

}
