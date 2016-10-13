package ruan.com.myrecyclerview;

import android.view.View;

/**
 * Created by Administrator on 2016/10/13.
 */
public interface RecyclerViewOnItemClick {

    /**
     * RecyclerView的点击事件
     *
     * @param view
     * @param recyclerItemData
     * @param position
     */
    public void onItem(View view, RecyclerItemData recyclerItemData, int position);

}
