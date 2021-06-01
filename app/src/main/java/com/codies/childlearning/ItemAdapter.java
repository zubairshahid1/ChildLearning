package com.codies.childlearning;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemsViewHolder> {


    List<Drawable> itemList;
    Context context;
    ItemClickListener itemClickListener;
    List<String> itemName;

    public ItemAdapter(List<Drawable> itemList, List<String> itemName , Context context, ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
        this.context = context;
        this.itemName = itemName;
        this.itemList = itemList;
    }

    public void setItems(List<Drawable> itemList, List<String> itemName) {
        this.itemName = itemName;
        this.itemList = itemList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ItemAdapter.ItemsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card_view, parent, false);
        ItemsViewHolder itemsViewHolder = new ItemsViewHolder(view);
        return itemsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.ItemsViewHolder holder, int position) {
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
            itemImage = itemView.findViewById(R.id.imagee);

            itemImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (itemClickListener != null) {
                        int position = getAdapterPosition();
                        String name = itemName.get(position);
                        itemClickListener.onClick(name,itemImage);
                        Log.i("HELL", "onClick: " + position);
                    }

                }
            });
        }
    }
}
