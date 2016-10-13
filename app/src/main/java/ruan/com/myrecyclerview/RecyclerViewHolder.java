package ruan.com.myrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/10/13.
 */
public class RecyclerViewHolder extends RecyclerView.ViewHolder {


    public RelativeLayout RecyclerRelative;
    public ImageView RecyclerImage;
    public LinearLayout RcyclerTitleLinear;
    public LinearLayout RecyclerTitleLinear1 = null;
    public TextView RecyclerTitle;
    public ImageView RecyclerTitleImage;
    public TextView RecyclerSubTitle;
    public LinearLayout RecyclerRightLinear;
    public TextView RecyclerRightTitle;
    public ImageView RecyclerRightTitleImage;
    public TextView RecyclerRightSubTitle;
    public ImageView RecyclerRightSubTitleImage;
    public LinearLayout RecyclerRightLinear1;
    public TextView RecyclerRightImageToText;
    public ImageView RecyclerRightImage;

    public RecyclerViewHolder(View itemView) {
        super(itemView);

        RecyclerRelative = (RelativeLayout) itemView.findViewById(R.id.RecyclerRelative);
        RecyclerImage = (ImageView) itemView.findViewById(R.id.RecyclerImage);
        RcyclerTitleLinear = (LinearLayout) itemView.findViewById(R.id.RcyclerTitleLinear);
        RecyclerTitleLinear1 = (LinearLayout) itemView.findViewById(R.id.RecyclerTitleLinear1);
        RecyclerTitle = (TextView) itemView.findViewById(R.id.RecyclerTitle);
        RecyclerTitleImage = (ImageView) itemView.findViewById(R.id.RecyclerTitleImage);
        RecyclerSubTitle = (TextView) itemView.findViewById(R.id.RecyclerSubTitle);
        RecyclerRightLinear = (LinearLayout) itemView.findViewById(R.id.RecyclerRightLinear);
        RecyclerRightTitle = (TextView) itemView.findViewById(R.id.RecyclerRightTitle);
        RecyclerRightTitleImage = (ImageView) itemView.findViewById(R.id.RecyclerRightTitleImage);
        RecyclerRightSubTitle = (TextView) itemView.findViewById(R.id.RecyclerRightSubTitle);
        RecyclerRightSubTitleImage = (ImageView) itemView.findViewById(R.id.RecyclerRightSubTitleImage);
        RecyclerRightLinear1 = (LinearLayout) itemView.findViewById(R.id.RecyclerRightLinear1);
        RecyclerRightImageToText = (TextView) itemView.findViewById(R.id.RecyclerRightImageToText);
        RecyclerRightImage = (ImageView) itemView.findViewById(R.id.RecyclerRightImage);

    }
}
