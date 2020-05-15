//10-05-2020 - 15-05-2020 10117191-RizalMaulana-IF5
package com.apps.rizalmaulana.splashscreen.ui.music;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.apps.rizalmaulana.splashscreen.R;
import com.apps.rizalmaulana.splashscreen.adapter.RecycleViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class MusicFragment extends Fragment {

    private static final String TAG = "RecyclerViewFragment";


    protected RecyclerView mRecyclerView;
    protected RecycleViewAdapter mAdapter;
    protected RecyclerView.LayoutManager mLayoutManager;
    protected String[] mDataset, mDataset2;
    protected int[] mDataset3;

    int [] icon = {R.drawable.milet, R.drawable.aimer,R.drawable.lisa};
    String [] judul = {"Tell Me","Torches","Shirushi"};
    String [] deskripsi = {"Milet","Aimer","Lisa"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initDataset();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_musik, container, false);
        rootView.setTag(TAG);

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.recycle_music);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new RecycleViewAdapter(mDataset,mDataset2,mDataset3);

        mRecyclerView.setAdapter(mAdapter);

        return rootView;
    }

    private void initDataset() {
        mDataset = new String[judul.length];
        mDataset2 = new String[deskripsi.length];
        mDataset3 = new int[icon.length];
        for (int i = 0; i < judul.length; i++) {
            mDataset[i] = judul[i];
            mDataset2[i] = deskripsi[i];
            mDataset3[i] = icon[i];
        }
    }

}
