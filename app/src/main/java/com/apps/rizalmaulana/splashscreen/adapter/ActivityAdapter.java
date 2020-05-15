package com.apps.rizalmaulana.splashscreen.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.apps.rizalmaulana.splashscreen.R;

public class ActivityAdapter extends RecyclerView.Adapter<ActivityAdapter.ViewHolder> {
    private static final String TAG = "ActivityAdapter";

    private String[] mDataSet4,mDataSet5, mDataSet7;
    private int[] mDataSet6;


    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView3,textView4, textView5;
        private final ImageView icon_activity;

        public ViewHolder(View v) {
            super(v);
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d(TAG, "Element " + getPosition() + " clicked.");
                }
            });
            textView3 = (TextView) v.findViewById(R.id.nama_activity);
            textView4 = (TextView) v.findViewById(R.id.desc_activity);
            textView5 = (TextView) v.findViewById(R.id.jam);
            icon_activity = (ImageView) v.findViewById(R.id.icon_activity);

        }

        public TextView getTextView3() {
            return textView3;
        }
        public TextView getTextView4() {
            return textView4;
        }
        public TextView getTextView5() { return textView5; }
        public ImageView getImageView2() {
            return icon_activity;
        }
    }


    public ActivityAdapter (String[] dataSet4,String[] dataSet5, int[] dataSet6, String[] dataSet7) {
        this.mDataSet4 = dataSet4;
        this.mDataSet5 = dataSet5;
        this.mDataSet6 = dataSet6;
        this.mDataSet7 = dataSet7;
    }

    @Override
    public ActivityAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.list_activity, viewGroup, false);


        return new ActivityAdapter.ViewHolder(v);
    }


    @Override
    public void onBindViewHolder(ActivityAdapter.ViewHolder viewHolder, final int position) {
        Log.d(TAG, "Element " + position + " set.");

        viewHolder.getTextView3().setText(mDataSet4[position]);
        viewHolder.getTextView4().setText(mDataSet5[position]);
        viewHolder.getImageView2().setImageResource(mDataSet6[position]);
        viewHolder.getTextView5().setText(mDataSet7[position]);
    }


    @Override
    public int getItemCount() {
        return mDataSet4.length;
    }
}
