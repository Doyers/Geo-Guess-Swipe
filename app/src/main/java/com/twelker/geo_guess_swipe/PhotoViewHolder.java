package com.twelker.geo_guess_swipe;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PhotoViewHolder extends RecyclerView.ViewHolder {

    public ImageView photoImage;
    public View view;

    public PhotoViewHolder(View itemView) {
        super(itemView);
        photoImage = (ImageView) itemView.findViewById(R.id.imageView);
        view = itemView;
    }
}
