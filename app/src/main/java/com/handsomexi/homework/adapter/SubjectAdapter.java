package com.handsomexi.homework.adapter;

import android.content.Context;
import android.support.annotation.NonNull;


import com.handsomexi.homework.R;
import com.handsomexi.homework.bean.subject;

import com.handsomexi.homework.view.IndicatorView;


import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SubjectAdapter extends  SimpleAdapter<subject>{



    @BindView(R.id.indicatorView)
    IndicatorView indicatorView;


    public SubjectAdapter(Context context,List<subject> subjectList){
        super(context,R.layout.subject_items,subjectList);

    }


    @Override
    protected void convert(BaseViewHolder viewHoder, subject item) {
//        ButterKnife.bind(this,viewHoder.itemView);

        viewHoder.getTextView(R.id.subject_list_title).setText(item.getSubject());
        //indicatorView.openAnimator(viewHoder.itemView);
    }

    private OnBinding onBinding;

    public void setOnBinding(OnBinding onBinding) {
        this.onBinding = onBinding;
    }

    public interface  OnBinding{
        void onBinding();
    }


//    public interface onItemClickListener{
//        void onItemClick(View view,int position);
//    }
//
//    public void setmOonItemClickListener(onItemClickListener onItemClickListener){
//        mOonItemClickListener = onItemClickListener;
//    }
//
//
//
//
//    static class ViewHolder  extends RecyclerView.ViewHolder implements View.OnClickListener{
//        private onItemClickListener mItemClickListener;
//
//        @BindView(R.id.subject_list_title)
//        TextView subjectTitle;
//
//        public ViewHolder(@NonNull View itemView,onItemClickListener listener) {
//            super(itemView);
//            //将全局的监听赋给接口
//            this.mItemClickListener = listener;
//            ButterKnife.bind(this,itemView);
//            subjectTitle.setOnClickListener(this);
//            //subjectTitle = itemView.findViewById(R.id.subject_list_title);
//
//        }
//        /**
//         * 实现OnClickListener接口重写的方法
//         * @param v
//         */
//        @Override
//        public void onClick(View v) {
//            if (mItemClickListener != null) {
//                mItemClickListener.onItemClick(v, getAdapterPosition());
//            }
//
//        }


  //  }


//    @NonNull
//    @Override
//    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
//        View view = LayoutInflater.from(mContext).inflate(R.layout.subject_items,viewGroup,false);
//        ViewHolder viewHolder = new ViewHolder(view,mOonItemClickListener);
//        return viewHolder;
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
//        viewHolder.subjectTitle.setText(mSubjectList.get(i));                //输出集合里 i 位置的科目
//
//
//    }


}
