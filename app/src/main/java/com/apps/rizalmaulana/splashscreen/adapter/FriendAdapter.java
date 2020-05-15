//12-05-2020 10117191-RizalMaulana-IF5
package com.apps.rizalmaulana.splashscreen.adapter;

import android.provider.ContactsContract;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.apps.rizalmaulana.splashscreen.R;

public class FriendAdapter extends RecyclerView.Adapter<FriendAdapter.ViewHolder>{
    private static final String TAG = "FriendAdapter";

    private String[] mDataSet,mDataSet2;
    private int[] mDataSet3;




    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView,textView2;
        private final ImageView icon;

        public ViewHolder(View v) {
            super(v);

            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d(TAG, "Element " + getPosition() + " clicked.");
                }
            });
            textView = (TextView) v.findViewById(R.id.akun);
            textView2 = (TextView) v.findViewById(R.id.nama_asli);
            icon = (ImageView) v.findViewById(R.id.img_friend);

        }

        public TextView getTextView() {
            return textView;
        }
        public TextView getTextView2() {
            return textView2;
        }
        public ImageView getImageView() {
            return icon;
        }
    }


    public FriendAdapter (String[] dataSet,String[] dataSet2, int[] dataSet3) {
        this.mDataSet = dataSet;
        this.mDataSet2 = dataSet2;
        this.mDataSet3 = dataSet3;
    }


    @Override
    public FriendAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.flist_view, viewGroup, false);


        return new FriendAdapter.ViewHolder(v);
    }



    @Override
    public void onBindViewHolder(FriendAdapter.ViewHolder viewHolder, final int position) {
        Log.d(TAG, "Element " + position + " set.");

        viewHolder.getTextView().setText(mDataSet[position]);
        viewHolder.getTextView2().setText(mDataSet2[position]);
        viewHolder.getImageView().setImageResource(mDataSet3[position]);
    }



    @Override
    public int getItemCount() {
        return mDataSet.length;
    }
}
