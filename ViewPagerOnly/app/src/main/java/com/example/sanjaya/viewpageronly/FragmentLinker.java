package com.example.sanjaya.viewpageronly;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by sanjaya on 5/4/2017.
 */

public class FragmentLinker extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragmentlayout, container, false);//isi viewpager dengan fragment ketika mau ditampilkan
        return rootView;
    }
}
