package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView lstView = findViewById(R.id.lstview);

        ArrayList<Nation> lstNation = new ArrayList<>();
        lstNation.add(new Nation(R.drawable.argentina, "Argentina", "202.234.254"));
        lstNation.add(new Nation(R.drawable.brazil, "Brazil", "202.234.254"));
        lstNation.add(new Nation(R.drawable.cambodia, "Cambodia", "202.234.254"));
        lstNation.add(new Nation(R.drawable.singapore, "Singapore", "202.234.254"));
        lstNation.add(new Nation(R.drawable.usa, "USA", "202.234.254"));
        lstNation.add(new Nation(R.drawable.vietnam, "Viet Nam", "202.234.254"));

        NationAdapter nationAdapter = new NationAdapter(this, lstNation);

        lstView.setAdapter(nationAdapter);
    }


}