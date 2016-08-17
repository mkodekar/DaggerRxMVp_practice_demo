package com.e_magicindia.daggerrxpractice.viewholders;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.e_magicindia.daggerrxpractice.R;
import com.e_magicindia.daggerrxpractice.model.Example;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by mkodekar on 8/17/2016.
 */

public class ItemViewHolder extends RecyclerView.ViewHolder {

    ImageView itemphoto;

    TextView itemName;

    TextView itemPrice;

    public ItemViewHolder(View itemView) {
        super(itemView);
        itemphoto = (ImageView) itemView.findViewById(R.id.item_photo);
        itemName = (TextView) itemView.findViewById(R.id.itemName);
        itemPrice = (TextView) itemView.findViewById(R.id.itemPrice);

    }


    public void bind(Example example) {

        Glide.with(itemView.getContext()).load(example.getItemImgPath()).into(itemphoto);
        itemName.setText(example.getItemName());
        itemPrice.setText(example.getItemActRate());

    }
}
