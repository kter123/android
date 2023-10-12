package com.example.weixin;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;



public class weixinFragment extends Fragment{   //继承自Fragment类的weixinFragment类。在该类中，重写了onCreateView方法用于创建视图
    private RecyclerView recyclerView;
    private List<String> list;
    private Context context;
    private Myadapter myadapter;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.first,container,false);
        context=view.getContext();
        recyclerView=view.findViewById(R.id.recyclerview);
        list=new ArrayList();

        for(int i=0;i<9;i++) {
            list.add("这是第"+i+"行数据");
        }
        myadapter = new Myadapter(context,list);
        recyclerView.setAdapter(myadapter);
        LinearLayoutManager manager=new LinearLayoutManager(context);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);

        return view;

    }

}

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
//        for(int i=0;i<9;i++) {
//            list.add("这是第"+i+"行数据");
//        }
//        context = this;
//        adapter = new Myadapter(this,list);
//        recycleview.setAdapter(adapter);
//        LinearLayoutManager manager = new LinearLayoutManager(this);
//        manager.setOrientation(RecyclerView.VERTICAL);
//        recycleview.setLayoutManager(manager);
//
//    }
//}