package com.example.movielist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ma extends RecyclerView.Adapter {

    ArrayList<Moive>mArray;
    Context context;

    public ma(ArrayList<Moive> mArray, Context context) {
        this.mArray = mArray;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.mi,parent,false);
        Viewholder vh= new Viewholder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        ((Viewholder)holder).rating.setText(mArray.get(position).getRating()+"");
        ((Viewholder)holder).name.setText(mArray.get(position).getName()+"");
        ((Viewholder)holder).duration.setText(mArray.get(position).getDuration()+"");
        ((Viewholder)holder).img.setImageResource(mArray.get(position).getImg());


    }

    @Override
    public int getItemCount() {

        return mArray.size();
    }
    public static class Viewholder extends  RecyclerView.ViewHolder{
        public ImageView img;
        public TextView name;
        public  TextView rating;
        public TextView duration;
        public View view;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            img=itemView.findViewById(R.id.mi);
            name=itemView.findViewById(R.id.mn);
            duration=itemView.findViewById(R.id.md2);
            rating=itemView.findViewById((R.id.mr2));


        }
    }
}
