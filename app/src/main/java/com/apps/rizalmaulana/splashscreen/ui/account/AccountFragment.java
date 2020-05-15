//15-05-2020 10117191-RizalMaulana-IF5
package com.apps.rizalmaulana.splashscreen.ui.account;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.apps.rizalmaulana.splashscreen.R;

public class AccountFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_account, container, false);

        TextView about = (TextView) root.findViewById(R.id.about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(v.getContext());
                dialog.setTitle("Informasi Aplikasi");
                dialog.setContentView(R.layout.layout_dialog);

                Button Dbtn = dialog.findViewById(R.id.ok);
                Dbtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });


        ImageView img = (ImageView) root.findViewById(R.id.fb);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/rizal.maulana.18488"));
                getActivity().startActivity(intent);
            }
        });

        ImageView img2 = (ImageView) root.findViewById(R.id.ig);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/zal.00/"));
                getActivity().startActivity(intent2);
            }
        });

        ImageView img3 = (ImageView) root.findViewById(R.id.maps);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/yGoNXwtrCbFm9TRA7"));
                getActivity().startActivity(intent3);
            }
        });

        return root;

        }

}

