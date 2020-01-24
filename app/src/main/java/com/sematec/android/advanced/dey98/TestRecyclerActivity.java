package com.sematec.android.advanced.dey98;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TestRecyclerActivity extends AppCompatActivity implements TestRecyclerClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_recycler);

        RecyclerView recycler = findViewById(R.id.recycler);
        ArrayList<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Qoli");
        names.add("Mamad");
        names.add("Saeed");
        names.add("Farhad");
        names.add("Roqaye");

        TestRecyclerAdapter adapter = new TestRecyclerAdapter(names,this);
        recycler.setAdapter(adapter);

    }

    @Override
    public void onClick(String name) {
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
    }
}
