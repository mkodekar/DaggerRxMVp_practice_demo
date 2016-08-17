package com.e_magicindia.daggerrxpractice.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.e_magicindia.daggerrxpractice.R;
import com.e_magicindia.daggerrxpractice.model.Example;
import com.e_magicindia.daggerrxpractice.viewholders.ItemViewHolder;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by mkodekar on 8/17/2016.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<ItemViewHolder> {
    private final LayoutInflater inflater;
    private ArrayList<Example> examples;
    Context context;


    public RecyclerViewAdapter(LayoutInflater  layoutInflater, Context context) {
        this.inflater = layoutInflater;
        this.context = context;
    }


    public void setExamples(ArrayList<Example> examples) {
        this.examples = examples;
        notifyDataSetChanged();
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ItemViewHolder(inflater.inflate(R.layout.item_holder, parent, false));
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        Example example = examples.get(position);
        holder.bind(example);

    }

    @Override
    public int getItemCount() {
        return examples.size();
    }
}
