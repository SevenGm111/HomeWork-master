//package com.handsomexi.homework.fragment;
//
//import android.content.Context;
//import android.os.Bundle;
//import android.support.annotation.NonNull;
//import android.support.annotation.Nullable;
//import android.support.v4.app.Fragment;
//import android.support.v7.widget.LinearLayoutManager;
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Toast;
//
//import com.handsomexi.homework.Myapp;
//import com.handsomexi.homework.R;
//import com.handsomexi.homework.adapter.SubjectAdapter;
//import com.handsomexi.homework.view.IndicatorView;
//
//import org.greenrobot.eventbus.EventBus;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import butterknife.BindView;
//import butterknife.ButterKnife;
//import butterknife.Unbinder;
//
//public class MyHomeWorkSubjectFragment extends Fragment {
//
//    Unbinder unbinder;
//    MyHomeWorkContentFragment contentFragment = new MyHomeWorkContentFragment();
//
//    @BindView(R.id.subject_recycle__list)
//    RecyclerView recyclerView;
//    @BindView(R.id.indicatorView)
//    IndicatorView indicatorView;
//
//
//    private List<String> mSubjectList = new ArrayList<>();
//
//    //定义了一个自定义的“构造方法”
//    public static MyHomeWorkSubjectFragment newInstance(){
//        MyHomeWorkSubjectFragment fragment = new MyHomeWorkSubjectFragment();
//        //fragment.setArguments(bundle);                                          //取出值
//        return fragment;
//    }
//
//
//    @Override
//    public void onAttach(Context context) {
//
//        super.onAttach(context);
//    }
//
//
//
//    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.fragment_a2_subject,container,false);
//        unbinder = ButterKnife.bind(this, view);
//        //EventBus.getDefault().register(this);
//
//        return view;
//    }
//
//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//        initSubjectList();
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this.getContext());
//
//        recyclerView.setLayoutManager(layoutManager);
//       // recyclerView.addItemDecoration(new DividerUtil());
//        SubjectAdapter subjectAdapter = new SubjectAdapter(mSubjectList);
//        recyclerView.setAdapter(subjectAdapter);
//
//        //EventBus.getDefault().post(mSubjectList.get(0));
//
//       // contentFragment.refresh(mSubjectList.get(0));
//        subjectAdapter.setmOonItemClickListener(new SubjectAdapter.onItemClickListener() {
//            @Override
//            public void onItemClick(View view, int position) {
//                indicatorView.openAnimator(view);
//               // EventBus.getDefault().post(mSubjectList.get(position));
//                contentFragment.refresh(mSubjectList.get(position));
//                Toast.makeText(Myapp.getInstances(), "点击了 "+ mSubjectList.get(position), Toast.LENGTH_SHORT).show();
//                //subjectAdapter.notifyDataSetChanged();
//
//            }
//        });
//
//
//    }
//
//    @Override
//    public void onDestroy() {
//        super.onDestroy();
//        unbinder.unbind();
//        //EventBus.getDefault().unregister(this);
//    }
//
//    private void initSubjectList() {
//        mSubjectList.add("语文");
//        mSubjectList.add("数学");
//        mSubjectList.add("英语");
//        mSubjectList.add("物理");
//        mSubjectList.add("化学");
//        mSubjectList.add("生物");
//
//        mSubjectList.add("物理");
//        mSubjectList.add("化学");
//        mSubjectList.add("生物");
//        mSubjectList.add("语文");
//        mSubjectList.add("数学");
//        mSubjectList.add("英语");
//        mSubjectList.add("物理");
//        mSubjectList.add("化学");
//        mSubjectList.add("生物");
//
//    }
//}
