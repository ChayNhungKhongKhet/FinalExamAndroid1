package com.phamtantb24.finalexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private List<CongAn> congAns;
    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ListView mListView = findViewById(R.id.mListView);
        congAns = new ArrayList<>();
        congAns.add(new CongAn("Pham Ngoc Tan", "Thuong Uy", "Quang Binh", "VietNam", 4));
        congAns.add(new CongAn("Pham Ngoc Giau", "Trung Ta", "Quang Binh", "VietNam", 2));
        congAns.add(new CongAn("Le Van Do", "Binh Thuong", "Quang Binh", "VietNam", 1));
        congAns.add(new CongAn("Le Huy Ngo", "Si Quan", "Quang Binh", "VietNam", 3));
        congAns.add(new CongAn("Do Tan Tu", "Trung Ta", "Quang Binh", "VietNam", 2));
        congAns.add(new CongAn("Pham Van Huy", "Trung Ta", "Quang Binh", "VietNam", 2));

        customAdapter = new CustomAdapter(this, R.layout.recycleview_row, congAns);
        mListView.setAdapter(customAdapter);
    }
}