package com.android_threefishes.threefish.a3fish;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;

import com.android_threefishes.threefish.a3fish.Adapter.MyRecyAdaper;
import com.android_threefishes.threefish.a3fish.Entity.CardInfEntity;
import com.android_threefishes.threefish.a3fish.Fragment.SpacesItemDecoration;

import java.util.List;

import static android.util.TypedValue.COMPLEX_UNIT_SP;

public class Other_Activity extends AppCompatActivity {

    private List<CardInfEntity>  usrCardObjectlist;
    private CardInfEntity mCardEntity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        initView();
    }

    private void initView(){
        Toolbar bar = (Toolbar) findViewById(R.id.toolbar_main_other);
        bar.setTitle("");
        bar.setNavigationIcon(R.drawable.ic_back);// setSupportActionBar(bar); 不能设置这个
        bar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        String content = getIntent().getStringExtra("title");
        String title = getContent(content)[0];
        TextView tv = (TextView) findViewById(R.id.title_text_listen);
        tv.setText(title);
        initDataList(getContent(content)[1]);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycleView_OtherAcitivity);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        MyRecyAdaper adapter = new MyRecyAdaper(usrCardObjectlist, this);

        int paddingnum = (int) TypedValue.applyDimension(COMPLEX_UNIT_SP,5, this.getResources().getDisplayMetrics());
        recyclerView.setPadding(paddingnum,paddingnum,paddingnum,paddingnum);
        recyclerView.addItemDecoration(new SpacesItemDecoration(paddingnum));
        recyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(new MyRecyAdaper.OnRecycleItemlistener() {
            @Override
            public void onItemClick(View view, int postion) {
                mCardEntity = usrCardObjectlist.get(postion);
                Log.e("Onclickstate: ", mCardEntity+"");
                Intent intent = new Intent(Other_Activity.this, DetailActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("object",mCardEntity);
                intent.putExtra("object", bundle);
                startActivity(intent);
            }
        });

    }

    /**
     * 根据drawer点击的item flag 初始化对应数据初始化对应数据
       @param flag
     */
    private void initDataList(String flag){
        switch (flag) {
            case "1":
                usrCardObjectlist = Untils.initArticleDate(Other_Activity.this);
                break;
            case "2":
                usrCardObjectlist = Untils.initSongDate(Other_Activity.this);
                break;
            case "3":
                usrCardObjectlist = Untils.initOriginDate(Other_Activity.this);
                break;
            case "4":
                usrCardObjectlist = Untils.initNewFoodData(Other_Activity.this);
                break;
            case "5":
                usrCardObjectlist = Untils.initTradFoodData(Other_Activity.this);
                break;
            case "6":
                usrCardObjectlist = Untils.initTimeTraveling(Other_Activity.this);
                break;
            case "7":
                usrCardObjectlist = Untils.initSpaceTraveling(Other_Activity.this);
                break;
        }
    }



    private String[] getContent(String content) {
        String[] array = content.split("\\ ");
       // getOtherContent(filename);
        return array;
    }

    /**
     * 根据文件名去解析内容数据
     * @param filename
     */
    /*private void getOtherContent(String filename) {
        String data = Untils.getJsonContentResource(this, filename);
        try {
            JSONArray array = new JSONArray(data);
            for(int i = 0; i<array.length();i++){
                JSONObject object = array.getJSONObject(i);
                mCardEntity.setImaDetailbackPath(object.getString("imaDetailbackPath"));
                mCardEntity.setImgSmallbackPath(object.getString("imgSmallbackPath"));
                mCardEntity.setContentText(object.getString("contentText"));
                mCardEntity.setContentDetailText(object.getString("contentDetailText"));
                mCardEntity.setFlags(object.getString("flags"));
                mCardEntity.setComments(object.getString("comments"));
                mCardEntity.setIsSupport(object.getInt("isSupport"));
                mCardEntity.setIsfollow(object.getInt("isfollow"));
                mCardEntity.setMusicFilePath(object.getInt("musicFilePath"));
                mCardEntity.setArtcleFlag(object.getString("artcleFlag"));
                mCardEntity.setUsrName(object.getString("usrName"));
                mCardEntity.setUsrImagePath(object.getString("usrImagePath"));
                mCardEntity.toString();
                usrCardObjectlist.add(mCardEntity);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }*/

}
