package com.humanbooster.moncv.Fragment;

import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.humanbooster.moncv.Adapter.CompetencesAdapter;
import com.humanbooster.moncv.Object.Competences;
import com.humanbooster.moncv.R;

import java.util.ArrayList;


public class CompetencesFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mOptAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<Competences> mList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View aRetourner = inflater.inflate(R.layout.competences_fragment, container, false);

        /* liste des compétences à remplir */
        mList = new ArrayList<>();

        /* initialisation de la liste des compétences */
        initList(mList);

        mRecyclerView = (RecyclerView) aRetourner.findViewById(R.id.listViewCompetence);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(aRetourner.getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mOptAdapter = new CompetencesAdapter(mList);
        mRecyclerView.setAdapter(mOptAdapter);

        return aRetourner;
    }


    private void initList(ArrayList<Competences> confectioneryList) {

        Competences[] test = {
                new Competences("Java",5),
                new Competences("C++",4),
                new Competences("X++",4),
                new Competences("C#",3),
                new Competences("C",3),
                new Competences("PHP",4),
                new Competences("SQL",4),
                new Competences("PL/SQL",3),
                new Competences("XML",3),
                new Competences("Linux",4),
                new Competences("Windows",5),
                new Competences("OSX",4),
                new Competences("Oracle",3),
                new Competences("MySQL",4),
                new Competences("Access",3),
                new Competences("Netbeans",1),
                new Competences("Eclipse",5),
                new Competences("Visual Studio",4),
                new Competences("EasyPHP",5),
                new Competences("XMLSpy",1),
                new Competences("Maple",3),
                new Competences("VirtualBox",3),
                new Competences("WinDev",4),
                new Competences("WebDev",4),
                new Competences("Microsoft",4),
                new Competences("Dynamics AX",4),
                new Competences("Word",5),
                new Competences("PowerPoint",5),
                new Competences("Excel",5),
                new Competences("Access",4),
                new Competences("Publisher",4),
                new Competences("OpenOffice",4)
        };

        for (Competences i : test) {
            confectioneryList.add(i);
        }

    }

}
