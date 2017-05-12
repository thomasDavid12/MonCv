package com.humanbooster.moncv.Fragment;

import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.humanbooster.moncv.Adapter.FormationsAdapter;
import com.humanbooster.moncv.Object.Formations;
import com.humanbooster.moncv.R;

import java.util.ArrayList;

/**
 * Created by hb-asus on 04/04/2017.
 */

public class FormationsFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mOptAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<Formations> mList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View aRetourner = inflater.inflate(R.layout.formations_fragment, container, false);

        /* liste des formations à remplir */
        mList = new ArrayList<>();

        /* initialisation de la liste des formations */
        initList(mList);

        mRecyclerView = (RecyclerView) aRetourner.findViewById(R.id.listViewFormations);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(aRetourner.getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mOptAdapter = new FormationsAdapter(mList);
        mRecyclerView.setAdapter(mOptAdapter);

        return aRetourner;
    }

    private void initList(ArrayList<Formations> confectioneryList) {

        Formations[] test = {
                new Formations("2014 – 2015", "3iL ingénieurs de RODEZ 1 ère année en alternance"),
                new Formations("2011 – 2014","IUT Informatique de RODEZ - DUT Informatique"),
                new Formations("2011","Lycée Jean Vigo de MILLAU - Titulaire du Baccalauréat S")
        };

        for (Formations i : test) {
            confectioneryList.add(i);
        }

    }

}
