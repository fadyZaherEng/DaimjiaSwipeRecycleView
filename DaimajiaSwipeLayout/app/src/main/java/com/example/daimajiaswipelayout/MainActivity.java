package com.example.daimajiaswipelayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.balysv.materialripple.MaterialRippleLayout;
import com.daimajia.swipe.util.Attributes;
import com.example.daimajiaswipelayout.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    DaimjiaAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MVVM mvvm= ViewModelProviders.of(this).get(MVVM.class);
        ActivityMainBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_main);


        mvvm.GetData();
        mvvm.mutableLiveData.observe(this, new Observer<ArrayList<FaceBook>>() {
            @Override
            public void onChanged(ArrayList<FaceBook> faceBooks) {
                binding.rvDaimajia.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                adapter=new DaimjiaAdapter(faceBooks,MainActivity.this);
                adapter.setMode(Attributes.Mode.Single);
                binding.rvDaimajia.setAdapter(adapter);
                adapter.notifyDataSetChanged();
            }
        });

    }
}