package com.codies.childlearning;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class AlphabetAdapter extends RecyclerView.Adapter<AlphabetAdapter.ItemsViewHolder> {


    List<Drawable> itemList;
    Context context;
    AlphabetClickListener alphabetClickListener;
    List<String> itemName;

    public AlphabetAdapter(List<Drawable> itemList, List<String> itemName , Context context, AlphabetClickListener alphabetClickListener) {
        this.alphabetClickListener = alphabetClickListener;
        this.context = context;
        this.itemName = itemName;
        this.itemList = itemList;
    }

    public void setItemList(List<Drawable> itemList) {
        this.itemList = itemList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ItemsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.alphabet_card_view, parent, false);
        ItemsViewHolder itemsViewHolder = new ItemsViewHolder(view);
        return itemsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemsViewHolder holder, int position) {
        Glide.with(context).load(itemList.get(position)).into(holder.itemImage);
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class ItemsViewHolder extends RecyclerView.ViewHolder{

        AppCompatImageView itemImage;

        public ItemsViewHolder(@NonNull final View itemView) {
            super(itemView);
            itemImage = itemView.findViewById(R.id.alphabet);

            itemImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (alphabetClickListener != null) {
                        int position = getAdapterPosition();
                        String name = itemName.get(position);
                        alphabetClickListener.onClick(name);
                    }

                }
            });
        }
    }
}
