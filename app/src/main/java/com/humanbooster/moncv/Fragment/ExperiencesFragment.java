package com.humanbooster.moncv.Fragment;

import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.humanbooster.moncv.Adapter.ExperiencesAdapter;
import com.humanbooster.moncv.Object.Experiences;
import com.humanbooster.moncv.R;

import java.util.ArrayList;

/**
 * Created by hb-asus on 04/04/2017.
 */

public class ExperiencesFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mOptAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<Experiences> mList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View aRetourner = inflater.inflate(R.layout.experiences_fragment, container, false);

        /* liste des compétences à remplir */
        mList = new ArrayList<>();

        /* initialisation de la liste des compétences */
        initList(mList);

        mRecyclerView = (RecyclerView) aRetourner.findViewById(R.id.listViewExperience);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(aRetourner.getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mOptAdapter = new ExperiencesAdapter(mList);
        mRecyclerView.setAdapter(mOptAdapter);
        return aRetourner;
    }

    private void initList(ArrayList<Experiences> confectioneryList) {

        Experiences[] test = {
                new Experiences("2014-2015", "Apprenti Ingénieur : Développement sous Axapta ", "SAM Technologies à Decazeville", ""),
                new Experiences("2014", " Stage DUT : Conception et réalisation d’un site internet", "PHP, WebDev, MySQL, Photoshop. ", "")
        };

        for (Experiences i : test) {
            confectioneryList.add(i);
        }

    }
}
