package ruan.com.myrecyclerview;

import android.graphics.drawable.Drawable;

/**
 * Created by Ruan on 2016/10/13.
 * <p/>
 * <p/>
 * RecyclerItemData 存放数据的类
 */
public class RecyclerItemData {


    private Drawable RecyclerImage = null;
    private String RecyclerTitle = null;
    private Drawable RecyclerTitleImage = null;
    private String RecyclerSubTitle = null;
    private String RecyclerRightTitle = null;
    private Drawable RecyclerRightTitleImage = null;
    private String RecyclerRightSubTitle = null;
    private Drawable RecyclerRightSubTitleImage = null;
    private String RecyclerRightImageToText = null;
    private Drawable RecyclerRightImage = null;

    //Recyler高度
    private int RecyclerHeight = 0;
    private int RightImageWidth = 0;
    private int RightImageHeight = 0;

    //判断有没有空行 空行为true 否则为false
    private boolean isEmpty = false;
    //空行的高度
    private int RecyclerEmptyHeight = 0;
    //空行的颜色
    private int RecyclerEmptyColor = 0;


    public Drawable getRecyclerImage() {
        return RecyclerImage;
    }

    public void setRecyclerImage(Drawable recyclerImage) {
        RecyclerImage = recyclerImage;
    }

    public String getRecyclerTitle() {
        return RecyclerTitle;
    }

    public void setRecyclerTitle(String recyclerTitle) {
        RecyclerTitle = recyclerTitle;
    }

    public Drawable getRecyclerTitleImage() {
        return RecyclerTitleImage;
    }

    public void setRecyclerTitleImage(Drawable recyclerTitleImage) {
        RecyclerTitleImage = recyclerTitleImage;
    }

    public String getRecyclerSubTitle() {
        return RecyclerSubTitle;
    }

    public void setRecyclerSubTitle(String recyclerSubTitle) {
        RecyclerSubTitle = recyclerSubTitle;
    }

    public String getRecyclerRightTitle() {
        return RecyclerRightTitle;
    }

    public void setRecyclerRightTitle(String recyclerRightTitle) {
        RecyclerRightTitle = recyclerRightTitle;
    }

    public Drawable getRecyclerRightTitleImage() {
        return RecyclerRightTitleImage;
    }

    public void setRecyclerRightTitleImage(Drawable recyclerRightTitleImage) {
        RecyclerRightTitleImage = recyclerRightTitleImage;
    }

    public String getRecyclerRightSubTitle() {
        return RecyclerRightSubTitle;
    }

    public void setRecyclerRightSubTitle(String recyclerRightSubTitle) {
        RecyclerRightSubTitle = recyclerRightSubTitle;
    }

    public Drawable getRecyclerRightSubTitleImage() {
        return RecyclerRightSubTitleImage;
    }

    public void setRecyclerRightSubTitleImage(Drawable recyclerRightSubTitleImage) {
        RecyclerRightSubTitleImage = recyclerRightSubTitleImage;
    }

    public String getRecyclerRightImageToText() {
        return RecyclerRightImageToText;
    }

    public void setRecyclerRightImageToText(String recyclerRightImageToText) {
        RecyclerRightImageToText = recyclerRightImageToText;
    }

    public Drawable getRecyclerRightImage() {
        return RecyclerRightImage;
    }

    public void setRecyclerRightImage(Drawable recyclerRightImage) {
        RecyclerRightImage = recyclerRightImage;
    }

    public int getRecyclerHeight() {
        return RecyclerHeight;
    }

    public void setRecyclerHeight(int recyclerHeight) {
        RecyclerHeight = recyclerHeight;
    }

    public int getRightImageWidth() {
        return RightImageWidth;
    }

    public void setRightImageWidth(int rightImageWidth) {
        RightImageWidth = rightImageWidth;
    }

    public int getRightImageHeight() {
        return RightImageHeight;
    }

    public void setRightImageHeight(int rightImageHeight) {
        RightImageHeight = rightImageHeight;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public int getRecyclerEmptyHeight() {
        return RecyclerEmptyHeight;
    }

    public void setRecyclerEmptyHeight(int recyclerEmptyHeight) {
        RecyclerEmptyHeight = recyclerEmptyHeight;
    }

    public int getRecyclerEmptyColor() {
        return RecyclerEmptyColor;
    }

    public void setRecyclerEmptyColor(int recyclerEmptyColor) {
        RecyclerEmptyColor = recyclerEmptyColor;
    }
}
