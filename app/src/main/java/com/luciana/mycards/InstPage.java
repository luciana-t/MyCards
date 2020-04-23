package com.luciana.mycards;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class InstPage extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager instManager;

    RecyclerView.Adapter instAdapter;
    ArrayList<String> items; //Classe

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inst);

        ArrayList<InstPOJO> listItem = new ArrayList<InstPOJO>();
        listItem.add(new InstPOJO("Coliseum","Disij",R.drawable.caliseu));
        listItem.add(new InstPOJO("Paris", "Oui", R.drawable.caliseu));

        recyclerView = findViewById(R.id.recyclerView);
       // recyclerView.setLayoutManager(new LinearLayoutManager(this));
        instManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(instManager);

        instAdapter = new InstAdapter(this, listItem);
        recyclerView.setAdapter(instAdapter);


    }
}
