package com.sematec.android.advanced.dey98;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TestJavaActivity extends AppCompatActivity implements TestPersonInterface, View.OnClickListener {

    public TestJavaActivity(){

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_java);

        Button btnSave = findViewById(R.id.btnSave);
        Button btnDelete = findViewById(R.id.btnDelete);


        btnSave.setOnClickListener(this);
        btnDelete.setOnClickListener(this);

        TestPersonClass person = new TestPersonClass();

        person.setPerson(this);

        TestPersonClass.aStaticFunction();

    }

    @Override
    public void printName() {
        Log.d("TAG", "NAME");
    }

    @Override
    public String getName() {
        return "Qoli";
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSave:
                break;
        }
    }
}
