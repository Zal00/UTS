//13-05-2020 10117191-RizalMaulana-IF5
package com.apps.rizalmaulana.splashscreen.ui.daily;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.apps.rizalmaulana.splashscreen.R;
import com.apps.rizalmaulana.splashscreen.adapter.ActivityAdapter;
import com.apps.rizalmaulana.splashscreen.adapter.FriendAdapter;

public class DailyFragment extends Fragment {

    protected RecyclerView mRecyclerView;
    protected RecyclerView mRecyclerView2;
    protected FriendAdapter mAdapter;
    protected ActivityAdapter mAdapter2;
    protected RecyclerView.LayoutManager mLayoutManager;
    protected String[] mDataset, mDataset2, mDataset4, mDataset5, mDataset7;
    protected int[] mDataset3, mDataset6;

    int [] icon = {R.drawable.akbar, R.drawable.syahril,R.drawable.cecep,R.drawable.dep,R.drawable.purwa,R.drawable.irfan};
    String [] nama = {"AkbarFM","dimastasyahril","fuhrer1944","dev.","purwadandyrf","irfanafif_a"};
    String [] nama_asli = {"Akbar Faturrahman","Syahril Dimasta","Cecep Firdaus","Devi Supriyadi","Purwadandy","Irfan Afif"};

    int [] icon_activity = {R.drawable.ic_jam, R.drawable.ic_jam, R.drawable.ic_jam, R.drawable.ic_jam, R.drawable.ic_jam,R.drawable.ic_jam
    ,R.drawable.ic_jam,R.drawable.ic_jam,R.drawable.ic_jam,R.drawable.ic_jam,R.drawable.ic_jam,R.drawable.ic_jam};
    String [] nama_activity = {"Sahur", "Sholat Subuh", "Tidur", "Rebahan", "Mandi","Sholat Dzuhur","UAS AKB","Sholat Ashar"
    ,"UAS AKB","Buka Puasa","Sholat Isya","UAS AKB"};
    String [] desc_activity = {"Persiapan untuk sahur", "Melaksanakan Sholat subuh", "Istirahat","Sosmed, Youtube, dll", "Biar Seger"
    ,"Melaksanakan Sholat Dzuhur","Mengerjakan UAS AKB","Melaksanakan Sholat Ashar","Mengerjakan UAS AKB","Berbuka dan Sholat Maghrib"
    ,"Sholat isya dan Taraweh","Mengerjakan UAS AKB"};
    String [] jam = {"03:00", "04:40", "05:00","09:00","11:00","12:00","13:00","15:00","16:00","18:00","19:00","20:00"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        initDataset();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_daily, container, false);

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.recycle_friend);
        mRecyclerView2 = (RecyclerView) rootView.findViewById(R.id.recycle_activity);

        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity(), LinearLayoutManager.HORIZONTAL, false));
        mRecyclerView2.setLayoutManager(mLayoutManager);

        mAdapter = new FriendAdapter(mDataset,mDataset2,mDataset3);
        mAdapter2 = new ActivityAdapter(mDataset4,mDataset5,mDataset6,mDataset7);

        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView2.setAdapter(mAdapter2);


        return rootView;
    }


    private void initDataset() {
        mDataset = new String[nama.length];
        mDataset2 = new String[nama_asli.length];
        mDataset3 = new int[icon.length];
        mDataset4 = new String[nama_activity.length];
        mDataset5 = new String[desc_activity.length];
        mDataset6 = new int[icon_activity.length];
        mDataset7 = new String[jam.length];
        for (int i = 0; i < nama.length; i++) {
            mDataset[i] = nama[i];
            mDataset2[i] = nama_asli[i];
            mDataset3[i] = icon[i];
        }
        for (int i = 0; i < nama_activity.length; i++){
            mDataset4[i] = nama_activity[i];
            mDataset5[i] = desc_activity[i];
            mDataset6[i] = icon_activity[i];
            mDataset7[i] = jam[i];
        }
    }
}
