package com.apps.rizalmaulana.splashscreen.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.apps.rizalmaulana.splashscreen.R;
import com.apps.rizalmaulana.splashscreen.ui.gallery.row;

import java.util.ArrayList;
import java.util.List;

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.ViewHolder> {

    List<row> mItems;

    public GridAdapter() {
        super();
        mItems = new ArrayList<row>();
        row nama = new row();
        nama.setImg(R.drawable.me);
        mItems.add(nama);

        nama = new row();
        nama.setImg(R.drawable.mes);
        mItems.add(nama);

        nama = new row();
        nama.setImg(R.drawable.inu);
        mItems.add(nama);

        nama = new row();
        nama.setImg(R.drawable.kucing);
        mItems.add(nama);

        nama = new row();
        nama.setImg(R.drawable.kucings);
        mItems.add(nama);

        nama = new row();
        nama.setImg(R.drawable.mea);
        mItems.add(nama);

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.image_view, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        row nature = mItems.get(i);
        viewHolder.imgThumbnail.setImageResource(nature.getImg());
    }

    @Override
    public int getItemCount() {

        return mItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder  {


        public ImageView imgThumbnail;

        public ViewHolder(View itemView) {
            super(itemView);
            imgThumbnail = (ImageView)itemView.findViewById(R.id.row_img);

        }
    }
}
