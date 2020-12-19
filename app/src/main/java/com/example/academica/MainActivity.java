package com.example.academica;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import  android.view.View.OnClickListener;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//      findViewById(R.id.register).setOnClickListener(v -> startActivity(new Intent(getApplicationContext(), RegistrationActivity.class)));


    }

    public void OnClkBtn(View view) {
        startActivity(new Intent(MainActivity.this, RegistrationActivity.class));
    }
}

// font - coveredByYourGrace