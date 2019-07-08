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

import com.android.udacity.tour_app_abnd7.Adapters.RestaurantAdapter;
import com.android.udacity.tour_app_abnd7.Models.RestaurantModel;
import com.android.udacity.tour_app_abnd7.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends Fragment {

    RecyclerView restaurantrecyclerview;
    ArrayList<RestaurantModel> restaurantlist = new ArrayList<>();

    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_restaurant, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        data();
        restaurantrecyclerview = view.findViewById(R.id.restaurantrecyclerview);
        restaurantrecyclerview.setHasFixedSize(true);
        RestaurantAdapter adapter = new RestaurantAdapter(getContext(), restaurantlist);
        restaurantrecyclerview.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        restaurantrecyclerview.setAdapter(adapter);

    }

    void data() {
        RestaurantModel rm = new RestaurantModel("name", "address", "about restaurant", R.drawable.ic_launcher_foreground, "00-00", 5);
        restaurantlist.add(rm);
        restaurantlist.add(rm);
        restaurantlist.add(rm);
        restaurantlist.add(rm);
        restaurantlist.add(rm);
        restaurantlist.add(rm);
        restaurantlist.add(rm);
        restaurantlist.add(rm);
        restaurantlist.add(rm);


    }
}
