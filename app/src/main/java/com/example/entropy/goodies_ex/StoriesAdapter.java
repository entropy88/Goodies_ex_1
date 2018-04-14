package com.example.entropy.goodies_ex;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.List;

/**
 * Created by entropy on 4/9/2018.
 */

class StoriesAdapter extends RecyclerView.Adapter<StoriesViewHolder> {
    private List<Post> data;


    public StoriesAdapter(List<Post> data) {
        this.data=data;
    }

    @Override
    public StoriesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.post_layout,parent,false);
        StoriesViewHolder viewHolder= new StoriesViewHolder(view);


        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final StoriesViewHolder holder, int position) {
        Post item=data.get(position);

        holder.txtName.setText(item.getName());
        holder.txtDate.setText(item.getPlaceAndDate());
        holder.txtContent.setText(item.getContent());
        holder.imgStory.setImageResource(item.getImageId());
        holder.imgProfile.setImageResource(item.getProfileImageId());
        holder.imgButtonPopupMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {

                //creating a popup menu
                PopupMenu popup = new PopupMenu(view.getContext(),holder.imgButtonPopupMenu);
                //inflating menu from xml resource
                popup.inflate(R.menu.popup_post_menu);
                //adding click listener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_1:
                                Toast.makeText (view.getContext(),"Action 1",Toast.LENGTH_LONG).show();
                                break;
                            case R.id.action_2:
                                Toast.makeText (view.getContext(),"Action 2",Toast.LENGTH_LONG).show();
                                break;
                                              }
                        return false;
                    }
                });
                //displaying the popup
                popup.show();

            }
        });
        holder.imgButtonSock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.imgButtonSock.setImageResource(R.mipmap.thank_0);
                int thanksCountInt=Integer.parseInt(holder.tvThanksCount.getText().toString());
                thanksCountInt++;
                holder.tvThanksCount.setText(String.valueOf(thanksCountInt));
                holder.imgButtonSock.setClickable(false);
            }
        });

        holder.tvSendGift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              holder.tvSendGift.setClickable(false);
                holder.tvSendGift.setText("Gift sent");
            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
