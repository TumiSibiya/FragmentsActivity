package com.myapplications.fragmentsactivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.List;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    ViewPager viewPager;
    PagerAdapter pagerAdapter;

    List<Fragment> fragmentList;
    @Override
 public void onCreate(Bundle saveInstanceState){
     super.onCreate(saveInstanceState);
     setContentView(R.layout.fragment1layout);

     fragmentList = new ArrayList<>();
     fragmentList.add(new Fragment1Practice());
     fragmentList.add(new Fragment2Practice());
     fragmentList.add(new Fragment3Practice());

     viewPager = findViewById(R.id.fragment1_container_view_tagId);
     pagerAdapter = new MyFragmentAdapterPractice(getSupportFragmentManager() , fragmentList);
     viewPager.setAdapter(pagerAdapter);
 }
}