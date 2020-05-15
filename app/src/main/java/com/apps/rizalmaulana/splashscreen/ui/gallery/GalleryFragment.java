package com.apps.rizalmaulana.splashscreen.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.apps.rizalmaulana.splashscreen.R;
import com.apps.rizalmaulana.splashscreen.adapter.GridAdapter;

public class GalleryFragment extends Fragment {

    RecyclerView mRecycleView;
    RecyclerView.LayoutManager mLayoutManager;
    RecyclerView.Adapter mAdapter;

   public GalleryFragment() {

   }

   @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       View v = inflater.inflate(R.layout.fragment_gallery, container, false);
       mRecycleView = (RecyclerView) v.findViewById(R.id.recycle_img);
       mRecycleView.setHasFixedSize(true);

       mLayoutManager = new GridLayoutManager(getActivity(), 2);
       mRecycleView.setLayoutManager(mLayoutManager);

       mAdapter = new GridAdapter();
       mRecycleView.setAdapter(mAdapter);
       return v;
   }
}
