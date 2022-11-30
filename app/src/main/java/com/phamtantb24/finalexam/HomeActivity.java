package com.phamtantb24.finalexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private List<Author> authors;
    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ListView mListView = findViewById(R.id.mListView);
        authors = new ArrayList<>();
        authors.add(new Author("Pham Ngoc Tan", "Author top one in the world",5));
        authors.add(new Author("Pham Ngoc Tan", "Author top one in the world",4));
        authors.add(new Author("Pham Ngoc Tan", "Author top one in the world",4));
        authors.add(new Author("Pham Ngoc Tan", "Author top one in the world",2));
        authors.add(new Author("Pham Ngoc Tan", "Author top one in the world",1));

        customAdapter = new CustomAdapter(this, R.layout.recycleview_row, authors);
        mListView.setAdapter(customAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), ListLiteraryActivity.class);
                Bundle args = new Bundle();
                args.putSerializable("literaries",(Serializable)authors.get(position).getLiteraries());
                intent.putExtra("BUNDLE",args);
                startActivity(intent);
            }
        });
    }
}