package com.twelker.geo_guess_swipe;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

public class PhotoAdapter extends RecyclerView.Adapter<PhotoViewHolder> {
    private Context context;
    public List<Photos> listPhotos;

    public PhotoAdapter(Context context, List<Photos> listGeoObject) {
        this.context = context;
        this.listPhotos = listGeoObject;
    }

    @Override
    public PhotoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_cell, parent, false);
        return new PhotoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final PhotoViewHolder holder, final int position) {
        // Gets a single item in the list from its position
        final Photos photos = listPhotos.get(position);
        // The holder argument is used to reference the views inside the viewHolder
        // Populate the views with the data from the list
        holder.photoImage.setImageResource(photos.getmPhotoImageName());
    }

    @Override
    public int getItemCount() {
        return listPhotos.size();
    }
}
