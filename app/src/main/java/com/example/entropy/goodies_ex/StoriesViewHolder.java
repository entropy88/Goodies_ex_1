package com.example.entropy.goodies_ex;

import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by entropy on 4/9/2018.
 */

public class StoriesViewHolder extends RecyclerView.ViewHolder {
TextView txtName;
    TextView txtDate;
    TextView txtContent;
    ImageView imgStory;
    ImageView imgProfile;
    ImageButton imgButtonPopupMenu;
    ImageButton imgButtonSock;
    TextView tvThanksCount;
    TextView tvSendGift;



    public StoriesViewHolder(View itemView) {
        super(itemView);
        txtName= (TextView)itemView.findViewById(R.id.txt_profile_name);
        txtDate=(TextView)itemView.findViewById(R.id.txt_date);
        txtContent= (TextView) itemView.findViewById(R.id.txt_content);
        imgStory= (ImageView) itemView.findViewById(R.id.img_story);
        imgProfile=(ImageView) itemView.findViewById(R.id.img_profile_pic);
        imgButtonPopupMenu=(ImageButton) itemView.findViewById(R.id.img_pop_menu);
        imgButtonSock=(ImageButton)itemView.findViewById(R.id.img_btn_sock);
        tvThanksCount=(TextView)itemView.findViewById(R.id.tv_thanked_count);
        tvSendGift=(TextView) itemView.findViewById(R.id.tv_send_gift);

    }
}
