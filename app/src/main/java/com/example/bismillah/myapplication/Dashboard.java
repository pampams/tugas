package com.example.bismillah.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Dashboard extends Fragment {

    public Halaman1(){
        //required empty public constructor
    }

    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_dashboard);
//    }
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater infrater, ViewGroup container, Bundle savedInstanceState){
        //inflate this layout for this fragment
        return inflater.inflate(R.layout.activity_dashboard, container, false);
    }
}
