package com.myapplications.fragmentsactivity;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import java.util.List;
import java.util.ArrayList;

public class MyFragmentAdapterPractice extends FragmentStatePagerAdapter{

    private List<Fragment> myFragmentList;

    public MyFragmentAdapterPractice(FragmentManager fragmentManager, List<Fragment> fragmentList){
        super(fragmentManager);
        this.myFragmentList = fragmentList;
    }
    @Override
    public Fragment getItem(int position){
        return myFragmentList.get(position);
    }
    @Override
    public int getCount(){
        return myFragmentList.size();
    }

}
