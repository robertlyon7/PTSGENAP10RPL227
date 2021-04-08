package com.example.ptsgenap10rpl227;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.ViewHolder> {

    Song[] songs;
    Context context;

    public SongAdapter(Song[] songs,MainActivity2 activity2) {
        this.songs=songs;
        this.context=activity2;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.song_item_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Song songlist = songs[position];
        holder.textViewName.setText(songlist.getSongName());
        holder.textViewArtist.setText(songlist.getArtistName());
        holder.imageSong.setImageResource(songlist.getSongImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, songlist.getSongName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return songs.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageSong;
        TextView textViewName;
        TextView textViewArtist;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageSong = itemView.findViewById(R.id.imageview);
            textViewName = itemView.findViewById(R.id.tv_name);
            textViewArtist = itemView.findViewById(R.id.tv_artist);
        }
    }
}
