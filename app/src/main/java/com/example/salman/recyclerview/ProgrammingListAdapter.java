package com.example.salman.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Salman on 10/13/2017.
 */

public class ProgrammingListAdapter extends RecyclerView.Adapter<ProgrammingListAdapter.ProgrammingViewHolder> {

    LayoutInflater inflater;
    private String[] data;

    public ProgrammingListAdapter(String[] data) {
        this.data = data;
    }

    @Override
    public ProgrammingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_layout, parent, false);

        return new ProgrammingViewHolder(view);

    }

    @Override
    public void onBindViewHolder(ProgrammingViewHolder holder, int position) {
        String title=data[position];
        holder.tv.setText(title);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ProgrammingViewHolder extends RecyclerView.ViewHolder {

        ImageView iv;
        TextView tv;

        public ProgrammingViewHolder(View itemView) {
            super(itemView);
            iv=(ImageView)itemView.findViewById(R.id.imgIcon);
            tv=(TextView)itemView.findViewById(R.id.textTitle);

        }
    }


}