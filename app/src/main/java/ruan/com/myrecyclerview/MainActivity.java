package ruan.com.myrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclear = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<RecyclerItemData> list = new ArrayList<>();
        //专门储存RecyclerView数据
        RecyclerItemData recyclerItemData = new RecyclerItemData();
        recyclerItemData.setRecyclerImage(getResources().getDrawable(R.mipmap.ic_launcher));
        recyclerItemData.setRecyclerTitle("111111111111");
        recyclerItemData.setRecyclerSubTitle("aaa");
        recyclerItemData.setRecyclerRightTitle("22222");
        list.add(recyclerItemData);

        recyclear = (RecyclerView) findViewById(R.id.recyclear);
        recyclear.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclear.setLayoutManager(linearLayoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(list);
        adapter.setOnItemClick(new RecyclerViewOnItemClick() {
            @Override
            public void onItem(View view, RecyclerItemData recyclerItemData, int position) {
                if (view.getId() == R.id.recyclear) {
                    Log.e("Ruan", position + "----");
                }
            }
        });
        recyclear.setAdapter(adapter);
    }
}
