package com.twelker.geo_guess_swipe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class GeoGuessSwipe extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo_guess_swipe);

        final List<Photos> mPhotos = new ArrayList<>();

        for (int i = 0; i < Photos.Europe.length; i++) {
            mPhotos.add(new Photos(Photos.Europe[i]));
        }

        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        RecyclerView.LayoutManager mLayoutManager = new StaggeredGridLayoutManager(1, LinearLayoutManager.VERTICAL);

        mRecyclerView.setLayoutManager(mLayoutManager);
        PhotoAdapter mAdapter = new PhotoAdapter(this, mPhotos);
        mRecyclerView.setAdapter(mAdapter);

        /*
        Add a touch helper to the RecyclerView to recognize when a user swipes to delete a list entry.
        An ItemTouchHelper enables touch behavior (like swipe and move) on each ViewHolder,
        and uses callbacks to signal when a user is performing these actions.
*/
        ItemTouchHelper.SimpleCallback simpleItemTouchCallback =
            new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT) {
                @Override
                public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder
                        target) {
                    return false;
                }

                //Called when a user swipes left or right on a ViewHolder
                @Override
                public void onSwiped(RecyclerView.ViewHolder viewHolder, int swipeDir) {
                    //Get the index corresponding to the selected position
                    int position = (viewHolder.getAdapterPosition());
                    if(Photos.InEurope[position] && swipeDir == 4){
                        Toast toast = Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT); toast.show();
                    } else if (!Photos.InEurope[position] && swipeDir == 8){
                        Toast toast = Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT); toast.show();
                    } else {
                        Toast toast = Toast.makeText(getApplicationContext(), "InCorrect", Toast.LENGTH_SHORT); toast.show();
                    }
                }
            };
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(simpleItemTouchCallback);
        itemTouchHelper.attachToRecyclerView(mRecyclerView);
    }
}
