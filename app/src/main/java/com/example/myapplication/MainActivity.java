package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    PunktyViewModel punktyViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        punktyViewModel = new ViewModelProvider(this).get(PunktyViewModel.class);

        binding.punktyTextView.setText(Integer.toString(punktyViewModel.getPunkty()));

        //dzięki bindowaniu widoków nie musimy uzywać findViewById
        //https://developer.android.com/topic/libraries/view-binding
        binding.button1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punktyViewModel.dodajPunkty(1);
                        binding.punktyTextView.setText(Integer.toString(punktyViewModel.getPunkty()));
                    }
                }
        );
        binding.button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punktyViewModel.dodajPunkty(2);
                        binding.punktyTextView.setText(Integer.toString(punktyViewModel.getPunkty()));
                    }
                }
        );
        binding.button3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punktyViewModel.dodajPunkty(3);
                        binding.punktyTextView.setText(Integer.toString(punktyViewModel.getPunkty()));
                    }
                }
        );

    }
}