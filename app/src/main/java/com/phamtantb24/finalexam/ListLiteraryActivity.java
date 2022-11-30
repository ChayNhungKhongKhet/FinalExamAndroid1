package com.phamtantb24.finalexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListLiteraryActivity extends AppCompatActivity {
    ListView lv;
    List<Literary> literaries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_literary);
        lv = findViewById(R.id.listViewLiterary);
        Intent intent = getIntent();
        Bundle args = intent.getBundleExtra("BUNDLE");
        ArrayList<Literary> literaries = (ArrayList<Literary>) args.getSerializable("literaries");
        ArrayAdapter adapter = new ArrayAdapter(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                literaries);
        lv.setAdapter(adapter);


    }
}