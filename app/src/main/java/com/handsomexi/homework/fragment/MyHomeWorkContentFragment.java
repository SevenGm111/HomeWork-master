//package com.handsomexi.homework.fragment;
//
//import android.content.Context;
//import android.os.Bundle;
//import android.support.annotation.NonNull;
//import android.support.annotation.Nullable;
//import android.support.v4.app.Fragment;
//import android.support.v7.widget.LinearLayoutManager;
//import android.support.v7.widget.RecyclerView;
//import android.util.Log;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Toast;
//
//import com.handsomexi.homework.Myapp;
//import com.handsomexi.homework.adapter.ContentAdapter;
//import com.handsomexi.homework.bean.MyHomeWorkBean;
//import com.handsomexi.homework.R;
//import com.handsomexi.homework.util.DividerUtil;
//
//import org.greenrobot.eventbus.EventBus;
//import org.greenrobot.eventbus.Subscribe;
//import org.greenrobot.eventbus.ThreadMode;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import butterknife.BindView;
//import butterknife.ButterKnife;
//import butterknife.Unbinder;
//
//public class MyHomeWorkContentFragment extends Fragment {
//
//    Unbinder unbinder;
//
//    private String ShowSubject;
//    private List<MyHomeWorkBean> mContentList = new ArrayList<>();
//    private MyHomeWorkBean mMyHomeWorkBean[];
//    ContentAdapter contentAdapter;
//    LinearLayoutManager mLayoutManager;
//
//    @BindView(R.id.content_recycler_list)
//    RecyclerView content_recycler_list;
//
//    public static MyHomeWorkContentFragment newInstence(){
//        MyHomeWorkContentFragment fragment = new MyHomeWorkContentFragment();
//        //fragment.setArguments(bundle);
//        return fragment;
//    }
//
//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//    }
//
//    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.fragment_a2_content,container,false);
//        unbinder = ButterKnife.bind(this,view);
//        //EventBus.getDefault().register(this);
//
//        return view;
//    }
//
//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//         super.onActivityCreated(savedInstanceState);
//        initContentList();
//        if (ShowSubject == null){
//            refresh(mMyHomeWorkBean[0].getSubject());
//        } else {
//
//        }
//
////        LinearLayoutManager layoutManager = new LinearLayoutManager(this.getContext());
////        content_recycler_list.setLayoutManager(layoutManager);
////        content_recycler_list.addItemDecoration(new DividerUtil());                       //添加分割线
////        ContentAdapter contentAdapter = new ContentAdapter(mContentList);
////        content_recycler_list.setAdapter(contentAdapter);
//    }
//
//    @Override
//    public void onDestroy() {
//        super.onDestroy();
//        unbinder.unbind();
//        //EventBus.getDefault().unregister(this);
//    }
//
//    public  void refresh(String subject){
//        initContentList();
//        ShowSubject = subject;
//        //从数据源中挑选出被点击的那个科目的数据
//        if (ShowSubject == null){
//            Toast.makeText(Myapp.getInstances(), "开始记录你的错题集吧", Toast.LENGTH_SHORT).show();
//
//        } else {
//            for (int i = 0; i < mMyHomeWorkBean.length; i++){
//                if (mMyHomeWorkBean[i].getSubject().equals(ShowSubject)){
//                    mContentList.add(mMyHomeWorkBean[i]);
//                }
//            }
//        }
//        if (contentAdapter == null){
//
//            mLayoutManager = new LinearLayoutManager(Myapp.getInstances());
//            content_recycler_list.setLayoutManager(mLayoutManager);
//            content_recycler_list.addItemDecoration(new DividerUtil());                       //添加分割线
//            contentAdapter = new ContentAdapter(mContentList);
//            content_recycler_list.setAdapter(contentAdapter);
//        } else {
//            contentAdapter.clear();
//            contentAdapter.addData(mContentList);
//        }
//
//
//    }
//
//
//    private void initContentList() {
//        //初始化数据源，之后就是用数据库保存数据
//        mMyHomeWorkBean = new MyHomeWorkBean[10];
//        mMyHomeWorkBean[0] = new MyHomeWorkBean("语文","20180304",3,"小学二年级","3");
//        mMyHomeWorkBean[1] = new MyHomeWorkBean("数学","19970604",4,"初中一年级","2");
//        mMyHomeWorkBean[2] = new MyHomeWorkBean("英语","20180614",1,"小学五年级","2");
//        mMyHomeWorkBean[3] = new MyHomeWorkBean("物理","20180304",3,"小学六年级","3");
//        mMyHomeWorkBean[4] = new MyHomeWorkBean("化学","19970604",4,"高中一年级","2");
//        mMyHomeWorkBean[5] = new MyHomeWorkBean("生物","20180614",1,"小学五年级","2");
//        mMyHomeWorkBean[6] = new MyHomeWorkBean("数学","20200101",3,"小学二年级","3");
//        mMyHomeWorkBean[7] = new MyHomeWorkBean("数学","20000505",4,"初中一年级","2");
//        mMyHomeWorkBean[8] = new MyHomeWorkBean("英语","20130202",1,"小学五年级","2");
//        mMyHomeWorkBean[9] = new MyHomeWorkBean("语文","19970203",3,"初中二年级","3");
//
//    }
//
//    /*@Subscribe(threadMode = ThreadMode.POSTING)
//    public void onEvent(String data){
//        ShowSubject = data;
//        //Log.d("my","这个科目为"+ShowSubject);
//    }*/
//
//
//
//}
