package com.peak.mixen.Fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.peak.mixen.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstTutorialSlide extends android.support.v4.app.Fragment {


    public FirstTutorialSlide() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first_tutorial_slide, container, false);
    }


}
