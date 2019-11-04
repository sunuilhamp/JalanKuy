package com.dicoding.picodiploma.jalankuy.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.dicoding.picodiploma.jalankuy.R;
import com.dicoding.picodiploma.jalankuy.model.Place;

import java.util.ArrayList;

public class PlacesAdapter extends RecyclerView.Adapter<PlacesAdapter.PlaceViewHolder> {

    private ArrayList<Place> listPlace;
    private OnItemClickCallback onItemClickCallback;

    public PlacesAdapter(ArrayList<Place> list) { this.listPlace = list; }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public PlaceViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_place, viewGroup, false);
        return new PlaceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final PlaceViewHolder holder, int position) {
        final Place place = listPlace.get(position);

        Glide.with(holder.itemView.getContext())
                .load(place.getPhoto())
                .apply(new RequestOptions().override(350,550))
                .apply(new RequestOptions().transform(new RoundedCorners(40)))
                .into(holder.imgPhoto);

        holder.tvName.setText(place.getName());
        holder.tvLocation.setText(place.getLocation());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(place);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listPlace.size();
    }

    class PlaceViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvLocation;

        PlaceViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_place_name);
            tvLocation = itemView.findViewById(R.id.tv_place_location);
        }
    }
}
