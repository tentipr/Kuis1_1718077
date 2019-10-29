package com.example.a1718077;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private KeluargaAdapter adapter;
    private ArrayList<Keluarga>keluargaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = findViewById(R.id.recycleview);
        adapter = new KeluargaAdapter(keluargaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData()
    {
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new Keluarga(getDrawable(R.drawable.bpk),"Latif Usman","Ayah"));
        keluargaArrayList.add(new Keluarga(getDrawable(R.drawable.ibu),"Siti Aisyah","Ibu"));
        keluargaArrayList.add(new Keluarga(getDrawable(R.drawable.mas),"Adi Sucipto","Anak Ke-1"));
        keluargaArrayList.add(new Keluarga(getDrawable(R.drawable.tentipr),"Tenti Pristiani","Anak Ke-2"));
    }
}
