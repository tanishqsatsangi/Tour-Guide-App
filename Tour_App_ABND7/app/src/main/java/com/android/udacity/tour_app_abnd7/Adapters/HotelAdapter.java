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

import com.android.udacity.tour_app_abnd7.Models.HotelModel;
import com.android.udacity.tour_app_abnd7.R;

import java.util.ArrayList;

public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.viewHOlder> {
    Context context;
    ArrayList<HotelModel> hoteldata = new ArrayList<>();

    public HotelAdapter() {
    }

    public HotelAdapter(Context context, ArrayList<HotelModel> hoteldata) {
        this.context = context;
        this.hoteldata = hoteldata;
    }

    @NonNull
    @Override
    public viewHOlder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.hotel_layout, viewGroup, false);

        return new viewHOlder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHOlder viewHOlder, int i) {
        HotelModel currenthotel = hoteldata.get(i);
        viewHOlder.hotelname.setText(currenthotel.getHotelname());
        viewHOlder.hoteladdress.setText(currenthotel.getHoteladdress());
        viewHOlder.hotelimg.setImageResource(currenthotel.getImg_id());
        viewHOlder.hotelratings.setRating(currenthotel.getRating());
        viewHOlder.hotelcontactno.setText(currenthotel.getHotelcontactno());
    }

    @Override
    public int getItemCount() {
        return hoteldata.size();

    }

    class viewHOlder extends RecyclerView.ViewHolder {
        TextView hotelname, hoteladdress, hotelcontactno;
        ImageView hotelimg;
        RatingBar hotelratings;


        public viewHOlder(@NonNull View itemView) {
            super(itemView);
            hoteladdress = itemView.findViewById(R.id.hoteladdress);
            hotelname = itemView.findViewById(R.id.hotelname);
            hotelcontactno = itemView.findViewById(R.id.hotelcontact);
            hotelimg = itemView.findViewById(R.id.hotel_img);
            hotelratings = itemView.findViewById(R.id.hotelrating);

        }
    }

}
