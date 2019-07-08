package com.android.udacity.tour_app_abnd7.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.udacity.tour_app_abnd7.Models.UtilityModel;
import com.android.udacity.tour_app_abnd7.R;

import java.util.ArrayList;

public class UtilityAdapter extends RecyclerView.Adapter<UtilityAdapter.viewHolder> {
    Context context;
    ArrayList<UtilityModel> utilitydata = new ArrayList<>();

    public UtilityAdapter() {

    }

    public UtilityAdapter(Context context, ArrayList<UtilityModel> utilitydata) {
        this.context = context;
        this.utilitydata = utilitydata;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {


        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.utility_layout, viewGroup, false);
        return new viewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder viewHolder, int i) {
        UtilityModel currentutility = utilitydata.get(i);
        viewHolder.utilityname.setText(currentutility.getUtilityname());
        viewHolder.utilityaddress.setText(currentutility.getUtilityaddress());
        viewHolder.utilitycontactno.setText(currentutility.getContactno());
        viewHolder.utilityimg.setImageResource(currentutility.getImgid());

    }

    @Override
    public int getItemCount() {
        return utilitydata.size();
    }

    class viewHolder extends RecyclerView.ViewHolder {
        TextView utilityname, utilityaddress, utilitycontactno;
        ImageView utilityimg;

        public viewHolder(@NonNull View itemView) {

            super(itemView);
            utilityaddress = itemView.findViewById(R.id.utilityaddress);
            utilityname = itemView.findViewById(R.id.utilityname);
            utilitycontactno = itemView.findViewById(R.id.utilitycontact);
            utilityimg = itemView.findViewById(R.id.utility_img);
        }
    }
}
