package com.example.notespickup.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.example.notespickup.Adapter.ImageSlider;
import com.example.notespickup.Model.ImageModelAdapter;
import com.example.notespickup.R;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator3;

public class HomeFragment extends Fragment {

//    private HomeViewModel homeViewModel;
//    SliderView sliderView;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        //for sliderView
        List<ImageModelAdapter> imageModelAdapterList = new ArrayList<>();
        imageModelAdapterList.add( new ImageModelAdapter("Download Notes","Do Smart. Be Smart.",R.drawable.seven));
        imageModelAdapterList.add( new ImageModelAdapter("Let Study Begins","Your only guide to every subject.",R.drawable.nine));
        imageModelAdapterList.add( new ImageModelAdapter("Complete Notes","Your only guide to every subject.",R.drawable.ten));
        imageModelAdapterList.add( new ImageModelAdapter("Complete Notes","Your only guide to every subject.",R.drawable.eight));
       imageModelAdapterList.add( new ImageModelAdapter("Complete Notes","Your only guide to every subject.",R.drawable.twelve));

        ImageSlider mAdapter =new ImageSlider(imageModelAdapterList,getContext());
        ViewPager2 viewpager = view.findViewById(R.id.viewPager2);
        viewpager.setAdapter(mAdapter);

        CircleIndicator3 indicator = view.findViewById(R.id.indicator);
        indicator.setViewPager(viewpager);
        mAdapter.notifyDataSetChanged();




        return view;
    }
}