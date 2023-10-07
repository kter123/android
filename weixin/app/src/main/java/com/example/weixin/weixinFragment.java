package com.example.weixin;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class weixinFragment extends Fragment{   //继承自Fragment类的weixinFragment类。在该类中，重写了onCreateView方法用于创建视图
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        return inflater.inflate(R.layout.first,container,false);
    }
}
