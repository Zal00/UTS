package com.apps.rizalmaulana.splashscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private ViewPager mSlideViewPager;
    private LinearLayout  mdots_layout;

    private TextView[] mDots;

    private SliderAdapter sliderAdapter;

    private Button mNextbtn;
    private Button mPrevbtn;
    private Button mfinishbtn;

    private int mCurrentPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mSlideViewPager = (ViewPager) findViewById(R.id.SlideViewPager);
        mdots_layout = (LinearLayout) findViewById(R.id.dotslayout);

        mNextbtn = (Button) findViewById(R.id.next_btn);
        mPrevbtn = (Button) findViewById(R.id.prev_btn);
        mfinishbtn = (Button) findViewById(R.id.finish_btn);

        sliderAdapter = new SliderAdapter(this);
        mSlideViewPager.setAdapter(sliderAdapter);
        addDotsIndicator(0);

        mSlideViewPager.addOnPageChangeListener(viewListener);

        mNextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mSlideViewPager.setCurrentItem(mCurrentPage + 1);
            }
        });

        mPrevbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSlideViewPager.setCurrentItem(mCurrentPage - 1);
            }
        });

        mfinishbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I = new Intent(Main2Activity.this, Main3Activity.class );
                startActivity(I);
            }
        });

    }

    public void addDotsIndicator(int position){
        mDots = new TextView[3];
        mdots_layout.removeAllViews();

        for(int i = 0; i < mDots.length; i++){
            mDots[i] = new TextView( this);
            mDots[i].setText(Html.fromHtml("&#8226;"));
            mDots[i].setTextSize(35);
            mDots[i].setTextColor(getResources().getColor(R.color.transparanWhite));

            mdots_layout.addView(mDots[i]);
        }

        if (mDots.length > 0) {
            mDots[position].setTextColor(getResources().getColor(R.color.white));
        }
    }


    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
       @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {
            addDotsIndicator(i);
            mCurrentPage = i;

            if (i == 0){
                mNextbtn.setEnabled(true);
                mPrevbtn.setEnabled(false);
                mfinishbtn.setEnabled(false);
                mPrevbtn.setVisibility(View.VISIBLE);

                mNextbtn.setText("Next");
                mPrevbtn.setText("");
                mfinishbtn.setText("");
            } else if (i == mDots.length -1) {
                mNextbtn.setEnabled(false);
                mPrevbtn.setEnabled(true);
                mfinishbtn.setEnabled(true);
                mPrevbtn.setVisibility(View.VISIBLE);
                mfinishbtn.setVisibility(View.VISIBLE);

                mNextbtn.setText("");
                mPrevbtn.setText("Back");
                mfinishbtn.setText("Finish");
            } else {
                mNextbtn.setEnabled(true);
                mPrevbtn.setEnabled(true);
                mfinishbtn.setEnabled(false);
                mPrevbtn.setVisibility(View.VISIBLE);

                mNextbtn.setText("Next");
                mPrevbtn.setText("Back");
                mfinishbtn.setText("");
            }
        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };
}
