package ruan.com.myrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Ruan on 2016/10/13.
 * <p/>
 * RecyclerView的适配器
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    private ArrayList<RecyclerItemData> list = null;
    private View view = null;

    public RecyclerViewAdapter(ArrayList<RecyclerItemData> list) {
        this.list = list;
    }


    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        this.view = parent;
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycleitem, null);
        //加载数据
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        //设置显示的数据
        new RecyclerViewSetData(holder, position, list.get(position), recyclerViewOnItemClick, view);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    /**
     * 增加一项
     *
     * @param recyclerItemData
     */
    public void addItem(RecyclerItemData recyclerItemData) {
        list.add(recyclerItemData);
        this.notifyDataSetChanged();
    }


    /**
     * 修改指定一项的内容
     *
     * @param recyclerItemData
     * @param position
     */
    public void SetItem(RecyclerItemData recyclerItemData, int position) {
        list.set(position, recyclerItemData);
        this.notifyItemChanged(position, recyclerItemData);
    }

    /**
     * 移除一项
     *
     * @param position 标识
     */
    public void RemoveItem(int position) {
        list.remove(position);
        this.notifyItemRemoved(position);
    }

    /**
     * 更新整个RecyclerView的布局
     *
     * @param list
     */
    public void RefreshItem(ArrayList<RecyclerItemData> list) {
        this.list = list;
        this.notifyDataSetChanged();
    }


    private RecyclerViewOnItemClick recyclerViewOnItemClick = null;

    /**
     * RecyclerView点击事件
     *
     * @param recyclerViewOnItemClick
     */
    public void setOnItemClick(RecyclerViewOnItemClick recyclerViewOnItemClick) {
        this.recyclerViewOnItemClick = recyclerViewOnItemClick;
    }
}
