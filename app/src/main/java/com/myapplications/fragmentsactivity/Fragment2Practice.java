package com.myapplications.fragmentsactivity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;

public class Fragment2Practice extends Fragment{
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle saveInstanceState){
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment2layout, container,
                false);

        return rootView;
    }
}
