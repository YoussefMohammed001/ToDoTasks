package com.example.todotasks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.todotasks.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding  binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        setContentView(binding.getRoot());


        binding.floating.setOnClickListener(view -> openToAddTask());
    }

    private void openToAddTask() {
AddTask.newInstance().show(getSupportFragmentManager(),AddTask.TAG);
    }
}