package com.dicoding.buahlist;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewFruitAdapter extends RecyclerView.Adapter<CardViewFruitAdapter.CardViewViewHolder> {
    private ArrayList<Fruit> listFruit;

    public CardViewFruitAdapter(ArrayList<Fruit> list) {
        this.listFruit = list;
    }



    public interface OnItemClickCallback {
        void onItemClicked(Fruit data);
    }

    private CardViewFruitAdapter.OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(CardViewFruitAdapter.OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_card_view, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {

        final Fruit fruit = listFruit.get(position);

        Glide.with(holder.itemView.getContext())
                .load(fruit.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);

        holder.tvName.setText(fruit.getNamaBuah());
        holder.tvDetail.setText(fruit.getDetail());
        holder.tvRating.setText(fruit.getRating());

        holder.btnMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), listFruit.get(holder.getAdapterPosition()).getNamaBuah(), Toast.LENGTH_SHORT).show();

                Intent goToDetail = new Intent(v.getContext().getApplicationContext(), MoreDetailFruits.class);
                goToDetail.putExtra("FOTO", fruit.getPhoto());
                goToDetail.putExtra("NAMA_BUAH", fruit.getNamaBuah());
                goToDetail.putExtra("ABOUT", fruit.getMoreDetailBuah());
                goToDetail.putExtra("DESKRIPSI", fruit.getDetail());
                goToDetail.putExtra("RATING", fruit.getRating());

                v.getContext().startActivity(goToDetail);
            }
        });

        holder.btnFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), listFruit.get(holder.getAdapterPosition()).getNamaBuah()+" telah ditambahkan dalam list Favorite Anda Favorite", Toast.LENGTH_SHORT).show();
            }
        });

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listFruit.get(holder.getAdapterPosition()));

                Intent goToDetail = new Intent(v.getContext().getApplicationContext(), MoreDetailFruits.class);
                goToDetail.putExtra("FOTO", fruit.getPhoto());
                goToDetail.putExtra("NAMA_BUAH", fruit.getNamaBuah());
                goToDetail.putExtra("ABOUT", fruit.getMoreDetailBuah());
                goToDetail.putExtra("DESKRIPSI", fruit.getDetail());
                goToDetail.putExtra("RATING", fruit.getRating());

                v.getContext().startActivity(goToDetail);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listFruit.size();
    }




    class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail, tvRating;
        Button btnMore, btnFavorite;


        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.image_buah);
            tvName = itemView.findViewById(R.id.judul);
            tvDetail = itemView.findViewById(R.id.keterangan);
            btnMore = itemView.findViewById(R.id.more);
            btnFavorite = itemView.findViewById(R.id.favorite);
            tvRating = itemView.findViewById(R.id.rating);
        }

    }

}


