package ruan.com.myrecyclerview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Created by Ruan on 2016/10/13.
 * <p/>
 * <p/>
 * RecyclerViewSetData 设置显示界面的类
 */
public class RecyclerViewSetData {

    private RecyclerViewHolder holder = null;
    private RecyclerItemData ItemData = null;
    private int position = 0;
    private RecyclerViewOnItemClick recyclerViewOnItemClick = null;
    private View view = null;

    public RecyclerViewSetData(RecyclerViewHolder holder, int position, RecyclerItemData recyclerItemData, RecyclerViewOnItemClick recyclerViewOnItemClick, View view) {
        this.holder = holder;
        this.ItemData = recyclerItemData;
        this.position = position;
        this.recyclerViewOnItemClick = recyclerViewOnItemClick;
        this.view = view;

        SetView();
    }


    private void SetView() {
        //设置左边的大图片
        if (SetVisiable(holder.RecyclerImage, ItemData.getRecyclerImage()))
            holder.RecyclerImage.setImageDrawable(ItemData.getRecyclerImage());

        //设置左边的标题文字
        if (SetVisiable(holder.RecyclerTitleLinear1, ItemData.getRecyclerTitle())) {
            holder.RecyclerTitle.setText(ItemData.getRecyclerTitle());
            //左边的小图标
            holder.RecyclerTitleImage.setImageDrawable(ItemData.getRecyclerTitleImage());
        }

        //设置左边的副标题文字
        if (SetVisiable(holder.RecyclerSubTitle, ItemData.getRecyclerSubTitle())) {
            holder.RecyclerSubTitle.setText(ItemData.getRecyclerSubTitle());
        }

        //设置右边的中间的文字
        if (SetVisiable(holder.RecyclerRightImageToText, ItemData.getRecyclerRightImageToText())) {
            holder.RecyclerRightImageToText.setText(ItemData.getRecyclerRightImageToText());
        }

        //设置右边的中间的图标
        if (SetVisiable(holder.RecyclerRightImage, ItemData.getRecyclerRightImage())) {
            holder.RecyclerRightImage.setImageDrawable(ItemData.getRecyclerRightImage());
        }

        //设置右下角的文字
//        if (ItemData.getRecyclerRightSubTitle() != null) {
        holder.RecyclerRightSubTitle.setText(ItemData.getRecyclerRightSubTitle());
//        }

        //设置右下角的图标
        if (SetVisiable(holder.RecyclerRightSubTitleImage, ItemData.getRecyclerRightSubTitleImage())) {
            holder.RecyclerRightSubTitleImage.setImageDrawable(ItemData.getRecyclerRightSubTitleImage());
        }

        //设置右上角的文字
//        if (ItemData.getRecyclerRightTitle() != null) {
        holder.RecyclerRightTitle.setText(ItemData.getRecyclerRightTitle());
//        }

        //设置右上角的图标
        if (SetVisiable(holder.RecyclerRightTitleImage, ItemData.getRecyclerRightTitleImage())) {
            holder.RecyclerRightTitleImage.setImageDrawable(ItemData.getRecyclerRightTitleImage());
        }

        //设置右边中间图标的大小
        if (ItemData.getRightImageHeight() != 0 && ItemData.getRightImageWidth() != 0) {
            holder.RecyclerRightImage.setLayoutParams(setLinearSize(ItemData.getRightImageWidth(), ItemData.getRecyclerHeight()));
        }

        //判断是不是空行
        if (ItemData.isEmpty()) {
            if (ItemData.getRecyclerEmptyColor() == 0)
                holder.RecyclerRelative.setBackgroundColor(0xffe9e9e9);
            else
                holder.RecyclerRelative.setBackgroundResource(ItemData.getRecyclerEmptyColor());
            //如果高度不为空则设置空行的高度
            if (ItemData.getRecyclerEmptyHeight() != 0) {
                holder.RecyclerRelative.setLayoutParams(setLinearSize(ViewGroup.LayoutParams.MATCH_PARENT, ItemData.getRecyclerHeight()));
            }
        }

        //处理点击事件
        SetClick();
    }


    private void SetClick() {
        //点击事件的接口不能为空
        holder.RecyclerRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (recyclerViewOnItemClick != null) {
                    recyclerViewOnItemClick.onItem(view, ItemData, position);
                }
            }
        });
    }


    private boolean SetVisiable(View view, Object object) {
        if (object == null) {
            view.setVisibility(View.GONE);
            return false;
        }
        view.setVisibility(View.VISIBLE);
        return true;
    }


    /**
     * 设置线性布局的大小
     *
     * @param width
     * @param height
     * @return
     */
    private LinearLayout.LayoutParams setLinearSize(int width, int height) {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.width = width;
        params.height = height;
        return params;
    }
}
