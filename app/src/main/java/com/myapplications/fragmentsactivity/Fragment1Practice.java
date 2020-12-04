package com.myapplications.fragmentsactivity;

import  androidx.fragment.app.Fragment;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;//import androidx.annotation.@Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;

public class Fragment1Practice extends Fragment{


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle saveInstanceState){

        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment1layout, container, false);

        return rootView;
    }
}