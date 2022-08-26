package com.example.e_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
   ArrayList<Item> Items = new ArrayList<>() ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Item item1 = new Item("French fries", R.drawable.fries,  0.75   ) ;
        Item item2 = new Item("Chocolate" , R.drawable.chocolate , 0.25  ) ;
        Item item3 = new Item("Coffee" , R.drawable.coffee , 0.75  ) ;
        Item item4 = new Item("Honey" , R.drawable.honey , 3.25  ) ;
        Item item5 = new Item("Cheese" , R.drawable.cheese , 0.5  ) ;
        Item item6 = new Item("Donut" , R.drawable.donut , 0.25  ) ;

        Items.add(item1) ;
        Items.add(item2) ;
        Items.add(item3) ;
        Items.add(item4) ;
        Items.add(item5) ;
        Items.add(item6) ;

        itemAdapter itemAdapter = new itemAdapter(this , 0 ,Items ) ;

        ListView listView = findViewById(R.id.listView) ;
        listView.setAdapter(itemAdapter);



    }
}