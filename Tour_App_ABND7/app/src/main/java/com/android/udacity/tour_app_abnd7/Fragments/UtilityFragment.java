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

import com.android.udacity.tour_app_abnd7.Adapters.UtilityAdapter;
import com.android.udacity.tour_app_abnd7.Models.UtilityModel;
import com.android.udacity.tour_app_abnd7.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class UtilityFragment extends Fragment {

    RecyclerView utilityrecyclerview;
    ArrayList<UtilityModel> arrayList = new ArrayList<>();

    public UtilityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_utility, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        data();

        utilityrecyclerview = view.findViewById(R.id.utilityrecyclerview);
        utilityrecyclerview.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        ;
        UtilityAdapter adapter = new UtilityAdapter(getContext(), arrayList);
        utilityrecyclerview.setAdapter(adapter);
    }

    void data() {
        UtilityModel um = new UtilityModel("name", "address", "description", "contact info", R.drawable.ic_launcher_foreground);
        arrayList.add(um);
        arrayList.add(um);
        arrayList.add(um);
        arrayList.add(um);
        arrayList.add(um);
        arrayList.add(um);
        arrayList.add(um);
        arrayList.add(um);
        arrayList.add(um);
        arrayList.add(um);
        arrayList.add(um);
        arrayList.add(um);
        arrayList.add(um);
    }
}
