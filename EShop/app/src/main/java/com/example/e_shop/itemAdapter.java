package com.example.e_shop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

  public class itemAdapter extends ArrayAdapter {
      List<Item> itemList;

      public itemAdapter(@NonNull Context context, int resource, @NonNull List objects) {
          super(context, resource, objects);

          itemList = objects;

      }


      @NonNull
      @Override
      public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

          View view = LayoutInflater.from(getContext()).inflate(R.layout.item_row, parent, false);

          Item currentItem = itemList.get(position) ;

          TextView ctp =     view.findViewById(R.id.ctp) ;
          TextView ct =    view.findViewById(R.id.ct) ;
          ImageView cti =   view.findViewById(R.id.cti) ;

          ct.setText(currentItem.getItemName());
          ctp.setText(String.valueOf(currentItem.getItemPrice()));
          cti.setImageResource(currentItem.getItemImage());

          return  view ;


      }

  }

