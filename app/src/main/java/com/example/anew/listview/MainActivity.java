package com.example.anew.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv=findViewById(R.id.lv);
        String path="/Internal Storage/Pictures/Instagram";
        File f=new File(path);
        if(!f.exists())
        {
            path="/Internal Storage/Pictures/Instagram/";
            f=new File(path);
        }
        String[] files=f.list();
        String[] file={"abc","xyz","sdf"};
        ArrayAdapter<String> ada=new ArrayAdapter<>(this,android.R.layout.simple_list_item_single_choice,files);
        lv.setAdapter(ada);

    }
}
