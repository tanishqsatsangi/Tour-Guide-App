package com.android.udacity.tour_app_abnd7.Fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.udacity.tour_app_abnd7.Adapters.PlacesAdapter;
import com.android.udacity.tour_app_abnd7.Models.PlacesModel;
import com.android.udacity.tour_app_abnd7.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class PlacesFragment extends Fragment {

    RecyclerView placesrecyclerview;
    ArrayList<PlacesModel> placearraylist = new ArrayList<>();

    public PlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_places, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        data();
        placesrecyclerview = view.findViewById(R.id.placesrecyclerview);

        placesrecyclerview.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        PlacesAdapter adapter = new PlacesAdapter(getContext(), placearraylist);
        placesrecyclerview.setAdapter(adapter);

    }

    void data() {
        PlacesModel pm = new PlacesModel("place name", "address", "00:00-00:00", "about place", R.drawable.ic_launcher_foreground, 5);

        placearraylist.add(pm);
        placearraylist.add(pm);
        placearraylist.add(pm);
        placearraylist.add(pm);
        placearraylist.add(pm);
        placearraylist.add(pm);

    }
}
