package com.dicoding.picodiploma.jalankuy.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.dicoding.picodiploma.jalankuy.R;
import com.dicoding.picodiploma.jalankuy.model.Place;

public class DetailedActivity extends AppCompatActivity {

    public static String EXTRA_ITEM = "extra_item";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        ImageView imgPhoto;
        TextView tvName, tvLocation, tvDescription;

        imgPhoto = findViewById(R.id.img_item_photo);
        tvName = findViewById(R.id.tv_place_name);
        tvLocation = findViewById(R.id.tv_place_location);
        tvDescription = findViewById(R.id.tv_place_description);

        Place place = getIntent().getParcelableExtra(EXTRA_ITEM);

        if (place != null) {
            Glide.with(this)
                    .load(place.getPhoto())
                    .into(imgPhoto);
            tvName.setText(place.getName());
            tvLocation.setText(place.getLocation());
            tvDescription.setText(place.getDescription());
        }

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Detail Tempat Wisata");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
}
