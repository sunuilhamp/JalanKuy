package com.dicoding.picodiploma.jalankuy.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.dicoding.picodiploma.jalankuy.R;
import com.dicoding.picodiploma.jalankuy.adapter.OnItemClickCallback;
import com.dicoding.picodiploma.jalankuy.adapter.PlacesAdapter;
import com.dicoding.picodiploma.jalankuy.model.Place;
import com.dicoding.picodiploma.jalankuy.utils.PlacesData;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView rvPlace;
    private ArrayList<Place> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        rvPlace = findViewById(R.id.rv_place);
        rvPlace.setHasFixedSize(true);

        list.addAll(PlacesData.getListData());
        showRecyclerPlace();
    }

    private void showRecyclerPlace() {
        rvPlace.setLayoutManager(new LinearLayoutManager(this));
        PlacesAdapter placesAdapter = new PlacesAdapter(list);
        rvPlace.setAdapter(placesAdapter);

        placesAdapter.setOnItemClickCallback(new OnItemClickCallback() {
            @Override
            public void onItemClicked(Place place) {
                Intent moveDetail = new Intent(HomeActivity.this, DetailedActivity.class);
                moveDetail.putExtra(DetailedActivity.EXTRA_ITEM, place);
                startActivity(moveDetail);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.action_about){
            Intent aboutIntent = new Intent(HomeActivity.this, AboutActivity.class);
            startActivity(aboutIntent);
        }
        return super.onOptionsItemSelected(item);
    }
}
