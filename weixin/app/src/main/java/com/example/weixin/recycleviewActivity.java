package com.example.weixin;

//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.ListAdapter;
//import androidx.recyclerview.widget.RecyclerView;
//import java.util.ArrayList;
//import java.util.List;
//import android.annotation.SuppressLint;
//import android.content.Context;
//import android.os.Bundle;
//import android.view.ViewGroup;
//
//public class recycleviewActivity extends AppCompatActivity {
//    RecyclerView recycleview;
//    Myadapter adapter;
//    List<String> list;
//    Context context;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_recycleview);
//        recycleview = findViewById(R.id.recyclerview);
//        list = new ArrayList();
//
//        context = this;
//        adapter = new Myadapter(this,list);
//        recycleview.setAdapter(adapter);
//        LinearLayoutManager manager = new LinearLayoutManager(this);
//        manager.setOrientation(RecyclerView.VERTICAL);
//        recycleview.setLayoutManager(manager);
//
//    }
//}