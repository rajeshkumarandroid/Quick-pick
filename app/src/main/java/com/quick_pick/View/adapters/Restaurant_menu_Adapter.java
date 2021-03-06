package com.quick_pick.View.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.quick_pick.R;

/**
 * Created by Rajesh Kumar on 20-11-2017.
 */

public class Restaurant_menu_Adapter extends RecyclerView.Adapter<Restaurant_menu_Adapter.MyViewHolder> {
    private MyViewHolder holder;
    View root;
    Context context;

    public Restaurant_menu_Adapter(Context context) {
        this.context = context;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView;


        public MyViewHolder(View view) {
            super(view);
            textView = (TextView) view.findViewById(R.id.txt_item);

        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        root = LayoutInflater.from(parent.getContext()).inflate(R.layout.resuarunt_menu_item, parent, false);
        holder = new MyViewHolder(root);
        return holder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {

        holder.textView.setText("Item " + (position + 1));
    }

    @Override
    public int getItemCount() {
        return 20;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}

