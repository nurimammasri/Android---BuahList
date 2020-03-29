package com.dicoding.buahlist;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatRatingBar;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class MoreDetailFruits extends AppCompatActivity {

    ImageView imageFruits, ic_favourite;
    TextView nameFruit, detailFruits, detailMorefruits, detailRating;
    Boolean is_favourite = false;
    AppCompatRatingBar RatingBar;
    TextView getRating;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.more_detail_fruit);

        imageFruits = findViewById(R.id.image_buah);
        nameFruit = findViewById(R.id.tv_item_namafruit);
        detailMorefruits = findViewById(R.id.detail_more_fruit);
        detailFruits = findViewById(R.id.deskripsi);
        detailRating = findViewById(R.id.rating);
        ic_favourite = findViewById(R.id.ic_favourite);

        RatingBar = findViewById(R.id.penilaian);
        getRating = findViewById(R.id.rate);

        tampilDetail();


        ic_favourite.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (is_favourite == false) {
                    is_favourite = true;
                    ic_favourite.setColorFilter(Color.RED);

                    Toast.makeText(view.getContext(), "I Like it", Toast.LENGTH_SHORT).show();
                } else {
                    is_favourite = false;
                    ic_favourite.setColorFilter(Color.BLACK);
                }
            }
        });

        RatingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float nilai, boolean b) {

                getRating.setText("Rating: "+nilai);
            }
        });

    }


    private void tampilDetail() {
        Intent intent = getIntent();

        int foto = intent.getIntExtra("FOTO", 0);
        String judul = intent.getStringExtra("NAMA_BUAH");
        String about = intent.getStringExtra("ABOUT");
        String deskripsi = intent.getStringExtra("DESKRIPSI");
        String rating = intent.getStringExtra("RATING");


        // tampilkan data di titlebar
        getSupportActionBar().setTitle(judul);
        getSupportActionBar().show();
        nameFruit.setText(judul);

        // tampilkan gambar
        Glide.with(this)
                .load(foto)
                .apply(new RequestOptions().override(350, 550))
                .into(imageFruits);

        // tampilkan data judul, banyak halaman dll
        detailMorefruits.setText(about);

        // tampilkan data deskripsi
        detailFruits.setText(deskripsi);

        // tampilkan data rating
        detailRating.setText(rating);
    }
}

