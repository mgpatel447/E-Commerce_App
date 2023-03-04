package com.example.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.foodorderapp.Adapters.MainAdapter;
import com.example.foodorderapp.Models.MainModel;
import com.example.foodorderapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();
        
        list.add(new MainModel(R.drawable.burger ,"Burger" ,"2" , "Chicken Burger with Extra Cheese"));
        list.add(new MainModel(R.drawable.cheeseburgerburger ,"cheeseburgerburger" , "3" ,  ""));
        list.add(new MainModel(R.drawable.clubsandwich ,  "clubsandwich" , "5" ,  ""));
        list.add(new MainModel(R.drawable.frenchfries ,  "frenchfriecs" , "2" ,  ""));
        list.add(new MainModel(R.drawable.friedchicken ,  "friedchicken" , "5" ,  ""));
        list.add(new MainModel(R.drawable.kabab ,  "kabab" , "3" ,  ""));
        list.add(new MainModel(R.drawable.milkshake ,  "milkshake" , "4" ,  ""));
        list.add(new MainModel(R.drawable.noodles ,  "noodles" , "2" ,  ""));
        list.add(new MainModel(R.drawable.pasta ,  "pasta" , "3" ,  ""));
        list.add(new MainModel(R.drawable.pizza ,  "pizza" , "5" ,  ""));
        list.add(new MainModel(R.drawable.popcorn ,  "popcorn" , "3" ,  ""));
        list.add(new MainModel(R.drawable.sandwich ,  "sandwich" , "2" ,  ""));
        list.add(new MainModel(R.drawable.softdrink ,  "softdrink" , "4" ,  ""));


        MainAdapter adapter = new MainAdapter(list , this);
        binding.recylerview.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recylerview.setLayoutManager(layoutManager);
    }
}