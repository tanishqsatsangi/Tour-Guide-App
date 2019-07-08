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

import com.android.udacity.tour_app_abnd7.Models.RestaurantModel;
import com.android.udacity.tour_app_abnd7.R;

import java.util.ArrayList;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.viewHolder> {
    Context context;
    ArrayList<RestaurantModel> restaurantdata = new ArrayList<>();

    public RestaurantAdapter() {

    }

    public RestaurantAdapter(Context context, ArrayList<RestaurantModel> arrayList) {
        restaurantdata = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.restaurant_layout, viewGroup, false);
        return new viewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder viewHolder, int i) {
        RestaurantModel currentrestaurant = restaurantdata.get(i);
        viewHolder.restaurant_img.setImageResource(currentrestaurant.getImgid());
        viewHolder.restaurantname.setText(currentrestaurant.getRestaurantname());
        viewHolder.restaurantaddress.setText(currentrestaurant.getRestaurantaddress());
        viewHolder.restaurantrating.setRating((float) currentrestaurant.getRating());
    }

    @Override
    public int getItemCount() {
        return restaurantdata.size();
    }

    class viewHolder extends RecyclerView.ViewHolder {

        TextView restaurantname, restaurantaddress, timings;
        ImageView restaurant_img;
        RatingBar restaurantrating;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            restaurant_img = itemView.findViewById(R.id.restaurants_img);
            restaurantname = itemView.findViewById(R.id.restaurantname);
            restaurantaddress = itemView.findViewById(R.id.restaurantaddress);
            timings = itemView.findViewById(R.id.restauranttiming);
            restaurantrating = itemView.findViewById(R.id.restaurantrating);

        }
    }
}
