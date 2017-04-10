package com.android_threefishes.threefish.a3fish;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import com.android_threefishes.threefish.a3fish.Entity.CardInfEntity;
import com.bumptech.glide.Glide;

/**
 * 发现，精选点击进入的详情页
 */
public class DetailActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    private CardInfEntity mCardInfEntity;
    private TextView tv;
    private ImageView iv;
    private Handler handler = new Handler();
    private MediaPlayer mediaPlayer;
    private SeekBar bar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
        if (intent != null) {
            mCardInfEntity = (CardInfEntity) intent.getBundleExtra("object").getSerializable("object");
            if(mCardInfEntity != null){
                initView(mCardInfEntity);
            }else{
                Log.e("state: ", "null");
            }
        }
        initmedia();
    }

    private void initmedia(){
        if(mediaPlayer != null){
            bar = (SeekBar) findViewById(R.id.seekBar);
            bar.setMax(mediaPlayer.getDuration());
            final ImageView iv_begin = (ImageView) findViewById(R.id.detail_iv_begin);
            iv_begin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(mediaPlayer.isPlaying()){
                        iv_begin.setImageResource(R.drawable.ic_play1);
                        mediaPlayer.pause();
                    }else {
                        iv_begin.setImageResource(R.drawable.ic_pause1);
                        handler.post(start);
                    }

                }
            });
        }
    }

    Runnable start = new Runnable() {
        @Override
        public void run() {
            mediaPlayer.start();
            handler.post(updateSeekbar);
        }
    };

    Runnable updateSeekbar = new Runnable() {
        @Override
        public void run() {
            bar.setProgress(mediaPlayer.getCurrentPosition());
            handler.postDelayed(updateSeekbar, 1000);
        }
    };


    private void initView(final CardInfEntity mCardInfEntity) {

        LinearLayout seekbar_linear = (LinearLayout) findViewById(R.id.seekbar_linear);
        if(mCardInfEntity.getMusicFilePath() == 0) {
            seekbar_linear.setVisibility(LinearLayout.GONE);
        }else if(mCardInfEntity.getMusicFilePath() == 1){

        }else{
            mediaPlayer = MediaPlayer.create(DetailActivity.this,mCardInfEntity.getMusicFilePath());
        }

        iv = (ImageView) findViewById(R.id.detail_usrImag);
      //  iv.setImageResource(mCardInfEntity.getUsrImagePath());
        Glide.with(this).load(mCardInfEntity.getUsrImagePath()).into(iv);

        iv = (ImageView) findViewById(R.id.detail_iv_back);
        Glide.with(this).load(mCardInfEntity.getImaDetailbackPath()).into(iv);
      //  iv.setImageResource(mCardInfEntity.getImaDetailbackPath());

        final ImageView iv_artFlag = (ImageView) findViewById(R.id.detial_iv_isFollow);
        iv_artFlag.setImageResource(mCardInfEntity.getIsfollow());
        iv_artFlag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mCardInfEntity.getIsfollow() == R.drawable.ic_follower){
                    mCardInfEntity.setIsfollow(R.drawable.ic_follow);
                    iv_artFlag.setImageResource(mCardInfEntity.getIsfollow());

                }else {
                    mCardInfEntity.setIsfollow(R.drawable.ic_follower);
                    iv_artFlag.setImageResource(mCardInfEntity.getIsfollow());

                }
            }
        });

        iv = (ImageView) findViewById(R.id.detail_iv_artcleFlags);
        iv.setImageResource(mCardInfEntity.getArtcleFlag());
      //  Glide.with(this).load(mCardInfEntity.getIsfollow()).into(iv);

        tv = (TextView) findViewById(R.id.detail_tv_usrName);
        tv.setText(mCardInfEntity.getUsrName());

        tv = (TextView) findViewById(R.id.detail_tv_context);
        tv.setText(mCardInfEntity.getContentDetailText());

        tv = (TextView) findViewById(R.id.detail_tv_flags);
        tv.setText(mCardInfEntity.getFlags());

        final ImageView iv_heard = (ImageView) findViewById(R.id.detail_iv_heartbig);
        iv_heard.setImageResource(mCardInfEntity.getIsSupport());
        iv_heard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mCardInfEntity.getIsSupport() == R.drawable.heard11){
                    mCardInfEntity.setIsSupport(R.drawable.heard22);
                    iv_heard.setImageResource(mCardInfEntity.getIsSupport());
                    mCardInfEntity.setCommentsNum(mCardInfEntity.getCommentsNum() + 1);
                }else {
                    mCardInfEntity.setIsSupport(R.drawable.heard11);
                    iv_heard.setImageResource(mCardInfEntity.getIsSupport());
                    mCardInfEntity.setCommentsNum(mCardInfEntity.getCommentsNum() - 1);
                }
            }
        });

        tv = (TextView) findViewById(R.id.detail_tv_comments);
        tv.setText(mCardInfEntity.getComments());
    }

    @Override
    protected void onStop() {
        finish();
        super.onStop();
    }

    /**
     * seekbar 监听方法
     */
    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        // TODO Auto-generated method stub
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        // TODO Auto-generated method stub
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        mediaPlayer.seekTo(bar.getProgress());
    }

    @Override
    public void onBackPressed() {
        finish();
        if(mediaPlayer != null){
            mediaPlayer.pause();
            handler.removeCallbacks(start);
            handler.removeCallbacks(updateSeekbar);
        }

        super.onBackPressed();
    }
}
