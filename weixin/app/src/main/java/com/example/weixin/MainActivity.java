package com.example.weixin;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {
      Fragment weixinFragment = new weixinFragment();
      Fragment contactFragment = new contactFragment();
      Fragment friendFragment = new friendFragment();
      Fragment settingFragment = new settingFragment();
      FragmentManager fm;

     LinearLayout tab01,tab02,tab03,tab04;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //列表
        tab01 = findViewById(R.id.tab01);
        tab02 = findViewById(R.id.tab02);
        tab03 = findViewById(R.id.tab03);
        tab04 = findViewById(R.id.tab04);

        weixinFragment = new weixinFragment();
        contactFragment = new contactFragment();
        friendFragment = new friendFragment();
        settingFragment = new settingFragment();

        fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();

        initialfragment();


        tab01.setOnClickListener(this);  //将当前的 Activity（或 Fragment）实例设置为 tab01 的点击事件监听器
        tab02.setOnClickListener(this);
        tab03.setOnClickListener(this);
        tab04.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
//        switch(view.getId()) {
//            case R.id.tab01: show(1);reset();tab1.setImageResource(R.drawable.a);break;
//            case R.id.tab02: show(2);reset();tab2.setImageResource(R.drawable.b);break;
//            case R.id.tab03: show(3);reset();tab3.setImageResource(R.drawable.c);break;
//            case R.id.tab04: show(4);reset();tab4.setImageResource(R.drawable.d);break;
//            default:break;
//        }
        if(view.getId()==R.id.tab01) show(1);
        if(view.getId()==R.id.tab02) show(2);
        if(view.getId()==R.id.tab03) show(3);
        if(view.getId()==R.id.tab04) show(4);
    }
    private void show(int i) {
        FragmentTransaction transaction = fm.beginTransaction();
        Hide(transaction);
        switch (i){
            case 1:transaction.show(weixinFragment);break;
            case 2:transaction.show(contactFragment);break;
            case 3:transaction.show(friendFragment);break;
            case 4:transaction.show(settingFragment);break;
            default:break;
        }
        transaction.commit();
    }

    public void initialfragment(){
        FragmentTransaction ft= fm.beginTransaction()  //重启事件
                                .add(androidx.appcompat.R.id.content,weixinFragment)
                                .add(androidx.appcompat.R.id.content,contactFragment)
                                .add(androidx.appcompat.R.id.content,friendFragment)
                                .add(androidx.appcompat.R.id.content,settingFragment)
                                .hide(weixinFragment)
                                .hide(contactFragment)
                                .hide(friendFragment)
                                .hide(settingFragment)
                                .show(weixinFragment);
        ft.commit();
    }
    private void Hide(FragmentTransaction ft) {
        ft.hide(weixinFragment)
          .hide(friendFragment)
          .hide(contactFragment)
          .hide(settingFragment);
    }

}