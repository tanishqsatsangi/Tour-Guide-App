package com.android.udacity.tour_app_abnd7.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.android.udacity.tour_app_abnd7.Models.PlacesModel;
import com.android.udacity.tour_app_abnd7.R;

import java.util.ArrayList;

public class PlacesAdapter extends RecyclerView.Adapter<PlacesAdapter.ViewHolder> {

    Context context;
    ArrayList<PlacesModel> placedata = new ArrayList<>();

    public PlacesAdapter() {

    }

    public PlacesAdapter(Context context, ArrayList<PlacesModel> arrayList) {
        placedata = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.places_layout, viewGroup, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        PlacesModel currentplace = placedata.get(i);
        viewHolder.place_img.setImageResource(currentplace.getImg_id());
        viewHolder.placename.setText(currentplace.getPlacename());
        viewHolder.placeaddress.setText(currentplace.getPlaceaddress());
        viewHolder.placerating.setRating((float) currentplace.getRating());
    }

    @Override
    public int getItemCount() {
        return placedata.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView placename, placeaddress, timings;
        ImageView place_img;
        RatingBar placerating;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            place_img = itemView.findViewById(R.id.places_img);
            placename = itemView.findViewById(R.id.placename);
            placeaddress = itemView.findViewById(R.id.placeaddress);
            timings = itemView.findViewById(R.id.placetiming);
            placerating = itemView.findViewById(R.id.placerating);


        }
    }


}
