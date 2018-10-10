package com.handsomexi.homework.adapter;

import android.content.Context;
import android.widget.RatingBar;


import com.handsomexi.homework.R;
import com.handsomexi.homework.bean.HomeWorkBean;


import java.util.Date;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class ContentAdapter extends SimpleAdapter<HomeWorkBean> {

//    private List<HomeWorkBean> HomeWorkBeanList;
//    private HomeWorkBean HomeWorkBean;
//    private Context mContext;
      @BindView(R.id.review_rating)
       RatingBar reViewRating;
      @BindView(R.id.degree_of_difficult)
      RatingBar difficultRating;



    public ContentAdapter(Context context,List<HomeWorkBean> contentList){
       super(context,R.layout.content_items,contentList);
    }

    @Override
    protected void convert(BaseViewHolder viewHoder, HomeWorkBean item) {
        ButterKnife.bind(this,viewHoder.itemView);
        setRating(reViewRating,item.getReviews());
        setRating(difficultRating ,item.getDifficulty());

        viewHoder.getTextView(R.id.time).setText("时间："+ Long.toString(item.getTime()));
        viewHoder.getTextView(R.id.grade).setText("年级：" + item.getSchoolYear());
        viewHoder.getTextView(R.id.content_subject).setText("科目：" + item.getSubject());
        viewHoder.getTextView(R.id.reviews).setText("已经复习" + item.getReviews() + "次");

    }
    //设置星星控件
    public void setRating(RatingBar rating,int number){
        rating.setRating(number);
        rating.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

            }
        });

        }
    }

    // TODO: 2018/10/5 可以把Adapter 抽出来
//    static class ViewHolder extends RecyclerView.ViewHolder {
//
//        @BindView(R.id.content_picture)
//        ImageView contentPicture;
//        @BindView(R.id.time)
//        TextView time;
//        @BindView(R.id.content_subject)
//        TextView subject;
//        @BindView(R.id.grade)
//        TextView grage;
//        @BindView(R.id.degree_of_difficult)
//        RatingBar degree;
//        @BindView(R.id.reviews)
//        TextView reviews;
//        @BindView(R.id.review_rating)
//        RatingBar reviewRatingBar;


//        public ViewHolder(@NonNull View itemView) {
//            super(itemView);
//            ButterKnife.bind(this,itemView);
//        }
//    }





//
//    public void clear(){
//        HomeWorkBeanList.clear();
//        this.notifyItemRangeRemoved(0,HomeWorkBeanList.size());
//    }
//
//    public void addData(List<HomeWorkBean> datas){
//
//        addData(0,datas);
//    }
//
//    public void addData(int position,List<HomeWorkBean> datas){
//        if(datas !=null && datas.size()>0) {
//
//            this.HomeWorkBeanList.addAll(datas);
//            this.notifyItemRangeChanged(position, datas.size());
//        }
//    }
//
//
//    @NonNull
//    @Override
//    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
//        View view = LayoutInflater.from(mContext).inflate(R.layout.content_items,viewGroup,false);
//        ViewHolder viewHolder = new ViewHolder(view);
//        return viewHolder;
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
//       //提取信息
//        HomeWorkBean = HomeWorkBeanList.get(i);
//        //把信息都放到控件上
//        // TODO: 2018/10/6 有时间把这些字符串的警告消除 https://blog.csdn.net/xiabing082/article/details/54092357
//        viewHolder.subject.setText("科目：" + HomeWorkBean.getSubject());
//        viewHolder.time.setText("时间："+HomeWorkBean.getTime());
//        viewHolder.grage.setText( "年级：" + HomeWorkBean.getSchoolYear());
//        viewHolder.reviews.setText("已经复习"+HomeWorkBean.getReviews()+"次");
//
//        /*Iterator iterator = myHomeWorkBeanList.iterator();
//        while(iterator.hasNext()){
//            myHomeWorkBean = (MyHomeWorkBean) iterator.next();
//
//        }*/
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return HomeWorkBeanList.size();
//    }
//

