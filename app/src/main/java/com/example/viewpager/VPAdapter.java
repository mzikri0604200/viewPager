package com.example.viewpager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class VPAdapter extends RecyclerView.Adapter<VPAdapter.ViewHolder> {

    ArrayList<ViewPagerItem> viewPagerItemArrayList;

    public VPAdapter(ArrayList<ViewPagerItem> viewPagerItemArrayList) {
        this.viewPagerItemArrayList = viewPagerItemArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_item,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        ViewPagerItem viewPagerItem = viewPagerItemArrayList.get(position);

//        holder.tvDesc.setText(viewPagerItem.description);
        holder.piagam.setImageResource(viewPagerItem.piagam);
        holder.bg.setBackgroundResource(viewPagerItem.bg);
        holder.title.setText(viewPagerItem.title);

    }

    @Override
    public int getItemCount() {
        return viewPagerItemArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        LinearLayout bg;
        ImageView piagam;
        TextView title, tvDesc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

//            tvDesc = itemView.findViewById(R.id.tvDesc);
            piagam = itemView.findViewById(R.id.piagam);
            bg = itemView.findViewById(R.id.bg_card);
            title = itemView.findViewById(R.id.title);
        }
    }

}
